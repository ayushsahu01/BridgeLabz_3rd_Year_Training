package LearnTrack_Online_Course_System_3;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(int userId, String name, String email) {
        super(userId, name, email);
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("  - " + c.getTitle());
        }
    }
}
