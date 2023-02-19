import java.util.*;

public class RotateLeft {
        static void leftRotate(int[] nums, int n, int k) {
            // code here
           
            int[] temp = new int[k];
            for(int i=0;i<k;i++){
                temp[i]=nums[i];
            }
            
    
            for(int i=0;i<=nums.length-1-k;i++){
                nums[i]=nums[i+k];
             
            }
          
            for(int i=0;i<k;i++){
                nums[nums.length-k+i]=temp[i];
            }
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
             System.out.println("Enter the number of rotations: ");
            int k = sc.nextInt();
            leftRotate(nums,n,k);
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }
    
}
