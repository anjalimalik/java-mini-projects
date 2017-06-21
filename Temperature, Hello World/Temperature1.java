/**
 *
 * This programs converts temperatures in Fahrenheit to Celsius. 
 * @author Anjali Malik
 */

public class Temperature1 {
  public static void main(String[] args) {
    double fahrenheit;
    double celsius;
    fahrenheit = 200;
    celsius = ((fahrenheit - 32) * 5) / 9;
    System.out.println("Fahrenheit: " + fahrenheit);
    System.out.println("Celsius: " + celsius);
  }
}
