import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by anjalimalik 
 */
public class FileUtils extends Object {

    public FileUtils() {
    }

    public boolean saveWordTable(List<Word> wordTable, String filePath) {

        try{

            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            if(wordTable== null) {
                return false;
            }
            oos.writeObject(wordTable);

            oos.close();
            fos.close();



            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean savePageTable(List<Page> pageTable, String filePath){

        try{

            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            if(pageTable== null) {
                return false;
            }
            oos.writeObject(pageTable);
            oos.close();
            fos.close();


            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }



    }
    public List<Word> getWordList(String filePath) {

        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Word> list = new ArrayList<Word>();

            list = (List<Word>) ois.readObject();


            ois.close();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null; }



    }
    public List<Page> getPageList(String filePath) {
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Page> list = new ArrayList<Page>();

            list = (List<Page>) ois.readObject();

            ois.close();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
