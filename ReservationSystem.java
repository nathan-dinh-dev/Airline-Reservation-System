import java.util.*;
import java.io.*;

public class ReservationSystem {

    // Declare variables
    private static Airplane airplane = new Airplane();
    private static Map<String, User> users = new HashMap<>();
    private static final List<String> adminIds = Arrays.asList("admin1", "admin2"); // Example admin ids
    private static String reservationsFile;
    private static String usersFile;
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java ReservationSystem <ReservationFile> <UserFile>");
            return;
        }

        reservationsFile = args[0];
        usersFile = args[1];

        File reservationFile = new File(reservationsFile);
        File userFile = new File(usersFile);

        // Create new file if files does not exist
        // Otherwise, load those files from system
        if (!reservationFile.exists() || !userFile.exists()) {
            try {
                reservationFile.createNewFile();
                userFile.createNewFile();
                System.out.println(reservationsFile + " and " + usersFile + " are now created.");
            } catch (IOException e) {
                System.out.println("Error creating files: " + e.getMessage());
            }
        } else {
            loadUsers(reservationsFile);
            loadReservations(usersFile);
            System.out.println("Existing Reservations and Users are loaded.");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Are you a [P]ublic User or an [A]dmin?");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("P")) {
                handleCustomerViewingAction(scanner);
            } else if (input.equals("A")) {
                handleAdmin(scanner);
            } else {
                System.out.println("Invalid user type. Please try again.");
            }
        }
    }

    private static void loadUsers(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                users.put(parts[0], new User(parts[0], parts[1], parts[2]));
            }
        } catch (IOException e) {
            System.out.println("No users found. Making an empty user list.");
        }
    }

    private static void loadReservations(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                airplane.reserveSeat(parts[0], parts[1]);
            }
        } catch (IOException e) {
            System.out.println("No reservations found. Making an empty reservation list.");
        }
    }

    private static void handleCustomerViewingAction(Scanner scanner) {
        System.out.println("[S]ign Up or [L]og In?");
        String action = scanner.nextLine().toUpperCase();

        if (action.equals("S")) {
            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            users.put(userId, new User(userId, password, name));
            System.out.println("Sign-up successful. Please log in.");

        } else if (action.equals("L")) {
            boolean isLoggedIn = false;
            int count = 0;
            while (!isLoggedIn) {
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                User user = users.get(userId);
                if (user != null && user.isAuthenticated(password)) {
                    isLoggedIn = true;
                    CustomerMenu(scanner, user);
                } else {
                    System.out.println("Invalid credentials. Please try again.");
                    System.out.println();
                    count++;
                }

                if(count == 2)
                    break;
            }
        }
    }

    private static void CustomerMenu(Scanner scanner, User user) {
        String option;
        do {
            System.out.println("Check [A]vailability  Make [R]eservation  [C]ancel Reservation   [V]iew Reservations  [D]one");
            option = scanner.nextLine().toUpperCase();

            switch (option) {
                case "A":
                    airplane.showAvailability();
                    break;
                case "R":
                    makeReservation(scanner, user);
                    break;
                case "C":
                    cancelReservation(scanner, user);
                    break;
                case "V":
                    viewReservations(user);
                    break;
                case "D":
                    System.out.println("Transaction is done. Returning to user selection.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!option.equals("D"));
    }

    private static void makeReservation(Scanner scanner, User user) {
        while (true) {
            System.out.print("Enter seat number to reserve (example `1K` for a first-class seat): ");
            String seatNumber = scanner.nextLine();

            if (!airplane.isSeatAvailable(seatNumber)) {
                System.out.println("Seat is not available or invalid. Please try again.");
            } else {
                Seat seat = airplane.getSeat(seatNumber);
                System.out.println("Seat " + seatNumber + " (" + seat.getSeatType() + ", $" + seat.getPrice() + ") is available. Confirm reservation? (Y/N)");
                String confirm = scanner.nextLine().toUpperCase();
                if (confirm.equals("Y")) {
                    airplane.reserveSeat(seatNumber, user.getUserId());
                    System.out.println("Reservation confirmed for seat " + seatNumber);
                    System.out.println();
                } else {
                    System.out.println("Reservation Cancel.");
                    System.out.println();
                }
            }

            System.out.print("Do you want to make another reservation? (Y/N): ");
            String another = scanner.nextLine().toUpperCase();
            if (another.equals("N")) {
                break;
            }
        }
    }

    private static void cancelReservation(Scanner scanner, User user) {
        List<String> reservations = airplane.getUserReservations(user.getUserId());
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        System.out.println("Your reservations: " + reservations);
        System.out.print("Enter seat number to cancel: ");
        String cancelSeatNumber = scanner.nextLine();

        boolean seatFound = false;

        for (String reservation : reservations) {
            String[] parts = reservation.split(" "); // Split the reservation entry to extract the seat number
            String seatNumber = parts[0];
            if (seatNumber.equals(cancelSeatNumber)) {
                airplane.cancelReservation(cancelSeatNumber);
                System.out.println("Reservation for seat " + cancelSeatNumber + " has been canceled.");
                seatFound = true;
                break;
            }
        }

        if (!seatFound) {
            System.out.println("Invalid seat number. Please try again.");
        }
    }

    private static void viewReservations(User user) {
        List<String> reservations = airplane.getUserReservations(user.getUserId());
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        int total = reservations.stream()
                .mapToInt(seat -> Integer.parseInt(seat.split("\\$")[1]))
                .sum();
        System.out.println("Name: " + user.getName());
        System.out.println("Seats: " + String.join(", ", reservations));
        System.out.println("Total Balance Due: $" + total);
    }

    private static void handleAdmin(Scanner scanner) {
        System.out.print("Enter Admin ID: ");
        String adminId = scanner.nextLine();
        if (adminIds.contains(adminId)) {
            String option;
            do {
                System.out.println("Show [M]anifest list  E[X]it");
                option = scanner.nextLine().toUpperCase();

                switch (option) {
                    case "M":
                        Admin.showManifest(airplane);
                        break;
                    case "X":
                        System.out.println("System data saved. Exiting the system.");
                        saveData();
                        System.exit(0); // Exit the program
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (!option.equals("X"));
        } else {
            System.out.println("Invalid Admin ID.");
        }
    }
        private static void saveData() {
            try (PrintWriter userWriter = new PrintWriter(new FileWriter(usersFile));
                 PrintWriter resWriter = new PrintWriter(new FileWriter(reservationsFile))) {

                // Save users
                for (User user : users.values()) {
                    userWriter.println(user.getUserId() + "," + user.getPassword() + "," + user.getName());
                }

                // Save reservations
                for (Seat seat : airplane.getAllSeats()) {
                    if (seat.isReserved()) {
                        resWriter.println(seat.getSeatNumber() + "," + seat.getReservedBy());
                    }
                }

            } catch (IOException e) {
                System.out.println("Error saving data: " + e.getMessage());
            }
        }

}
