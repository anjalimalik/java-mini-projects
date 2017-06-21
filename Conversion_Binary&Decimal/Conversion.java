
/**
 *
 * @author anjalimalik
 */

import java.lang.Math;

public class Conversion {
   
   public static void main(String[] args) {
        Conversion obj = new Conversion();						
        System.out.println(obj.binaryToDecimal(1001000));  // Prints 72
        System.out.println(obj.binaryToDecimal(1011000));  // Prints 88
        System.out.println(obj.decimalToBinary(113));  // Prints 1110001
        System.out.println(obj.decimalToBinary(64));  // Prints 1000000
   } 
   public int binaryToDecimal(int binary) {
       int dec = 0;
       int tmp = 0;
       int base2 = 2;
       int power = 0;
    
       while(true) {
           if(binary == 0) {
               break;
           } 
           else {
              
               tmp = binary % 10;
               dec += tmp * Math.pow(2, power);
               binary = binary / 10;
               power++;
           }
       }
       return dec;
    } 
    public int decimalToBinary(int decimal) {
        int bin[] = new int[50];
     	int bin2[] = new int[50];
     	double answer = 0;
        int n = 0;
     	int k = 0;
        
        while (decimal >= 1) {
            bin[n] = decimal % 2;
            decimal = decimal/2;
            n++;
            
        }
        for(int i = n-1; i >= 0; i--) {
         	bin2[k] = bin[i];
         	k++;
        }
     	for(int j = 0; j < n; j++) {
     		answer = answer + ( bin2[j] * Math.pow(10,n-1-j));
     	}
 
     	
        return (int) answer;
    }
    
}
