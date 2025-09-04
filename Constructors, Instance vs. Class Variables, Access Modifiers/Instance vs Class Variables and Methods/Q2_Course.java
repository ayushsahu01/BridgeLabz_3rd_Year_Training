public class Q2_Course {
    // Instance variables
    String courseName;
    int duration;   // in months
    double fee;

    // Class variable (common for all courses)
    static String instituteName = "SkillVerse Institute";

    // Constructor
    public Q2_Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute   : " + instituteName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " months");
        System.out.println("Fee         : ₹" + fee);
        System.out.println("-----------------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("✅ Institute name updated to: " + instituteName);
        System.out.println("=============================");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating courses
        Q2_Course c1 = new Q2_Course("Java Programming", 6, 15000);
        Q2_Course c2 = new Q2_Course("Web Development", 4, 12000);
        Q2_Course c3 = new Q2_Course("Data Science", 8, 25000);

        // Display courses with default institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        // Update institute name for all courses
        Q2_Course.updateInstituteName("Tech Academy");

        // Display courses again (with updated institute name)
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
