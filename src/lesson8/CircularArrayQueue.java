package lesson8;


import java.util.NoSuchElementException;

public class CircularArrayQueue<E> implements MyQueue<E> {

    private int front;
    private int rear;
    private int size;
    private int capacity;
    private E [] data;
    private static final int INITIAL_CAPACITY = 10;

    public CircularArrayQueue(){
        capacity = INITIAL_CAPACITY;
        data = (E[]) new Object[capacity];
        front = 0;
        rear = capacity-1;
        size=0;
    }


    @Override
    public boolean add(E e) {
        if(size == capacity)
            reallocate();

        size++;
        rear = (rear+1) % capacity;
        data[rear] = e;
        return true;
    }

    @Override
    public boolean offer(E e) {
                if(size == capacity)
        reallocate();

        size++;
        rear = (rear+1) % capacity;
        data[rear] = e;
        return true;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        if(size == 0)
            return null;

        E hand = data[front];
        front = (front+1) % capacity;
        size--;
        return hand;
    }

    @Override
    public E element() {
        if(size == 0)
            throw new NoSuchElementException();
        else
            return data[front];
    }

    @Override
    public E peek() {
        if(size == 0)
            return null;
        else
            return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    private void reallocate(){
        int newCapacity = 2 * capacity;
        E[] newData = (E[]) new Object[newCapacity];

        int j = front;
        for( int i =0 ; i < size ; i++){
            newData[i] = data[j];
            j = (j+1) % capacity;
        }

        front = 0;
        rear = size -1;
        capacity = newCapacity;
        data = newData;
    }
}
