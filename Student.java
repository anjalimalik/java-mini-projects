/**

 * This program takes in scores of a student and calculates the letter grade attained by the student for the course.
 * 
 * @author anjalimalik

 */
import java.io.*; //to access System.out

public class Student {
  
  private String id; //student id
  private String dept; //the student's dept
  private int part; //participation score
  private int abs; //student absenses
  private int exam; //the student's exams results
  
  public static void main(String [] args) {
  
    Student s = new Student( "1020101", "CS", 4, 75, 5);
    
    int totScore = s.getOverallScore();
    String grade = s.getLetterGrade(totScore);
    boolean result = s.hasPassedCourse(grade);
    
    System.out.println(s.id);
    System.out.println("Score: " + totScore);
    System.out.println("Grade: " + grade);
    
    if(result == true)
      System.out.println("Student " + s.id + " has passed the course");
    else
      System.out.println("Student " + s.id + " has failed the course");
  }
  
  public Student(String id, String dept, int abs, int exam, int part) {
    
    //initializing declared variables
    this.id = id;
    this.dept = dept;
    this.part = part;
    this.abs = abs;
    this.exam = exam;
  }

  
  public int getOverallScore() {
    
    int totScore;
    int attendanceScore = 0;
    
    if(this.abs == 0) {
      attendanceScore = 2;
    }
    else if(this.abs >= 1 && this.abs <= 4) {
      attendanceScore = 0;
    }
    
    totScore = this.exam + this.part + attendanceScore;
    
    return totScore;
  }
  
  public String getLetterGrade(int score) {
    
    String letterGrade = "";
    
    if (this.abs >= 5) {
      letterGrade = "F";
    }
    
    else if(score >= 95 && score <= 100) {
      letterGrade = "A+";
    }
    else if(score >= 90 && score <= 94) {
      letterGrade = "A";
    }
    else if(score >= 80 && score <= 89) {
      letterGrade = "B";
    }
    else if(score >= 70 && score <= 79) {
      letterGrade = "C";
    }
    else if(score >= 60 && score <= 69) {
      letterGrade = "D";
    }
    else {
      letterGrade = "F";
    }
    
    return letterGrade;
  }
  
  public boolean hasPassedCourse(String letterGrade) {
    
    if (this.dept == "CS") {
      
      if(letterGrade == "F") {
        return false;
      }
      else {
        return true;
      }
    }
    
    else {
      
      if(letterGrade == "A" || letterGrade == "B") {
        return true;
      }
      else {
        return false;
      }
    }
    
  }
}
