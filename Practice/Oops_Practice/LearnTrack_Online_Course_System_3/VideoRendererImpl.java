package LearnTrack_Online_Course_System_3;

public class VideoRendererImpl implements CourseContentRenderer{
    public void renderContent(String content) {
        System.out.println("Playing video content: " + content);
    }
}
