public class FighterJet implements Vehicle {

  String name;
  int maxpass;
  int maxspeed;
  int numwheels;
  boolean canfly;
  String startEngine;
  
  public String name(){
    name = "F-15";
    return name;
  }

  public int maxPassengers(){
    maxpass = 2;
    return maxpass;
  }

  public int maxSpeed(){
    maxspeed = 1875;
    return maxspeed;
  }

  public int numWheels(){
    numwheels = 3;
    return numwheels;
  }

  public String startEngine(){
    startEngine = "Whoosh!";
    return startEngine;
  }

  public boolean canFly(){
    canfly = true;
    return true;
  }
  
  public String sonicBoom(int currentSpeed){
    if(currentSpeed > 761) {
      return "BOOM!!";
    } else {
      return "Whoosh!";
    }
  }

}