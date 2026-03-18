public class Ex01 {
    public static void main(String[] args) {
        //1. Create a recursive function to calculate the sum of 
        //   all even numbers in range [A, B]

        //2. Create a recursive function to find the maximum value in an array
        //3. Create a recursive function to find an element in an array


        //
        int A = 11;
        int B = 214;
        //C2: Iteration
        int start = (A%2) == 0 ? A : A+1;
        int sum = 0;
        for(int i = start; i <= B; i += 2) {
            sum += i;
        }
        System.out.println("Sum of C2 = " + sum);
        // C3: Recursion
        int end = (B%2) == 0 ? B : B-1;
        sum = tinhRecursion(start, end);
        System.out.println("Sum of C3 = " + sum);
    }
    private static int tinhRecursion(int start, int end) {
        if (start == end) 
            return start;
        else
            return tinhRecursion(start, end-2) + end;
        // if (start == end) 
        //     return end;
        // else
        //     return start + tinhRecursion(start + 2, end);
    }
}
