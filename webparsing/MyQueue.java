public class MyQueue extends Object {
   private int count = 0;
   private Node head =null;
   private Node temp =null;
   public MyQueue(){}
   public void add(Object o) {
      Node obj = new Node(o);
      obj.setNext(null);
      if(this.count==0){
         this.head =obj;
      }
      else {
         this.temp = this.head;
         while (this.temp.getNext() != null) {
            this.temp = temp.getNext();
         }
         temp.setNext(obj);
      }
      this.count++;
      //if(count>0){
         //obj.setPrev(obj);
     // }
      //this.count++;
      //this.head = obj;
      //if(this.head == null){
         //this.head = obj;
         //obj.setNext(null);
         //this.count++;
      //}
     // else{
         //obj.setPrev(obj);
         //obj.setNext(null);
        // this.count++;

      //obj.setNext(null);
      //this.queue_1.add(o);
      //this.count++;
   }
   public Node remove() {
      this.temp = this.head;
      if(this.head==null){
         return null;
      }
      else{
         this.head=this.head.getNext();
         this.count--;
         return temp;
      }


      //Node ob = null;
     // if(this.count==0){
       //  ob= null;
      //}
      //else if(this.count==1){
       //  ob = this.head;
        // this.count--;
     // }
     // else if(this.count>1) {
        // ob = this.head;
        // this.head = this.head.getNext();
        // this.count--;
      //}
     // return ob;

   }
   public Node peek(){
      return this.head;
   }
   public int size(){
      return this.count;
   }
   public boolean isEmpty() {
      if(this.count==0){
         return true;
      }
      else{
         return false;
      }
   }
}