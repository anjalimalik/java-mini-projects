import java.io.*;

public class Contact{
  public String name;
  private long number;
  private String address;
  
  //constructors
  public Contact(String name) {
    this(name, 0, null);
  }
  
  public Contact(String name, long number) {
    this(name, number, null);
  }
  
  public Contact(String name, long number, String address) {
    this.name = name;
    this.number = number;
    this.address = address;
  
  }
  
  //get methods
  public String getName() {
    return name;
  }
  public long getNumber() {
    return number;
  }

  public String getAddress() {
    return address; 
  }
  
  //set methods
  public void setName(String name) {
    this.name = name;
  }
    
  public void setNumber(long number) {    
    this.number = number;   
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  //others
  public boolean equals(Contact c1) {
    
    if(c1.getName().equals(this.name)) {
      return true;
    } else return false;
  }

}
