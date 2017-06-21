/**
 * Created by anjalimalik
 */
import java.io.*;
import java.lang.*;

public class Professor extends Person{

    double salary;
    String course;
    String rank;
 
    public Professor(String name, String address, String course, String rank) {
        super(name,address);
     	this.course = course;
        this.rank = rank;
    }

    public void setSalary(double salary) {
         	this.salary = salary;
        
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setRank(String rank) {
     	
     	if(rank.equals("Assistant")) {
      		this.salary = 70000;
        } else if(rank.equals("Professor")){
         	this.salary = 100000;
        }

        this.rank= rank;
    }

    public double getSalary() {
     	
        return salary;
    }

    public String getCourse(){
        return course;
    }

    public String getRank(){
        return rank;
    }
}
