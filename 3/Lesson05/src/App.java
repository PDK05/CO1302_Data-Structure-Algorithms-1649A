public class App {
    public static void main(String[] args) throws Exception {
            /*
            Review Function in Java
            - Why we need functions?: - Reuse a piece of codes effectively in different contexts
                Scope: (1) Within a class (2) Within a project (3) Within a workspace
            - How to declare a function?
            - How to call a function?
            */
        int[] arr = {9, 10, -5, 12, 8, 9, 0, 2, 4};
        int max = findMax(arr);// Call/Use a function (function call)
        System.out.println("Max value of arr: " + max);

        int[] brr = {10, -3, 10, 9, 2};
        max = findMax(brr);
        System.out.println("Max value of brr: " + max);
    }
    // Function declaration
    // Main component of a function: (1) Function name; (2) Parameters; (3) Return type; (4) Function implementation
    /* 
            (1) Function name: findMax(), find_max(), FindMax(), register(), registerCourse()
                Improper: maximum(), loveYouSoMuch(), 9ToSpring()
                Naming convention: camelCase, snake_case, PascalCase

            (2) Parameters: int[] x
                - Parameters are optional
                - Parameters are inputs of a function
            (3) Return type: int 
                - Return type: data type of exptected output of the function
         */
    private static int findMax(int[] x) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max; //returned value
    }
}
