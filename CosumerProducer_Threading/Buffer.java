import java.util.*;

public class Buffer{

    private int contents;
    private boolean empty = true;
 
    
    
    public synchronized void set(int value) {
      while(!empty){
        
          try{
            wait();
          }catch(InterruptedException e) {}
        
    }
      
        System.out.println("Producer put: " + value);
        contents = value;
        empty = false;
        notifyAll();
      
    }

    public synchronized int get() {
      while(empty){
        
          try{
            wait();
          }catch(InterruptedException e) {}
        }
      
        
        System.out.println("Consumer got: " + contents);

        empty = true;
        notifyAll();
        return contents;
      
    }

}
 
 