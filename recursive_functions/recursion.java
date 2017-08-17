import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;

public class recursion {

    public static void main(String[] args) {
        Test test = new Test();
             
        if(args[0].equals("0")){                    // iterative fibonacci
            
            System.out.println(test.iterative_fibonacci(Integer.parseInt(args[1])));;
            test.calculate_time(Integer.parseInt(args[1]));
        }
        
        else if(args[0].equals("1")){               // recursive fibonacci
            System.out.println(test.recursive_fibonacci(Integer.parseInt(args[1])));
            //test.calculate_time(Integer.parseInt(args[1]));
        }
        
        else if(args[0].equals("2")){               // gas station problem
            //2 d n Dist
            int d = Integer.parseInt(args[1]);
            test.setD(d);
            int n = Integer.parseInt(args[2]);
            int[] stopsArray = new int[n];
            int k = 3;
            for(int i =0; i<n; i++){
                stopsArray[i]= Integer.parseInt(args[k]);
                k++;
            }
            test.setDist(stopsArray);
            
            
            System.out.println(test.recursive_gas_station(d, 0));
            
        }
        
    }
        
}
