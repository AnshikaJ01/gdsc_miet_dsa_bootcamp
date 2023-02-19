import java.util.*;

public class Duplicate_Number {
        public static int findDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i = 1; i < nums.length; i++){
                if(nums[i] == nums[i-1]){
                    return nums[i];
                }
            }
            return -1; 
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of elements in array: ");
            int n = sc.nextInt();
            System.out.println("Enter elements: ");
            int[] nums = new int[n+1];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
             }
             if(findDuplicate(nums)== -1){
                System.out.println("Duplicate Element not found");
             }
             else{
             System.out.println(findDuplicate(nums));}
        }
        }
    

