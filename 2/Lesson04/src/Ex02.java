import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] arr = {10, -2, 9, 8, 0, 4, 2, -4, 9, 3};
        int threshold = 0;
        // elements < threshold: left side
        // elements >= threshold: right side

        System.out.println("arr[] = " + Arrays.toString(arr));
        // C1: Create temporary arrays
        int[] temp = new int[arr.length];
        // int left = 0, right = arr.length-1;
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] < threshold) {
        //         temp[left] = arr[i];
        //         left++;
        //     }else{
        //         temp[right] = arr[i];
        //         right--;
        //     }
        // }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < threshold) {
                temp[count] = arr[i];
                count++;
            }     
        }
        for(int i = count; i < arr.length; i++) {
            if(arr[i] >= threshold) {
                temp[count] = arr[i];
                count++;
            }   
        }
        //Optional: Perform this change in the original array
        // Copy elements from temp[] to arr[]
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        System.out.println("temp[] = " + Arrays.toString(temp));
        System.out.println("arr[] = " + Arrays.toString(arr));
       
    }
}
