
import java.io.*;
import java.lang.Math;

public class OddEvenGame {
	private int oddsum;
	private int evensum;
	private static int totalOddSum;
	private static int totalEvenSum;
	
	public void addEven(int[] array) {
		
     for(int i = 0; i < array.length; i++) {
			if (Math.abs(array[i] % 2) == 0) {
				evensum += array[i];
			}
		}
		
		this.totalEvenSum += evensum; 
	}
	public void addOdd(int[] array) {
		
     for(int i = 0; i < array.length; i++) {
			if (Math.abs(array[i] % 2) == 1) {
				oddsum += array[i];
			}
		}
		
		this.totalOddSum += oddsum;	
	}
	
	public int getOddSum() {
		return this.oddsum;
	}
	public int getEvenSum() {
		return this.evensum;
	}
	public int getTotalOddSum() {
		return this.totalOddSum;
	}
	public int getTotalEvenSum() {
		return this.totalEvenSum;
	}
	
	public static void main(String[] args) {
		OddEvenGame obj1 = new OddEvenGame();
		OddEvenGame obj2 = new OddEvenGame();

		 
		System.out.println(obj1.getEvenSum()); // Prints 12.
		System.out.println(obj2.getOddSum()); // Prints 1466.
		System.out.println(obj1.getTotalOddSum()); // Prints 1475.
		System.out.println(obj2.getTotalEvenSum()); // Prints 414.
	}

}
