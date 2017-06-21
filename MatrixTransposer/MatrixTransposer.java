import org.jetbrains.annotations.Contract;

import java.io.*;
import java.io.File;


/**
 * Created by anjalimalik
 */
public class MatrixTransposer {


   public static void ReadMatrix() throws Exception{

       String[] arr = new String[4];
       String[][] matrix = new String[4][2];
       String[][] transposed;

       File f1 = new File("matrixInput.txt");
        try {
            FileInputStream fis = new FileInputStream(f1);
            BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
            String str = bfr.readLine();

            //counter
            int counter = 0;
            while(counter < 4) {

                arr = str.split(" ");
                for(int i = 0 ; i < 2; i++){
                    matrix[counter][i] = arr[i];
                }

                str = bfr.readLine();
                counter++;
            }

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 2; j++) {

                    System.out.println(matrix[i][j]);
                }
                System.out.println("\n");
            }

            transposed = transposeMatrix(matrix);
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 4; j++) {

                    System.out.println(transposed[i][j]);
                }
                System.out.println("\n");
            }


            File output = new File("matrixOutput.txt");
            FileWriter fw = new FileWriter(output);

            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 4; j++) {

                    fw.write(String.valueOf(transposed[i][j]));
                    fw.write(" ");
                }
                fw.write("\n");
            }

            bfr.close();
            fw.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();;
        } catch (IOException e) {
            e.printStackTrace();
        }


   }

    @Contract(pure = true)
    public static String[][] transposeMatrix(String[][] matrix){

        String[][] temp = new String[matrix[0].length][matrix.length];

        for(int i=0; i< matrix[0].length; i++) {
            for(int j=0; j< matrix.length; j++) {
                temp[i][j] = matrix[j][i];
            }
        }
        return temp;

    }

    public static void main(String[] args) throws Exception{
        MatrixTransposer mt = new MatrixTransposer();
        mt.ReadMatrix();
    }





}
