import java.util.*;

public class Producer extends Thread{
  private Buffer buffer;

  public Producer(Buffer buffer){
     this.buffer = buffer;
  }
        
   public void run(){
      for (int i = 0; i < 10; i++) {
        buffer.set(i);
        try{
          sleep((int)(Math.random()*100));
        }catch(InterruptedException e) {}
      }
   }
}
