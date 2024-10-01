public class Admin extends User {
    public Admin(String userId, String userName, String password) {
        super(userId, userName, password);
    }

    public void showManifest(Airplane airplane) {
        System.out.println("Manifest List:");
        // Display reserved seats and corresponding passenger names
        // Iterate over seats and print reservations
    }
}
