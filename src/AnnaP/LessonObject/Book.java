package AnnaP.LessonObject;

public class Book {
    private String author;
    private int pages;
    private int edition;
    private int year;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                ", edition=" + edition +
                ", year=" + year +
                '}';
    }

    public Book(String author, int pages, int edition, int year) {
        this.author = author;
        this.pages = pages;
        this.edition = edition;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }






}


//Автор
//        Количество страниц
//        Тираж
//        Год издания
//
//        Вывести данные о книгах, в кото-
//        рых количество страниц больше
//
//        150.