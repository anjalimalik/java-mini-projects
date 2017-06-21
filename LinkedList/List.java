/**
 * A list holding elements of any reference type.
 * Dynamic Data Structures</p>
*/
public class List<T extends Comparable<T>> extends Object {
    /**
     * Adds the specified value to the front of the list.
     * @param value the value to be added to the front
     */

    private Node<T> start;
    private int numElements;


    public List() {
        this.start = null;
        this.numElements = 0;
    }

    public void addFront(T value){
        if (this.start == null) {
            this.start = new Node<>(value);
        } else {
            this.start = new Node<>(value, this.start);
        } //end if

        this.numElements++;
    } //addFront

    /**
     * Adds the specified value to the end of the list.
     * @param value the value to be added to the end
     */
    public void addEnd(T value) {
        if (this.start == null) {
            this.start = new Node<>(value);
        } else {
            Node<T> currentNode = this.start;

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } //end while

            currentNode.setNext(new Node<>(value));
        } //end if

        this.numElements++;
    } //addEnd

    public int getNumElements(){
        return this.numElements;
    }

    public boolean addAfter(int index, T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> temp = this.start;
        int i = 1;
        while (temp != null) {
            if (index == i) {
                Node<T> temp2 = temp.getNext();
                temp.setNext(newNode);
                newNode.setNext(temp2);
                this.numElements++;
                return true;
            }
            temp = temp.getNext();
            i++;
        }

        return false;

    }
    public boolean deleteNode(T value){
        Node<T> temp1 = this.start;
        Node<T> temp2 = temp1.getNext();
        // Edge case
        if (temp1.getValue() == value) {
            temp1.setNext(null);
            this.start = temp2;
        }
        while(temp2!=null) {
            if(temp2.getValue() == value) {
                Node<T> temp3 = temp2.getNext();
                temp1.setNext(temp3);
                temp2.setNext(null);
                this.numElements--;
                return true;
            }
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        return false;
    }
    public int insertInPlace(T value){
        // Assuming List is Sorted already!
        Node<T> newNode = new Node<>(value);
        // Edge Cases
        if (this.start == null) {
            this.start = newNode;
        }
        if(this.start.getValue().compareTo(value) == 1) {
            newNode.setNext(this.start);
            this.start = newNode;
            this.numElements++;
            return 1;
        }
        Node<T> prev = this.start;
        Node<T> curr = prev.getNext();
        int index = 2;
        while(curr!=null) {
            if(curr.getValue().compareTo(value) == 1) {
                prev.setNext(newNode);
                newNode.setNext(curr);
                this.numElements++;
                return index;
            }
            index++;
            prev = prev.getNext();
            curr = curr.getNext();
        }
        // Edge Case
        if (curr == null) {
            prev.setNext(newNode);
            newNode.setNext(null);
            this.numElements++;
            return index;
        }
        return -1;

    }

    public String toString(){
        String string = "";

        Node<T> temp = this.start;

        while (temp != null) {
            string += temp.getValue();
            string += "->";
            temp = temp.getNext();
        }
        String str = string.substring(0,string.length()-2);
        return string;
    }

}
