import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int z;

        //C1:
        // int max = 0;
        // if (a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }
        int d = 7;
        int max = (a > b) ? a : b; //Conditional operator
        // max = (max > c) ? max : c;
        // max = (max > d) ? max : d;
        if(max < c) max = c;
        if(max < d) max = d;

        //C2:
        
        if(a >=b && a >=c && a >=d)
            max = a;
        else if(b >=a && b >=c && b >=d)
            max = b;
        else if(c >=a && c >=b && c >=d)
            max = c;
        else
            max = d;
        System.out.println("Max number is: " + max);

        sc.close();
      
    }
}
