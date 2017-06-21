/**

 * @author malik11 <malik11@purdue.edu>

 */
import java.io.*; //to access System.out

public class MathTools {
  
  public static double absoluteValue(double n) {
    if (n < 0) {
      n = (0.0 - n);
    }
    else {
      n = (0.0 + n);
    }
    return n;
  }
  public static double power(double base, int exponent) {
    
    double result = 1.0; 
    
    if (exponent == 0) {
      result = 1;
    } 
    else if (exponent < 0) {
      for(int i = 0; i < absoluteValue(exponent); i++) {
        result *= base;
      }
      result = (1 / result);
    }
    else if (exponent > 0) {
      for(int i = 0; i < exponent; i++) {
        result *= base;
      }
    }
    return result;
  }
  
  public static double nthRoot(double value, int root) {
    double guess0 = 0;
    double newguess = 0; 
    double change = 1;
    
    if (value <= 0 || root == 0) {
      newguess = 0;
    }
    
    if (root > 0) {
      guess0 = value;
    }
    else if (root < 0) {
      guess0 = 1/value;
    }
    
    while(change > 0.000000001) {
       newguess = (1.0/root) * (((root - 1)* guess0) + (value/(power(guess0, (root-1)))));
    
       change = absoluteValue(newguess - guess0);
       guess0 = newguess;
    }
    
    return newguess;
  }
  
  public static String scientificNotation(double n) {
    String answer = "";;
    int b = 0;
    
    if (absoluteValue(n) < 1) {
      while (1 > absoluteValue(n) && absoluteValue(n) < 10) {
        n = (n * 10.0);
        b--;
      }
    }  
    else if (absoluteValue(n) >= 10) {
      while (1 < absoluteValue(n) && absoluteValue(n) >= 10) {
        n = (n / 10.0);
        b++;
      }
    }
    else {
      n = n;
      b = 0;
    }
   
   answer = n + " X 10 ^" + b;
   
   return answer;   
  }
}
