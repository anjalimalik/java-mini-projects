import java.lang.Math;

public class Circle implements Shape {
 
  String name = "circle";
  double radius;
  double perimeter;
  double area; 

  
  public Circle(double r) {
    this.radius = r;
  }
  
  public void findPerimeter() {
    this.perimeter = 2 * Math.PI * radius;
  }
  
  public void findArea() {
    this.area = (Math.PI * radius * radius);
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