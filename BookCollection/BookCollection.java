/**
 * Created by anjalimalik
 */
import java.util.ArrayList;

public class BookCollection{


    public static void main(String args[]){
        PaperBook pb1 = new PaperBook("Harry Potter and the Chamber of Secrets", 251, "JKRowling", 3);
        PaperBook pb2 = new PaperBook("Harry Potter and the Prisoner of Azhkaban", 317, "JKRowling", 50);
        pb1.changeBookmark(10);
        pb2.changeBookmark(-10);


        eBook eb1 = new eBook("Algorithms", 500, "Thomas Cormen", 30);
        eBook eb2 = new eBook("Data Structures", 430, "MA Weiss", 25);
        eb1.addComments(2,"Look this up");
        eb1.addComments(2,"More on page 4 ");
        eb1.addComments(4,"Defined in page 2");

        eb2.addComments(5,"Google this!");
        eb2.addComments(600,"This too!");

        ArrayList<Book> myCollection = new ArrayList<Book>();
        myCollection.add(pb1);
        myCollection.add(pb2);
        myCollection.add(eb1);
        myCollection.add(eb2);

        for(int i = 0; i < myCollection.size(); i++) {
            Book b = myCollection.get(i);
            b.printBookDetails();
        }
    }
}

