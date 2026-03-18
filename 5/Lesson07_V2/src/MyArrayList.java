// Define a custom ArrayList class (not the one from java.util.ArrayList)

import java.util.Arrays;

public class MyArrayList<T> { //Generic class with <T> is parameter type

    //1. Properties
    private T[] arr;
    private int count;
    private final int DEFAULT_CAPACITY = 10;
    private final double GROW_FACTOR = 1.5;

    //2. Constructor
    public MyArrayList() {
        arr = (T[]) new Object[DEFAULT_CAPACITY];
        count = 0;
    }
    public MyArrayList(int capacity) {
        arr = (T[]) new Object[capacity];
        count = 0;
    }

    //3. Methods
    public void add(T element) { //Add a new element to the end of the list
        if(count == arr.length) {
            arr = Arrays.copyOf(arr, (int)(arr.length * GROW_FACTOR));
        }
        arr[count++] = element;
    }
    public void add(int index, T element) {
        if(index < 0 || index >= count) {
            // throw new IndexOutOfBoundsException("Index out of bounds");
            System.out.println("The inputed index " + index + " is out of bounds");
            return;
        }
        if(count == arr.length) {
            arr = Arrays.copyOf(arr, (int)(arr.length * GROW_FACTOR));
        }
        for(int i = count - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        count++;
    }
    public void remove(int index) {
    }
    public T removeLast() { //Return the removed element
        //arr[count-1] = null; //(Optional): Reset the value of the last element
        T removedElement = arr[count-1];
        count--;
        return removedElement;
    }
    public T get(int index) {
        if(index < 0 || index >= count) {
            // throw new IndexOutOfBoundsException("Index out of bounds");
            System.out.println("The inputed index " + index + " is out of bounds");
            return null;
        }
        return arr[index];
    }
    public int size() { //Return the number of elements in used 
        return count;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < count; i++) {
            sb.append(arr[i]);
            if(i < count - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
