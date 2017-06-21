/**
 * Created by anjalimalik
 */

import java.lang.Object;

public class Node<T extends Comparable<T>> extends Object {

    private T value;
    private Node<T> next;

    public Node(T value) {
        setValue(value);
        setNext(null);
    }

    public Node(T value, Node<T> next) {
        setValue(value);
        setNext(next);
    }

    public T getValue(){
        return this.value;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setValue(T value){
        this.value = value;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

}
