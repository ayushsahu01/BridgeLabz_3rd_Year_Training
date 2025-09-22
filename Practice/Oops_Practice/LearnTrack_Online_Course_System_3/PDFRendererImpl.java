package LearnTrack_Online_Course_System_3;

public class PDFRendererImpl implements CourseContentRenderer{
    public void renderContent(String content) {
        System.out.println("Displaying PDF content: " + content);
    }
}
