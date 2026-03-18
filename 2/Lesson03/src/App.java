import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Array is a data structure that stores a collection of elements of the same type.
        //Characteristics of Array:
        //1. Array is a fixed size.
        //2. Array is a linear data structure.
        //3. Array is a contiguous memory location.

        //Create an album of 5 songs
        // Declare & Initialize an array of strings
        String[] album = {"Song 1", "Song 2", "Song 3", "Song 4", "Song 5"};
        // Declare & Initialize an array of doubles
        double[] marks = {95.5, 85.0, 90.5, 88.0, 92.5};
        double[] heights = {150.0, 160.5, 170.0, 180.5, 190.0};
        int[] ages = {20, 21, 22, 23, 24};

        ///
        int x;
        x = 10; //Initialize ~ Assigning a value to a variable in the first time
        x = 20; //Re-assign
        int[] arr = {29, 2, -3, 4, 5, 19};
        //int[] brr = new int[10]; //Initialize an array of with length 10. All elements are 0 (default value).
        //int[] brr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] names = new String[5]; // default values of String array are null.
        boolean[] flags = new boolean[5]; // default values of boolean array are false.
        //boolean[] flags = {false, false, false, false, false};
        System.out.println(x); //Read
        System.out.println(arr);
        
        /////////////////
        int n = 10;//new Scanner(System.in).nextInt();
        int[] brr = new int[n]; 
        //10: length of 'brr' ~ capacity: the total number of elements that can be stored in the array.

        System.out.println(brr.length); //Read
        //brr.length = 20; //Error since The array is fixed size
        // We cannot change the length of the array by re-assigning new value to brr.length.

        //1. Accessing an element of an array via its position in the array ~ index
        // Index: 0 -> (Length - 1)
        System.out.println("First element of 'arr' is: " + arr[0]);
        System.out.println("Last element of 'arr' is: " + arr[arr.length - 1]);
      

        arr[arr.length - 1] = 100; //Update
        //arr[arr.length] = 100; //Error since the index is out of bounds

        //Compiled time error vs. Runtime error
        System.out.println("Last element of 'arr' is: " + arr[arr.length - 1]);
        System.out.println("Hello World");

        //2. Print all elements of an array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // int count = 0;
        // for(int i=1; i<=arr.length*2; i+=2){ // n times (n = arr.length)
        //     System.out.println(arr[count]);
        //     count++;b
        // }
        
        System.out.println(Arrays.toString(arr));

        // Print all elements of an array in reverse order
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[arr.length - 1 - i] + " ");
        }
        System.out.println();
    }
}
