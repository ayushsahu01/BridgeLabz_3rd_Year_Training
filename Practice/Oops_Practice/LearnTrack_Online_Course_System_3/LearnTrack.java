package LearnTrack_Online_Course_System_3;

public class LearnTrack {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Dr. Mehta", "mehta@learntrack.com");

        Course javaCourse = new Course(101, "Java Programming", t1);
        Course webCourse = new Course(102, "Web Development", "Learn HTML, CSS, JS", t1);

        Student s1 = new Student(201, "Ayush Sahu", "ayush@mail.com");
        Student s2 = new Student(202, "Anuj Agarwal", "anuj@mail.com");

        s1.enroll(javaCourse);
        s2.enroll(javaCourse);
        s2.enroll(webCourse);

        javaCourse.showCourseInfo();
        webCourse.showCourseInfo();

        CourseContentRenderer video = new VideoRendererImpl();
        CourseContentRenderer pdf = new PDFRendererImpl();
        CourseContentRenderer html = new HTMLRendererImpl();

        video.renderContent("Java OOP Concepts");
        pdf.renderContent("Web Dev Notes.pdf");
        html.renderContent("<h1>Welcome to LearnTrack</h1>");
    }
}
