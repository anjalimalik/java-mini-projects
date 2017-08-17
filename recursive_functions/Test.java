import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    int d; // maximum mileage 
    int[] dist;////array of distances - where dist[i] contains the distance between gas station(i) and gas station(i+1)
    ArrayList stops = new ArrayList();

    public void setDist(int[] dist1) {
        this.dist = Arrays.copyOf(dist1, dist1.length);
    }

    public void setD(int d) {
        this.d = d;
    }
    
    // Example recursive function - Calculating n!
    public double factorial(int n) {
      if(n<0) 
          return -1;//invalid input
      
      if(n==0)
          return 1;
      else 
          return n * factorial(n-1);   
    }
    
    public int iterative_fibonacci(int n){//n is the input number to calculate Fibonacci(n)
        if(n<0) 
          return -1;//invalid input
        
        if(n==0 || n==1){
            return n;
        }
        int f1=1;
        int f2=1;
        int result=1;
        for(int i=3;i<=n;i++){
            result=f1+f2;
            f1=f2;
            f2=result;
        }
        return result; //return the appropriate result
        
    }
    
    public int recursive_fibonacci(int n){//n is the input number to calculate Fibonacci(n)
        if(n<0) 
          return -1;//invalid input
        
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{
            return (recursive_fibonacci(n-1) + recursive_fibonacci(n-2));
        }
    }
    
    /* GAS STATION 
    Variables:
    index = starting gas station index
    fuel = mileage that can be covered with existing tank
    stops = stores the indices of the gas stations in a list
    */
    
    public ArrayList recursive_gas_station(int fuel, int index) {
      
      if(d<=0){
          return new ArrayList(-1);
      }
      
      for(int i = 0; i < dist.length; i++){
          if(dist[i]<=0 || dist[i] > d){
              return new ArrayList(-1);
          }    
      }
      
      if(index == dist.length){
         return stops;
      }
     
      if(dist[index] <= fuel){
          recursive_gas_station(fuel - dist[index], index+1);
      } else {
          stops.add(index);
          recursive_gas_station(d, index);
      }
        
      return stops;
    }
    
     public void calculate_time(int n){
         
        long start_time = System.nanoTime();
        recursive_fibonacci(n);
        //iterative_fibonacci(n);
        long end_time = System.nanoTime();
        long recursive_total_time = end_time-start_time; 
        System.out.println(recursive_total_time);
        long start_time = System.nanoTime();
        //iterative_fibonacci(n)
        long end_time = System.nanoTime();
        long iterative_total_time = end_time-start_time;
        
    }
}
