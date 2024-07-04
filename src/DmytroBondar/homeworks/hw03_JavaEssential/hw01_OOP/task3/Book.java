package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task3;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        title.setTitle("Title");
        title.show();

        Author author = new Author();
        author.setFirstName("First name");
        author.setLastName("Last name");
        author.show();

        Content content = new Content();
        content.setContent("Content");
        content.show();
    }
}
