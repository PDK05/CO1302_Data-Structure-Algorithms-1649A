public class Ex02 {
     //2. Create a recursive function to find the maximum value in an array
    public static void main(String[] args) {
        int[] arr = {10, -2, 13, 4, 2, 10, 17, 8, 0, 3};
        int idMax = find(arr, 0, arr.length-1);
        System.out.println("Max = " + arr[idMax] +", at index = " + idMax);
    }
    private static int findMax(int[] arr) {
        int idMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[idMax]) {
                idMax = arr[i];
            }
        }
        return idMax;
    }
    private static int find(int[] arr, int start, int end) { //returns index of max value
        if(end == start)
            return start;
        else{
            //return Math.max(arr[end], find(arr, start, end-1));
            int x = find(arr, start, end-1);
            return (arr[end] > arr[x]) ? end : x;
        }       
    }
}
