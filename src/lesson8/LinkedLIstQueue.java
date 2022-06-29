package lesson8;


import java.util.NoSuchElementException;

public class LinkedLIstQueue<E> implements MyQueue<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size = 0; // come back here!

    private static class Node<E>{
        private E data;
        private Node<E> next;

        private Node (E data){
            this.data = data;
            this.next = null;
        }

        private Node (E data, Node<E> ref){
            this.data = data;
            this.next = ref;
        }

    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if(front == null){
            rear = newNode;
            front = rear;
        }else{
            rear.next = newNode;
            rear = rear.next;
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(E e) {
        Node<E> newNode = new Node<E> (e);
        if(front == null){              // In this case update both front and rear
            rear = newNode;
            front = rear;
        }else{
            rear.next = newNode;        // Add to rear/tail
            rear = rear.next;           // Update rear/tail
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        if(size==0)
            throw new NoSuchElementException();

        E hand = front.data;
        front = front.next;
        size--;
        return hand;
    }

    @Override
    public E poll() {
        if(size==0)
            return null;

        E hand = front.data;
        front = front.next;
        size--;
        return hand;
    }

    @Override
    public E element() {
        if(size==0)
            throw new NoSuchElementException();
        else
            return front.data;
    }

    @Override
    public E peek() {
        if(size==0)
            return null;
        else
            return front.data;
    }

    @Override
    public int getSize() {
        return size;
    }
}
