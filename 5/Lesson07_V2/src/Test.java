import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        arr[count++] = 9;
        arr[count++] = 5;
        arr[count++] = 6;
        arr[count++] = 7;
        // System.out.println("# of elements in used in 'arr': " + count);
        // System.out.println("Length of 'arr': " + arr.length);
        // System.out.println("arr[] = " + Arrays.toString(arr));

        //ArrayList<Integer> aList = new ArrayList<>();
        MyArrayList<Integer> aList = new MyArrayList<>();
        aList.add(9);
        aList.add(5);
        aList.add(6);
        aList.add(7);
        //aList.add(200, 100);
        int removedElement = aList.removeLast();
        System.out.println("Removed element: " + removedElement);
        System.out.println("# of elements in used in 'aList': " + aList.size());
        //System.out.println("Length of 'arr': " + arr.length);
        System.out.println("aList = " + aList);

        MyArrayList<String> bList = new MyArrayList<>();
        bList.add("Hello World");
        bList.add("Web Application");
        bList.add("Java");
        bList.add("Python");
        String deleted = bList.removeLast();
        System.out.println("Deleted element: " + deleted);
        System.out.println("# of elements in used in 'bList': " + bList.size());
        System.out.println("bList = " + bList);

    }
}
