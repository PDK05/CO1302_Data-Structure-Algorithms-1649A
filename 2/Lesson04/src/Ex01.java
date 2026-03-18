public class Ex01 {
    public static void main(String[] args) throws Exception {
        //Search algorithms:
        // Linear data structure (Array, Linked List): Linear search, Binary search
        // Tree: Binary Search Tree (BST)
        // Graph: Breadth-First Search (BFS), Depth-First Search (DFS)

        // Linear search implementation
        int[] arr = {10, -2, 9, 8, 0, 4, 2, -4, 9, 3};
        int target = 9;
        boolean found = false;
        // Find the first element statisfying the condition
        //for(int i = 0; i < arr.length; i++) {
        // Find the last element statisfying the condition???
        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                //break; // Stop the loop right after finding one element statisfying the condition
            }
            
        }
        if(!found) 
        //if(found==false)
            System.out.println("NOT FOUND");


// //
//         String[] names = {"John Paul", "John Doe", "Jane Doe", "Thomas Yoon", "John Smith"};
//         String str = "John";
// //
//         Product[] products = {
//             new Product("Apple", 100),
//             new Product("Banana", 200),
//             new Product("Cherry", 300),
//             new Product("Date", 400),
//             new Product("Elderberry", 500)
//         };
//         double lower_price = 200;
//         double upper_price = 400;

    }
}
