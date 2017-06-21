import java.io.*;

public class Tester{
  
  Shape[] shapes;
  int numShapes;
  
  public static void main(String[] args) {

    Tester t = new Tester();
    t.shapes = new Shape[3];
    t.numShapes = 3;
    t.shapes[0] = new Triangle(3,4,5);
    t.shapes[1] = new Rectangle(3,4);
    t.shapes[2] = new Circle(1);
    t.findPerimeters();
    t.findArea();
    t.print();
  }
  
  void findPerimeters() {
    
    for(int i = 0; i < shapes.length; i++) {
     shapes[i].findPerimeter();
    }
  }
  
  void findArea() {
     
    for(int i = 0; i < shapes.length; i++) {
     shapes[i].findArea();
    }
  }
  
  void print() {
    
    for(int i = 0; i < shapes.length; i++) {
      System.out.println("Name: " + shapes[i].getName());
      System.out.println("Perimeter: " + shapes[i].getPerimeter());
      System.out.println("Area: " + shapes[i].getArea());
      System.out.println("\n");
    }
  }
}