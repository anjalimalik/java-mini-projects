/**
 * Created by malik11 on 3/31/17.
 */

import java.io.File;
import java.io.*;

public class FileIO {

    public static void printer(File f) throws Exception{

        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        String read = bfr.readLine();
        while(read!=null) {

            System.out.println(read);
            read = bfr.readLine();
        }

        bfr.close();
    }

    public static void main(String[] args) throws Exception{

        File f = new File("output.txt");
        FileWriter fw = new FileWriter(f);

        fw.write("Hello World!\n");
        //fw.write("");
        fw.write("CS 180 is awesome!");
        fw.close();

        printer(f);
    }
}