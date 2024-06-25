package DmytroBondar.oop.books;

import java.util.ArrayList;
import java.util.List;

//вывести данные о книгах, тираж которых не превышает 10000 экземпляров.
public class Main {
    public static void main(String[] args) {
        int circulation = 10000;
        List<Book> books = new ArrayList<>();
        books.add(new Book("Joshua Bloch", Genres.SCIENCE, "Effective Java", 9000));
        books.add(new Book("Lauren", Genres.FANTASY, "The Dangerous Ones", 5000));
        books.add(new Book("Lisa", Genres.SCIENCE, "Alien Earths", 100000));
        books.add(new Book("Rene", Genres.ART, "Music and Mind", 5555));
        books.add(new Book("James", Genres.COMICS, "Universal Monsters", 777));
        books.add(new Book("Author5", Genres.ROMANCE, "title5", 99999));

        Main main = new Main();
        main.printResult(main.getCirculationLess(books, circulation));
    }

    public List<Book> getCirculationLess(List<Book> books, int circulation) {
        List<Book> bookListResult = new ArrayList<>();
        for (Book book : books){
            if (circulation > book.getCirculation())
                bookListResult.add(book);
        }
        return bookListResult;
    }

    public void printResult(List<Book> books) {
        for (Book book : books)
            System.out.println(book);
    }
}
