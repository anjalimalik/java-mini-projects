public class Mustang implements Vehicle{

  String name;
  int maxpass;
  int maxspeed;
  int numwheels;
  boolean canfly;
  String startEngine;
  
  public String name(){
    name = "Mustang";
    return name;
  }

  public int maxPassengers(){
    maxpass = 4;
    return maxpass;
  }

  public int maxSpeed(){
    maxspeed = 180;
    return maxspeed;
  }

  public int numWheels(){
    numwheels = 4;
    return numwheels;
  }

  public String startEngine(){
    startEngine = "Vroom Vroom!";
    return startEngine;
  }

  public boolean canFly(){
    canfly = false;
    return false;
  }

}