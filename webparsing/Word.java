import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Word extends Object implements Serializable {
   private String word;
   private List<Integer> postings = new ArrayList<Integer>();
   public static final long serialVersionUID =-3696191086353573895L;
   public Word(String word, int urlID){
      this.word = word;
      postings.add(urlID);
   }
   public void addURLID(int urlID){
      this.postings.add(urlID);
   }
   public boolean equals(Object obj){
      Word obj1 = (Word) obj;
      if(this.word.equals(obj1.getWord())){
         return true;
      }
      else{
         return false;
      }
   }
   public List<Integer> getList(){
      return this.postings;
   }
   public String getWord(){
      return this.word;
   }
}