import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
    //    LinkedList<Integer> aList = new LinkedList<>();
       //LinkedList ADT in java.util is implemented as a doubly linked list

       MyLinkedList<Integer> aList = new MyLinkedList<>();
       System.out.println(aList);
       aList.add(9);
       aList.add(7);
       aList.add(12);
       aList.add(15);

      //aList.add(1, 55);
       System.out.println(aList); // 9, 7, 12, 15
       System.out.println("Element at index 3: " + aList.get(3)); //15



      // System.out.println("Removed element: " + aList.remove(2)); // 7
      // System.out.println(aList); // 9, 55, 12, 15

    
    }
}
