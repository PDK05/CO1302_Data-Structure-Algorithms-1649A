public class Node {
    private int data; // data stored in the node
    private Node next; // reference to the next node in the list

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node one = new Node(9);
        Node two = new Node(7);
        Node three = new Node(10);
        Node four = new Node(12);

        //Linking the nodes
        one.next = two;
        two.next = three;
        three.next = four;

        System.out.println("Data of the last node: " + four.data);              //12
        System.out.println("Data of the last node: " + one.next.next.next.data); //12

        //Accessing a node at a specific index
        int index = 2;
        Node current = one;
        for(int i = 0; i < index; i++) {
            current = current.next; //move to the next node
        }
        System.out.println("Data of the node at index " + index + ": " + current.data);

        //Printing the entire linked list
        current = one;
        while(current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next; //move to the next node
        }
        System.out.println(current.data); //print the last node

        //Adding a new node to the end of the list
        //1. Create a new node
        Node aNode = new Node(15);
        //2. Current example: Singly Linked List with forward direction
        // Connects the last node to the new node

        //Case 1: The last node is known
        //four.next = aNode;
        //Case 2: The last node is unknown
        current = one;
        while(current.next != null) {
            current = current.next;
        }
        current.next = aNode;
        ///////////////////
        //Printing the entire linked list
        current = one;
        while(current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next; //move to the next node
        }
        System.out.println(current.data); //print the last node

    }

}
