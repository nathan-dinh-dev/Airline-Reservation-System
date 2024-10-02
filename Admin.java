public class Admin extends User {
    public Admin(String userId, String userName, String password) {
        super(userId, userName, password);
    }

    public static void showManifest(Airplane airplane) {
        System.out.println("Manifest List:");

        System.out.println("\nFirst Class:");
        printManifestForClass(airplane,"First");

        System.out.println("\nEconomy Plus:");
        printManifestForClass(airplane, "EPlus");

        System.out.println("\nEconomy:");
        printManifestForClass(airplane, "Economy");
    }

    private static void printManifestForClass(Airplane airplane, String seatType) {
        for (Seat seat : airplane.getAllSeats()) {
            if (seat.isReserved() && seat.getSeatType().equals(seatType)) {
                System.out.println(seat.getSeatNumber() + ": " + seat.getReservedBy());
            }
        }
    }
}
