/**
 * Admin class represents an administrator user in the airline reservation system.
 * It inherits from the User class and provides functionality specific to administrators,
 * such as displaying a manifest of all reserved seats.
 *
 * Programmed by: Nathan Dinh
 * Date: 10/02/2024
 */
public class Admin extends User {

    /**
     * Constructs an Admin object with the specified user ID, user name, and password.
     *
     * @param userId   The ID of the administrator.
     * @param userName The name of the administrator.
     * @param password The password of the administrator.
     */
    public Admin(String userId, String userName, String password) {
        super(userId, userName, password);
    }

    /**
     * Displays the manifest list of all reserved seats in the airplane.
     *
     * @param airplane The Airplane object containing the seat information.
     */
    public static void showManifest(Airplane airplane) {
        System.out.println("Manifest List:");

        System.out.println("\nFirst Class:");
        printManifestForClass(airplane,"First");

        System.out.println("\nEconomy Plus:");
        printManifestForClass(airplane, "EPlus");

        System.out.println("\nEconomy:");
        printManifestForClass(airplane, "Economy");
    }

    /**
     * Displays the manifest for seats of a specific type that are reserved.
     *
     * @param airplane The Airplane object containing the seat information.
     * @param seatType The type of seat to display ("First", "EPlus", "Economy").
     */
    private static void printManifestForClass(Airplane airplane, String seatType) {
        for (Seat seat : airplane.getAllSeats()) {
            if (seat.isReserved() && seat.getSeatType().equals(seatType)) {
                System.out.println(seat.getSeatNumber() + ": " + seat.getReservedBy());
            }
        }
    }
}
