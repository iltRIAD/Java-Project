import java.lang.*;

public class User {
    private String username;
    private String password;
    private String meal;

    public User(String username, String password, String meal) {
        this.username = username;
        this.password = password;
        this.meal = meal;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMeal() {
        return meal;
    }
}