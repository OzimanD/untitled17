package AnnaP.LessonObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Anna Pozina", 200, 200, 2020);
        Book book2 = new Book("Lina Kostenko", 100, 300, 1999);
        Book book3 = new Book("Taras Shechenko", 900, 320, 1950);
        Book book4 = new Book("Araki", 100, 400, 2000);
        Book book5 = new Book("Haruki Murakami", 50, 500, 2024);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Main main = new Main();

        main.showResult(main.bigBooks(books));

    }

    public List<Book> bigBooks(List<Book> books) {
        List<Book> bigBooks = new ArrayList<Book>();
        for (int i = 0; i < books.size(); i++) {
            int countPages = books.get(i).getPages();

            if (countPages > 150) {
                bigBooks.add(books.get(i));
            }
        }
        return bigBooks;
    }

    public void showResult(List<Book> books){
        System.out.println("These books have a lot of pages: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}

//
//Автор
//        Количество страниц
//        Тираж
//        Год издания
//
//        Вывести данные о книгах, в кото-
//        рых количество страниц больше
//
//        150.