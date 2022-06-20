package lesson3.sample;

import java.util.Arrays;

public class MyArrayList<E> {

    private static final int INITIAL_CAPACITY = 10;
    // Data Members
    private E [] arr;
    private int size = 0;
    private int capacity;

    //Methods

    public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arr = (E[]) new Object[capacity];
    }

    // O(1)
    public void add(E item){
        // What if the size exceeds the capacity?
        if(size == capacity)
            reallocate(); // O(n)

        arr[size] =item;
        size++;
    }

    //O(n)
    public void add(int index, E item){
        if(size == capacity)
            reallocate();

        if(index <0 || index >size)
            throw new ArrayIndexOutOfBoundsException();

        //shift
        for (int i = size; i> index ; i--) {
            arr[i]=arr[i-1];
        }
        // add on position
        arr[index] = item;
        size++;
    }

    // O(1)
    public E get(int index){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        return arr[index];
    }

    // O(1)
    public E set(int index , E newItem){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        E hand = arr[index];
        arr[index] = newItem;
        return hand;

    }
    // remove
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        // hold the data to removed
        E hand = arr[index];

        // shift to start
        for(int i = index + 1 ; i < size ; i++){
            arr[i-1] = arr[i];
        }
        size--;
        return hand;
    }


    public int size(){
        return size;
    }

    private void reallocate(){
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr,capacity);
    }







    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[size-1]+"]");
        return sb.toString();
    }


}
