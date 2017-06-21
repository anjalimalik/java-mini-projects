import java.lang.Math;

public class Rectangle implements Shape {
 
  String name = "rectangle";
  double[] sides = new double[2];
  double perimeter;
  double area; 

  
  public Rectangle(double a,double b) {
    this.sides[0] = a;
    this.sides[1] = b;

  }
  
  public void findPerimeter() {
    this.perimeter = 2*(sides[0] + sides[1]);
  }
  
  public void findArea() {
    this.area = (sides[0] * sides[1]);
  }
    
  public String getName(){ 
     return name;
  }
  public double getPerimeter() {
     return perimeter;
  }
  
  public double getArea(){ 
     return area;
  }
}