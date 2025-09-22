package LearnTrack_Online_Course_System_3;

public class User {
    protected int userId;
    protected String name;
    protected String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getDetails() {
        return "ID: " + userId + ", Name: " + name + ", Email: " + email;
    }
}
