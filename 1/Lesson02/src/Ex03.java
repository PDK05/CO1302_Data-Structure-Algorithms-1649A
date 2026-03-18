import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n = 10;
        int max = Integer.MIN_VALUE;
        double max2 = Double.NEGATIVE_INFINITY;
        int min = Integer.MAX_VALUE;
        // for(int i = 1; i <= n; i++) { //Repeat n times
        for(int i = 0; i < n; i++) { //Repeat n times
            int x = sc.nextInt();
            if(x > max) 
                max = x;
            // if(i==0) max = x;
            // else{
            //     if(x > max){
            //         max = x;
            //     }
            // }
        }
        System.out.println("Max number is: " + max);
    }
}
