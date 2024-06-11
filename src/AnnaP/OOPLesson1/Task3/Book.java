package AnnaP.OOPLesson1.Task3;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book info");
        // inputting Title
        System.out.println("Title ");
        Title title = new Title();
        title.title =scanner.next();
        // inputting Author
        Author author = new Author();
        System.out.println("Author First name");
        author.setFirstName(scanner.next());

        System.out.println("Author Last name");
        author.setLastName(scanner.next());
        // inputting Content
        Content content = new Content();
        System.out.println("Content of the book");
        content.content = scanner.next();

        System.out.println("would you like to see the book info?");
        String answer = scanner.next();

        if (answer.equals("yes")){
            author.show();
            title.show();
            content.show();
        } else {
            System.out.println("thank you!");
        }




    }
}
