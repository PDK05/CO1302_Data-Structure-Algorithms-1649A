import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        int count = 0;
        //10: length of the array ~ capacity: 
        //  the total number of elements that can be stored in the array
        // The length of the array must be defined at the time of creation
        int[] brr = {9, 10, 2, 0, -2, 10, 5}; //Length: 7

        // size/count: the current number of elements in used 
        // count in 'arr' = 0
        // count in 'brr' = 7

        // Q1. Add a new element to the array
        int value = 50;
        arr[count] = value;
        count++;
        brr[0] = value; //Wrong as the value of the first element is lossed

        // Assign new value to the next position 
        arr[count++] = 10;
        arr[count++] = 20;
        arr[count++] = 30;
        arr[count++] = 40;
        arr[count++] = 50;
        arr[count++] = 60;
        arr[count++] = 70;
        arr[count++] = 80;
        arr[count++] = 90;
        System.out.println("# of elements in used in 'arr': " + count);
        System.out.println("Length of 'arr': " + arr.length);
        System.out.println("arr[] = " + Arrays.toString(arr));

        if(count == arr.length) {
            //C1: Show error message. Ingnore adding new element

            //C2: Expand the array -> Increase the length/capacity
            // int[] newArray = new int[arr.length * 2];
            // for(int i = 0; i < arr.length; i++) {
            //     newArray[i] = arr[i];
            // }
            // arr = newArray; //Update the new address of the array 'arr'
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        //brr[7] = 555; //ArrayIndexOutOfBoundsException
        arr[count++] = 555; //ArrayIndexOutOfBoundsException
        System.out.println("# of elements in used in 'arr': " + count);
        System.out.println("Length of 'arr': " + arr.length);
        System.out.println("arr[] = " + Arrays.toString(arr));

        //
        int countB = brr.length;
        if(countB == brr.length) {
            brr = Arrays.copyOf(brr, brr.length * 2);
        }
        brr[countB++] = 555;
//
        if(countB == brr.length) {
            brr = Arrays.copyOf(brr, brr.length * 2);
        }
        brr[countB++] = 666;
//
        if(countB == brr.length) {
            brr = Arrays.copyOf(brr, brr.length * 2);
        }
        brr[countB++] = 777;
        System.out.println("# of elements in used in 'brr': " + countB);
        System.out.println("Length of 'brr': " + brr.length);
        System.out.println("brr[] = " + Arrays.toString(brr));

        //Q2. Insert a new element at a specific position
        System.out.println("--------------------------------");
        System.out.println("arr[] = " + Arrays.toString(arr));
        int index = 3;
        value = -5;

        if(count == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        //C1: Time complexity: O(1), Limitation: Loss the original linear order
        // arr[count] = arr[index];
        // arr[index] = value;
        // count++;
        //C2: Time complexity: O(n), Advantage: Keep the original linear order
        // Shift the elements to the right one position
        for(int i = count - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        count++;

        System.out.println("# of elements in used in 'arr': " + count);
        System.out.println("Length of 'arr': " + arr.length);
        System.out.println("arr[] = " + Arrays.toString(arr));

       
    }
}
