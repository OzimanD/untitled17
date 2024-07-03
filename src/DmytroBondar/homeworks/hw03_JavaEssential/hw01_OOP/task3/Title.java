package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task3;

public class Title {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show() {
        System.out.println("Title: " + getTitle());
    }
}
