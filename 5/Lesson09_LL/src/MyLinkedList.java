public class MyLinkedList<T> { //generic class, T is a parameter type
    //1. Properties
    private class Node { //inner class
        T data;
        Node next;
       // Node prev; //needed for doubly linked list

        Node(T data) {
            this.data = data;
            this.next = null;
            //this.prev = null;
        }
    }
    private Node head; //reference to the first node in the list
    private Node tail; //reference to the last node in the list
    private int size; //number of nodes in the list

    //2. Constructor
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    //3. Methods
    public void add(T data) { //O(n) -> O(1) if we know the tail
         //1. Create a new node
         Node aNode = new Node(data);
         //2. Current example: Singly Linked List with forward direction
         // Connects the last node to the new node
        if(head == null) {
            head = aNode;
            tail = aNode;
        } else {
            // Node current = head;
            // while(current.next != null) {
            //     current = current.next;
            // }
            // current.next = aNode;
            tail.next = aNode;
            tail = aNode; //Update the tail reference
        }
        size++;
    }
    public void add(int index, T data) {
    }
    public T remove(int index) {
        return null;
    }
    public T get(int index) { //O(n)
        if(index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.next; //move to the next node
        }
        //System.out.println("Data of the node at index " + index + ": " + current.data);
        return current.data;
    }
    public int size() {
        return size;
    }
    public String toString() {
        if(head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while(current.next != null) {
            //System.out.print(current.data + " -> ");
            sb.append(current.data + ", ");
            current = current.next; //move to the next node
        }
        //System.out.println(current.data); //print the last node
        sb.append(current.data + "]");
        return sb.toString();

    }
}
