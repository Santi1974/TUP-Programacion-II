package punto10;

public class TextBook extends Book{

    private String course;

    public TextBook(String title, String author, String course) {
        super(title, author);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void showInformation() {
        System.out.println("TEXT BOOK:");
        super.showInformation();
        System.out.println("Course: " + course);
    }
}