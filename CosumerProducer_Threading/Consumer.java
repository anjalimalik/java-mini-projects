import java.util.*;


public class Consumer extends Thread{
  private Buffer buffer;
  
  public Consumer(Buffer buffer){
    this.buffer = buffer;
  }
  
  public void run(){
    for (int i = 0; i < 10; i++) {
      buffer.get();
      try{
        sleep((int)(Math.random()*100));
      }catch(InterruptedException e) {}
    }
  }
}
