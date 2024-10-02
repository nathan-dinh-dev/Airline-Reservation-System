public class User {

    // Declare variables
    private String userId;
    private String password;
    private String name;

    // Constructors
    public User(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAuthenticated(String password) {
        return this.password.equals(password);
    }
}
