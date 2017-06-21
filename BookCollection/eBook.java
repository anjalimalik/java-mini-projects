/**
 * Created by anjalimalik
 
 */
public class eBook extends Book {
    float size;
    String[] comments;

    public eBook(String name, int pages, String author, float size) {
        super(name, pages, author);
        this.size = size;

        comments = new String[pages];

        for(int i = 0; i < pages; i++) {
            comments[i] = "";
        }

    }

    public void addComments(int page, String newComment) {

        if((page < 0) || (page > pages)){
            System.out.println("Cannot insert comment! Page " + page + " doesn't exist in book Data Structures");
        } else {
            comments[page] = newComment + ". " + comments[page];
            System.out.println("Comment added to page " + page + " of Data Structure");
        }

    }

    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Book Size : " + size + "mb");

        for(int i = 0; i < pages; i++) {
            if(comments[i].equals("") == false) {
                System.out.println("Page " + i + " " + comments[i]);
            }
        }
    }

}
