/**
 * CS180 - LAB02 - StringManipulator
 * This program takes in full name and domain in order to output an email address to the user. 
 * @author Anjali Malik, malik11@purdue.edu
 */

import java.util.Scanner; //to access scanner class
import java.io.*; //to access System.out
import java.io.PrintStream;

public class StringManipulator {

  public static void main(String[] args) {
    
    /* getting input from user */
    Scanner in = new Scanner(System.in);
    String fullName = in.nextLine();
    String domain = in.nextLine();
    
    /* creating new object in class StringManipulator */
    StringManipulator obj = new StringManipulator();
    
    /* sending arguments and getting return value into new strings */
    String username = obj.makeuserName(fullName);
    String email = obj.makeEmail(username, domain);
    
    /* Message Dialog output */
    
    System.out.println("Username: " + username + "\nEmail: " + email);
 
  }
  
   /**
  * @param fullName contains the person's 
  * first and last name separated by a space
  * @return user name
  */
  public String makeuserName(String fullName) {
    
    if (fullName == null) { /* stop execution is fullName is empty */
      return null;
    }
    
    /* parsing through the fullName to create username using first character of 
     * first name and the entire last name */
    char firstChar = fullName.charAt(0);
    int startIndex = fullName.indexOf(" ") + 1;
    int stopIndex = fullName.length();
    
    String username = firstChar + fullName.substring(startIndex, stopIndex);
    username = username.toLowerCase(); /* using String method to convert to lower cases */
    
    return username;
 
 /**
  * @param name user name returned by the makeUserName method 
  * @param domain Internet domain name (e.g. purdue.edu)
  * @return e-mail
  */
  }
  public String makeEmail(String name, String domain) {
    
    String email = name + "@" + domain;
    email = email.toLowerCase();
    
    return email;

  }

}
  