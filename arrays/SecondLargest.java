import java.util.*;

class SecondLargest {
     static int print2largest(int arr[], int n) {
            // code here
           Arrays.sort(arr);
           for(int i=arr.length-1;i>0;i--){
               if(arr[i]!=arr[i-1]){
                   return arr[i-1];
               }
           }
           return -1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of elements in array: ");
            int n = sc.nextInt();
            System.out.println("Enter elements: ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
             }
             if(print2largest(nums,n)== -1){
                System.out.println("Second largest Element not found");
             }
             else{
             System.out.println(print2largest(nums,n));}
        }
        }
    

