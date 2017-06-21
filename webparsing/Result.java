import java.io.Serializable;
/**
 * Created by Ali Mandviwala on 4/16/2017.
 */
public class Result extends Object implements Serializable, Comparable<Result> {
    public int score;
    public String url;
    public int urlID;
    public static final long serialVersionUID = -938761094876384658L;
    Result(String url, int urlID){
        this.url = url;
        this.urlID = urlID;
        this.score=1;
    }
    public int compareTo(Result candidate){
        if(this.score<(candidate.getScore())){
            return 1;
        }
        else if(this.score>(candidate.getScore())){
            return -1;
        }
        else
            return 0;
    }
    public boolean equals(Object obj){
        Result obj1 = (Result) obj;
        if((this.urlID) == (obj1.getURLID())){
            return true;
        }
        else{
            return false;
        }
    }
    public int getScore(){

        return this.score;
    }
    public String getURL(){
        return this.url;
    }
    public int getURLID(){
        return this.urlID;
    }
    public void incrementScore(){
        ++this.score;
    }
    public void updateScore(int Score){
        this.score = this.score+Score;
    }
}
