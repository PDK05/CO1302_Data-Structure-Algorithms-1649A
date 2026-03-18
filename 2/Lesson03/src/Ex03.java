public class Ex03 {
    public static void main(String[] args) {
        int[] arr = {11, -2, 23, 14, 5, 8, 0, 2};

        //Average value
        double average = 0.0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1 && arr[i] >= 0){
                flag = true;
                sum += arr[i];
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }
        if(flag){
            average = (double)sum / arr.length;
            //Output:
            System.out.println("Average value: " + average);
            System.out.println("Max value: " + max);
            System.out.println("Min value: " + min);
        }else{
            System.out.println("No odd non-negative elements");
        }
    }
}
