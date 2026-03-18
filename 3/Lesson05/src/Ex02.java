import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] arr = {11, -2, 3, 10, 5, 7, 10, 2};
        // int[] brr = Arrays.copyOf(arr, 5);
        System.out.println("arr[] = " + Arrays.toString(arr));
        
        // int[] brr = reverse(arr);
        // arr = brr;
        //arr = reverse(arr);

        reverseInPlace(arr);
        reverseInPlace(arr);
        System.out.println("arr[] = " + Arrays.toString(arr));
        //System.out.println("brr[] = " + Arrays.toString(brr));
    }

    private static int[] reverse(int[] arr) { //pure function: doesn't change the original input 
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[n-1-i];
        }
        return result;
    }
    private static void reverseInPlace(int[] arr) { //impure function: changes the original input
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
