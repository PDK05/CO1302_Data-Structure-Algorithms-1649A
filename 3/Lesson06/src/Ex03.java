public class Ex03 {
    public static void main(String[] args) {
        //3. Create a recursive function to find an element in an array
        int[] arr = {10, -2, 13, 4, 2, 10, 17, 8, 0, 3};
        int target = 17;
        // boolean found = search(arr, target);
        // System.out.println("Is " + target + " in array? " + found);
        // int idx = search(arr, target);
        int idx = search(arr, target, 0, arr.length-1);
        if(idx == -1)
            System.out.println(target + " is not in array");
        else
            System.out.println(target + " is at index " + idx);
    }
    private static int search(int[] arr, int target, int start, int end) {
        //Find last occurrence of target in arr[start..end]
        // if(end < start)
        //     return -1;
        // else{
        //     return (arr[end] == target) ? end : search(arr, target, start, end-1);
        // }

        //Find first occurrence of target in arr[start..end]
        if(start > end)
            return -1;
        else
            return (arr[start] == target) ? start : search(arr, target, start+1, end);
    }
    private static int search(int[] arr, int target) { // index>=0
        for(int i=arr.length-1; i >=0; i--) { //Last occurrence
        // for(int i=0; i<arr.length; i++) { //First occurrence
            if(arr[i] == target)
                return i;
        }
        return -1; //NOT FOUND
    }
}
