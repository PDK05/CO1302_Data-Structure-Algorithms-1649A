public class App {
   /*
        Iteration (bottom-up) vs. Recursion (top-down) approach
    */
    public static void main(String[] args) {
        int n = 100; //n>=1
        // sum = 1 + 2 + 3 + ... + n
        //C1: Apply Guass's sum formula
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of C1 = " + sum);

        //C2: Iteration approach (bottom-up)
        sum = tinh(n);
        System.out.println("Sum of C2 = " + sum);
        
        //C3: Recursion approach (top-down)
        sum = tinhRecursion(n);
        System.out.println("Sum of C3 = " + sum);
    }
    private static int tinhRecursion(int n) { //Recursive function
        if (n == 1) 
            return 1;
        else 
            return tinhRecursion(n - 1) + n;
    }
    private static int tinh(int n) { //Iterative function
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
