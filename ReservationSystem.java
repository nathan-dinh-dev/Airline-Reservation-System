import java.util.*;
import java.io.*;

public class ReservationSystem {

    public static void main(String[] args) {
        // First, load users from file when starting
        loadUsers();

        // Second, load reservations
        loadReservations();
    }

    private static void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            string line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                users.put(parts[0], new User(parts[0], parts[1], parts[2]))
            }
        } catch (IOException e) {
            System.out.println("No user file found. Starting with empty user list");
        }
    }
}
