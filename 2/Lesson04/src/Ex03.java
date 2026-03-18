import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] arr = {10, -2, 9, 8, 0, 4, 2, -4, 9, 3};
        int threshold = 0;
        // elements < threshold: left side
        // elements >= threshold: right side

        System.out.println("arr[] = " + Arrays.toString(arr));
        // C2: swap elements
        int left = 0;
        int temp;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < threshold) {
               //swap(arr, left, i);
               temp = arr[left];
               arr[left] = arr[i];
               arr[i] = temp;
               left++;
            }
        }
        System.out.println("arr[] = " + Arrays.toString(arr));
    }
}
