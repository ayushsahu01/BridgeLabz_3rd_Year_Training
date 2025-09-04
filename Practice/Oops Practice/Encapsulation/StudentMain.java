public class StudentMain {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.setStudentDetails();
        service.displayStudentDetails();
    }
}
