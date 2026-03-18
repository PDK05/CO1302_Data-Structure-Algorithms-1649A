public class Ex02 {
    public static void main(String[] args) {
        //Loop statement: for, while, do-while

        int n = 10;
        //for loop:
        int i = 1;
        for(; i <= n; ) {
            System.out.println("i = " + i);
            i++;
        }
        //while loop:
        int j = 1;                      //1. Initilizate counter
        while(j <= n) {                 //2. Loop condition
            System.out.println("j = " + j);
            j = j * 2;                  //3. Update counter
        }
        //do-while loop:
        int k = 1;
        do {
            System.out.println("k = " + k);
            k = k * 2;
        } while(k <= n);
    }
        
}
