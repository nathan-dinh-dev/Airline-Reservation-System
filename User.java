/**
 * User class represents a user in the airline reservation system.
 * It stores user information such as user ID, password, and name,
 * and provides methods for user authentication and accessing user details.
 *
 * Programmed by: Nathan Dinh
 * Date: 10/02/2024
 */
public class User {

    // Declare variables
    private String userId;
    private String password;
    private String name;

    // Constructors
    /**
     * Constructs a User object with the specified user ID, password, and name.
     *
     * @param userId   The ID of the user.
     * @param password The password of the user.
     * @param name     The name of the user.
     */

    public User(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    /**
     * Returns the user ID of the user.
     *
     * @return The user ID of the user.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Returns the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the password of the user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Checks if the user's password match in system.
     *
     * @param password The password to be verified.
     * @return True if the password matches the user's system password, false otherwise.
     */
    public boolean isAuthenticated(String password) {
        return this.password.equals(password);
    }
}
