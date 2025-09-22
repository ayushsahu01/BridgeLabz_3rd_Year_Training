package LearnTrack_Online_Course_System_3;

public class HTMLRendererImpl implements CourseContentRenderer{
    public void renderContent(String content) {
        System.out.println("Rendering HTML page: " + content);
    }
}
