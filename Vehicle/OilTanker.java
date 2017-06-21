import java.lang.Math;

public class OilTanker implements Vehicle{

  String name;
  int maxpass;
  int maxspeed;
  int numwheels;
  boolean canfly;
  String startEngine;
  
  public String name(){
    name = "Oil Tanker";
    return name;
  }

  public int maxPassengers(){
    maxpass = 30;
    return maxpass;
  }

  public int maxSpeed(){
    maxspeed = 20;
    return maxspeed;
  }

  public int numWheels(){
    numwheels = 0;
    return numwheels;
  }

  public String startEngine(){
    startEngine = "Brum Brum!";
    return startEngine;
  }

  public boolean canFly(){
    canfly = false;
    return false;
  }
  
  public double maxOilCarried(double radius, double height){
    double volume;
    volume = Math.PI * radius * radius * height;
    return volume;
  }

}