/**
 * Created by anjalimalik
 */
import java.io.*;
import java.lang.*;

public class Course {

 	Professor professor;
 	Student[] students = new Student[100];
 	String courseName;
	int numEnrolled;
 
 public Course(Professor professor, String courseName) {
 	this.professor = professor;
  	this.courseName = courseName;
 }
 
 public Professor getProfessor(){
  	return professor;
 }
 
 public String getCourseName(){
  	return courseName;
 }
 
public int getNumEnrolled(){
  	return numEnrolled;
 }
public Student[] getStudents(){
  	return students;
 }
 
 public boolean enroll(Student s) {
 	
  int check = 0;
  
  if(numEnrolled < 100) {
   for(int i = 0; i < 100; i++) {
    if(students[i].equals("")) {
     students[i] = s;
     check = 1;
     break;
    }
   }
  }
  
  if(check == 1) { 
   return true;
  } else { return false; }
 }


}

