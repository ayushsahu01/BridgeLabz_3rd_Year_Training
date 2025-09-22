package LearnTrack_Online_Course_System_3;

public class Teacher extends User{
    public Teacher(int userId, String name, String email) {
        super(userId, name, email);
    }

    public Course createCourse(int id, String title, String description) {
        return new Course(id, title, description, this);
    }
}
