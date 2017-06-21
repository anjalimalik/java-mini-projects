

/**
 * @author Anjali

 */
import java.io.*; //to access System.out
import java.util.Scanner;

public class MathToolsClient {
    public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      

      String yn = "";
      
      do{
        System.out.println("Select a number from the menu choices:");
        System.out.println("1 - Absolute Value");
        System.out.println("2 - Power");
        System.out.println("3 - Nth Root");
        System.out.println("4 - Scientific Notation");

        
        int choice = in.nextInt();
        
        if(choice == 1) {
          System.out.println("*** Absolute Value ***");
          System.out.println("Enter the value");
          double value = in.nextDouble();
          
          double answer = MathTools.absoluteValue(value);
          System.out.println("Answer is " + answer);
          System.out.println("Return to the menu? (yes/no)");
          yn = in.next();
        }
        else if (choice == 2) {
          System.out.println("*** Power ***");
          System.out.println("Enter the base");
          double base = in.nextDouble();
          
          System.out.println("Enter the exponent");
          int exponent = in.nextInt();
          double answer = MathTools.power(base, exponent);
          System.out.println("Answer is " + answer);
          System.out.println("Return to the menu? (yes/no)");
          yn = in.next();
        }
        else if (choice == 3) {
          
          System.out.println("*** Nth Root ***");
          System.out.println("Enter the value");
          double value = in.nextDouble();
          
          System.out.println("Enter the root");
          int root = in.nextInt();
          
          double answer = MathTools.nthRoot(value, root);
          System.out.println("Answer is " + answer);
          System.out.println("Return to the menu? (yes/no)");
          yn = in.next();
        }
        else if (choice == 4) {
          
          System.out.println("*** Scientific Notation ***");
          System.out.println("Enter the value");
          double value = in.nextDouble();
          
          String answer = MathTools.scientificNotation(value);
          System.out.println("Answer is " + answer);
          System.out.println("Return to the menu? (yes/no)");
          yn = in.next();
        }
        else {
          System.out.println("Invalid option.");
          System.out.println("Return to the menu? (yes/no)");
          yn = in.next();
        }
      }while(yn.equals("yes")); 
      
    }
}
