import java.io.Serializable;
public class Page extends Object implements Serializable, Comparable<Page> {
   public static final long serialVersionUID =-1827677255104766839L ;
   String url;
   private int urlID;
   public Page(String url, int urlID) {
      this.url = url;
      this.urlID = urlID;
   }
   public int getURLID() {
      return this.urlID;
   }
   public String getURL() {
      return this.url;
   }
   public boolean equals(Object obj) {
      Page obj1 = (Page) obj;
      if(this.url.equals(obj1.getURL()) || (this.urlID==obj1.getURLID())){
         return true;
      }
      else{
         return false;
      }
   }
   public int compareTo(Page candidate) {
      int candidate_ID = candidate.getURLID();
      if (this.urlID < candidate_ID) {
         return -1;
      }
      else if(this.urlID == candidate_ID){
         return 0;
      }
      else{
         return 1;
      }
   }
}