import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Created by Ali Mandviwala on 4/16/2017.
 */
public class Search extends Object{
    static List<Page> pageList;
    private String pageListFile;
    static List<Result> resultSet;
    public static List<Word> wordList;
    private String wordListFile;
    Search(String wordListFile, String pageListFile){
        //this.nullCheck();
        this.wordListFile = wordListFile;
        this.pageListFile = pageListFile;
        setup(wordListFile, pageListFile);
        resultSet = Collections.synchronizedList(new ArrayList<Result>());
    }
    public synchronized List<Result> executeQuery(String query){
        //this.sort();
        try{
            //resultSet = Collections.synchronizedList(new ArrayList<Result>());
            this.nullCheck();
            String query_lc = query.toLowerCase();
            String terms1[] = query_lc.split(" ");
            //List<String> terms = new ArrayList(Arrays.asList(query.split(" ")));
            Thread[] threads = new Thread[5];
            int start = 0;
            int end = (wordList.size()/5)+(wordList.size()%5);
            //for(int l=0; l<terms.size();l++){
            //}
            for(int i =0; i<5; i++){
                threads[i] = new Thread(new SearchThread(start,end,terms1));
                start =end+1;
                end = end+wordList.size()/5;
            }
            for(int j=0; j<5;j++){
                threads[j].start();
            }
                for (int k = 0; k < 5; k++) {
                    threads[k].join();
                }
            } catch(Exception e){}
        this.sort();
        return resultSet;
    }
    public void nullCheck() {//done
        try {
            if (pageList.isEmpty() || wordList.isEmpty()) {
                setup(this.wordListFile, this.pageListFile);
            }
        } catch(Exception e){}
    }
    public void setup(String wordListFile, String pageListFile) {//done
        try {
            FileUtils f = new FileUtils();
            pageList = f.getPageList(pageListFile);
            wordList = f.getWordList(wordListFile);
        } catch(Exception e){}
        //try{
            //FileInputStream fis = new FileInputStream(new File(wordListFile));
          //  ObjectInputStream ois = new ObjectInputStream(fis);
            //Word w = (Word) ois.readObject();
            //FileInputStream fis2 = new FileInputStream(new File(pageListFile));
            //ObjectInputStream ois2 = new ObjectInputStream(fis2);
            //Page p = (Page) ois2.readObject();
           // ois2.close();
            //fis2.close();
            //ois.close();
            //fis.close();

       // } catch(Exception e){}
    }
    public void sort(){//done
        Collections.sort(resultSet);
        //int max = resultSet.size();
        //for(int x =0; x<max-1; x++){
            //int res = resultSet.get(x).compareTo(resultSet.get(x+1));
            //if(res==1){
                //Result temp = resultSet.get(x);
                // = resultSet.get(x+1);
    }
}
