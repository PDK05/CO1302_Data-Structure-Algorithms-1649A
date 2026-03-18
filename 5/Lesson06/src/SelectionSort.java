import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 10, -2, 4, 8, 12, 8, 0, 10, 5, -3};

        //int[] brr = sort(arr, true);
        //arr = sort(arr);

        System.out.println(Arrays.toString(sort(arr, true)));
         System.out.println(Arrays.toString(sort(arr, false)));
    }
    public static int[] sort(int[] arr, boolean asc){
        int[] brr = Arrays.copyOf(arr, arr.length);
        //Process: sorting
        for(int i=0; i<brr.length-1; i++){
            int idx = find(brr, i, asc);
            swap(brr, idx, i);
        }
        return brr;
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int find(int[] arr, int start, boolean asc){
        int idx = start;
        for(int i=idx+1; i<arr.length; i++){
            //if(arr[i] < arr[idx])
            //if(arr[i] > arr[idx])
            if( (asc && arr[i] < arr[idx]) || (!asc && arr[i] > arr[idx]) )
                idx = i;
        }
        return idx; //the position of the minimum/maximum value
    }
}
