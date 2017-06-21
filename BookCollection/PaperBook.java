/**
 * Created by anjalimalik
 
 */
public class PaperBook extends Book {

    int bookmark;

    public PaperBook(String name, int pages, String author, int bookmark) {
        super(name, pages, author);
        this.bookmark = bookmark;
    }

    public void changeBookmark(int newBookmark) {
        if((newBookmark < 0) || (newBookmark > this.pages)) {
            System.out.println("Cannot insert bookmark! Page " + newBookmark + " doesn't exist in book " + name);
        } else {
            this.bookmark = newBookmark;
            System.out.println("Bookmark changed to page " + bookmark + " in " + name);
        }

    }

    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Your last bookmark was at page " + bookmark);
    }
}
