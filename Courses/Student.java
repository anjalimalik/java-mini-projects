/**
 * Created by anjalimalik
 */
import java.io.*;
import java.lang.*;

public class Student extends Person {

    String[] courses = new String[6];
    char[] grades  = new char[6];

    public Student(String name, String address) {
       	super(name, address);
     	for(int i = 0; i < 6; i++) {
            grades[i] = 'A';
            courses[i] = "none";
        }
    }

    public void setCourses(String[] courses){
        this.courses = courses;
    }

    public void setGrades(char[] grades){
        this.grades = grades;
    }

    public String[] getCourses() {
        return courses;
    }
    public char[] getGrades() {
        return grades;
    }

    public boolean addCourse(String course){

        int check1 = 0;
        int check2 = 1;
        int check3 = 0;

        for(int i = 0; i < 6; i++){

            if(courses[i].equals("none")){
                check1 = 1;
            }
            if(course.equals(courses[i])){
                check2 = 0;
            }
        }
        if(check1 == 1 && check2 == 1) {
            for(int i = 5; i >= 0; i--) {
                if(courses[i].equals("none")) {
                    courses[i] = course;
                    check3 = 1;
                    break;
                }
            }
        }
        if(check3 == 1){
            return true;
        } else return false;
    }

}
