import java.io.*;
public class Matrix{

  public void printMatrix(int [] [] matrix) {
    
    for(int i=0; i<matrix.length; i++) {
      System.out.print("[");
      for(int j=0; j<matrix[0].length; j++) {
        if(j == matrix[0].length - 1) {
          System.out.print(matrix[i][j]);
        }
        else {
          System.out.print(matrix[i][j] + ", ");
        }
      }
      System.out.print("]\n");
    }
  }

  public int[][] transposeMatrix(int[][] matrix) {
    int[][] temp = new int[matrix[0].length][matrix.length];
    
    for(int i=0; i<matrix.length; i++) {
      for(int j=0; j<matrix[0].length; j++) {
        temp[i][j] = matrix[j][i];
      }
    }
    return temp;
  }
  
  public boolean isIdentity(int[][] matrix) {
    
    int check = 1;
    
    //check if square
    if (matrix.length != matrix[0].length) {
      check = 0;
    }
    else {
      for(int i=0; i<matrix.length; i++) {
        for(int j=0; j<matrix[0].length; j++) {
          
          if((i==j && matrix[i][j] != 1) || (i!=j && matrix[i][j] != 0)) {
            check = 0;
            break;
          } 
        }
        if(check == 0) {
          break;
        }
      }
    }
    
    if(check == 0) {
      return false;
    }
    else {
      return true;
    }
    
  }
  
  public boolean isUpperTriangular(int[][] matrix) {
    
    int check = 1;
    
    //check if square
    if (matrix.length != matrix[0].length) {
      check = 0;
    }
    else {
      for(int i=0; i<matrix.length; i++) {
        for(int j=0; j<matrix[0].length; j++) {
          
          if((i>j && matrix[i][j] != 0)) {
            check = 0;
            break;
          } 
        }
        if(check == 0) {
          break;
        }
      }
    }
    if(check == 0) {
      return false;
    }
    else {
      return true;
    }
    
  }
  
  public boolean isTridiagonal(int[][] matrix) {
    
    int check = 1;
    
    //check if square
    if (matrix.length != matrix[0].length) {
      check = 0;
    }
    else {
      for(int i=0; i<matrix.length; i++) {
        for(int j=0; j<matrix[0].length; j++) {
          
          if ((i==j) || ((i-1)==j) || ((i+1)==j)) {
              if (matrix[i][j] == 0) {
                  check = 0;
                  break;
               }
            }else {
              if (matrix[i][j] != 0) {
                   check = 1;
                   break;
              }
          } 
        }
        if(check == 0) {
          break;
        }
      }
    }
    if(check == 0) {
      return false;
    }
    else {
      return true;
    }
    
  }
  
  public static void main(String[] args) {
    
    Matrix obj = new Matrix();

    int[] [] array = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}};
    
    System.out.println("Original Matrix:");
    obj.printMatrix(array);
    
    System.out.println("\n" + "isIdentity: " + obj.isIdentity(array) + "\n");
    System.out.println("isUpperTriangular: " + obj.isUpperTriangular(array) + "\n");
    System.out.println("isTridiagonal: " + obj.isTridiagonal(array) + "\n"); 
    System.out.println("Transposed matrix:  ");
    obj.printMatrix(obj.transposeMatrix(array));
    
    
  }
      
  
}
