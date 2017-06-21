import java.lang.Math;

public class Triangle implements Shape {
 
  String name = "triangle";
  double[] sides = new double[3];
  double perimeter;
  double area; 
  String type; 
  
  public Triangle(double a,double b, double c) {
    this.sides[0] = a;
    this.sides[1] = b;
    this.sides[2] = c;
  }
  
  public void findPerimeter() {
    if(isValidTriangle()) {
      this.perimeter = sides[0] + sides[1] + sides[2];
    }
  }
  
  public void findArea() {
    double s = (perimeter/2);
    this.area = Math.sqrt(s*(s - sides[0])*(s - sides[1])*(s - sides[2])); 
  }
  
  public boolean isValidTriangle() {
    double sum;
    sum = sides[0] + sides[1];
    
    if(sum >= sides[2]) {
      return true;
    }else return false;
    
  }
  
  public void findType() {
  
    if(sides[1] == sides[0] && sides[0] == sides[2]) {
      this.type = "equilateral";
    } else if(sides[1] == sides[2] || sides[1] == sides[0]) {
      this.type = "isosceles";
    } else {
      this.type = "scalene";
    }
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