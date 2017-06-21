import java.io.*;
import java.lang.*;
import java.util.*;

public class FileParse {

    public static int countWords(String fileName, String searchWord) throws Exception {

        int count = 0;
	//Open file  with the path ‘fileName’
        File f = new File(fileName);

	//Read the file
        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        //Go through the file and tally up the number of matches
        while( (line = bfr.readLine())!= null ) {
            //String[] words = line.split(" ");
            //for (String word: words) {
                //if (word.equals(searchWord)) {
                    //count++;
                //}
            //}
         if(line.contains(searchWord)) {
          while(line.contains(searchWord)) {
           count++;
          }
         }
        }
        //TODO: Print output
        System.out.println("Total number of occurrences: "+count);
        bfr.close();
        return count;
    }

    public static boolean deleteLine(String fileName, int lineNum) throws Exception {
   
	//Create an array to save the lines
        ArrayList<String> line_array = new ArrayList<String>();

	//Iterate through the file line by line until you find the 'lineNum' line
        File f = new File(fileName);
        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        FileWriter fw = new FileWriter(f);


        //If line is found, skip saving it, otherwise, save it in the array
        //Write the whole array to the file
        //Print “Line deleted!” if success
        //Print “Line not found...” otherwise
        int num = 0;
        boolean deleted = false;
        String line = null;
        while((line = bfr.readLine())!= null) {
            num++;
            if (num == lineNum) {
                System.out.println("Line deleted!");
                deleted = true;
            }
            else {
                line_array.add(line);
            }
        }
        if (!deleted) {
            System.out.println("Line not found");
        }
        
        for (int i = 0; i < line_array.size(); i++) {
            fw.write(line_array.get(i));
        }
        

        
        bfr.close();
        fw.close();
        return deleted;
    }

    public static int refactor(String fileName, String original, String replace) throws Exception {
    
    //Iterate through the file line by line and check if the line has the ‘original’ string
        File f = new File(fileName);
        RandomAccessFile rAccFile = new RandomAccessFile(f, "rw");
        FileWriter fw = new FileWriter(f);
     
     String line = null;
     while((line = rAccFile.readLine())!= null ){
      if(line.equals(original)){
      	long num = rAccFile.getFilePointer();
       rAccFile.seek(num);
       rAccFile.writeBytes(replace);
      }
     }
        fw.close();
     return 0;
    }
}
