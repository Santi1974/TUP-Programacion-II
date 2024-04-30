package punto10;

public class ColombianUniversityTB extends TextBook {

    private String school;

    public ColombianUniversityTB(String title, String author, String course, String school) {
        super(title, author, course);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("School: " + school);
    }
}
