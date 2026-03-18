import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] arr = {10, -2, 9, 8, 0, 4, 2, -4, 9, 3};
        System.out.println("arr[] = " + Arrays.toString(arr));

        //C1: Create temporary array
        // int[] temp = new int[arr.length];
        // System.out.println("temp[] = " + Arrays.toString(temp));
        // for(int i = 0; i < arr.length; i++) {
        //     temp[i] = arr[arr.length - 1 - i];
        // }
        // System.out.println("temp[] = " + Arrays.toString(temp));
        // //Optional: Perform this change in the original array
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = temp[i];
        // }
        //C2: Swap elements
        int n = arr.length;
        int x;
        for(int i = 0; i <= (n-1) / 2; i++) {
            //swap(arr, i, n-1-i);
            x = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = x;
        }
        //Output:
        System.out.println("arr[] = " + Arrays.toString(arr));
    }
}
