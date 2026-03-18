public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {10, 6, 4, 2, 0, -2};
        boolean asc = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){ //Kiểm tra điều kiện vi phạm tính chất tăng dần
                asc = false;
                break;
            }
        }
        boolean desc = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){ //Kiểm tra điều kiện vi phạm tính chất giảm dần
                asc = false;
                break;
            }
        }
        if(asc){
            System.out.println("Array is sorted in ascending order");
        }else if(desc){
            System.out.println("Array is sorted in descending order");
        }else{
            System.out.println("Array is UNSORTED");
        }
    }
}
