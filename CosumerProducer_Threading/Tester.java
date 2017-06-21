import java.util.*;

public class Tester{
  
  public static void main(String[] args) {
    Buffer buffer = new Buffer();
    Thread producer = new Producer(buffer);
    Thread consumer = new Consumer(buffer);
    producer.start();
    consumer.start();
  }
}