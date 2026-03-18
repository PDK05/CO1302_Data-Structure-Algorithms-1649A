public class Ex01 {
   //1. Print all digits of a number
   //2*. Find the largest number establish by digits of a number
   //3. Given an array of integers, find the average of all elements
   //4. Given an array of integers
   //   , search for a target number and return its position(s)

   public static void main(String[] args) {
        int n = 1904;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        do{
            System.out.println(n % 10);
            sum += n % 10;
            if(n % 10 > max){
                max = n % 10;
            }
            n = n/10;
        }while(n != 0);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Max digit: " + max);
   }
}
 