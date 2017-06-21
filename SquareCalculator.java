/**
 * This program returns the square of the number that is passed as an argument. 
 * @author Anjali Malik
 */

import java.io.*; /* to access System.out */
import java.io.PrintStream;

public class SquareCalculator {

	public static void main(String[] args) {
		
		SquareCalculator obj = new SquareCalculator();
		int x = 5;
		int y = obj.squareIt(x);
		System.out.println("Square of the number: " + y);
		
	}
	
  /**
 * @param value contains the value of the number 
 * @return square
 */
	
	public static int squareIt(int value) {
		
		int square; /* declaration of integer square */
		square = value * value; /* calculating value of the squared number */ 
		
		return square; /* return answer to main */
	}
}

 
