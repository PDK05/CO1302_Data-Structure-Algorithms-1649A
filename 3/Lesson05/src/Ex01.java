import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        // (1) Write a function that performs linear search: 
        //      find the index of a target value in an array
        // (2) Write a function to reverse a given array

        int[] arr = {11, -2, 3, 10, 5, 7, 10, 2};
        int target = 10;
        int index = search(arr, target);
        if(index!=-1){
            System.out.println("Index of " + target + " is " + index);
        }else{
            System.out.println("NOT FOUND");
        }
        System.out.println("-------------------");
        //int[] result = searchAll(arr, target);
        ArrayList<Integer> result = searchAll(arr, target);
        //if(result.length>0){
        if(result.size()>0){
            System.out.println("Indexes of " + target + " are " + result);
        }else{
            System.out.println("NOT FOUND");
        }
    }
    private static int search(int[] arr, int target) { //expect the index of the target value, index>=0
        //for (int i = 0; i < arr.length; i++) { //first occurrence
        for (int i = arr.length-1; i >=0; i--) { //last occurrence
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; //NOT FOUND
    }
    private static ArrayList<Integer> searchAll(int[] arr, int target) { 
        // int[] result = new int[arr.length];
        // int count = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == target) {
                //result[count++] = i;
                result.add(i);
            }
        }
        //return Arrays.copyOf(result, count);
        return result;
    }
}
