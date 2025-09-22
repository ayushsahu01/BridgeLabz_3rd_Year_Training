package LearnTrack_Online_Course_System_3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String title;
    private String description;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Course(int courseId, String title, Teacher teacher) {
        this(courseId, title, "No description", teacher);
    }

    public Course(int courseId, String title, String description, Teacher teacher) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.teacher = teacher;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showCourseInfo() {
        System.out.println("Course: " + title + " by " + teacher.name);
        System.out.println("Description: " + description);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("  - " + s.name);
        }
    }

    public String getTitle() {
        return title;
    }
}
