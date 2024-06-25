package DmytroBondar.oop.books;

/*
Автор
Жанр
Название
Тираж
*/
public class Book {
    private String author;
    private Genres genre;
    private String title;
    private int circulation;

    public Book(String author, Genres genre, String title, int circulation) {
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.circulation = circulation;
    }

    public String getAuthor() {
        return author;
    }

    public Genres getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getCirculation() {
        return circulation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre=" + genre +
                ", title='" + title + '\'' +
                ", circulation=" + circulation +
                '}';
    }
}
