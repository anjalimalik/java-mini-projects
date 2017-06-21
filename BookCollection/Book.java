/**
 * Created by anjalimalik
 */
public class Book {
    String name;
    int pages;
    String author;

    public Book(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public void printBookDetails() {

        System.out.println("Name : " + name + "\nNo. of pages : " + pages + "\nAuthor : " + author);

    }
}
