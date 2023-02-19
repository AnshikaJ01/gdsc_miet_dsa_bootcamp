import java.util.*;

class SortColors {
        static void sortColors(int[] nums) {
            int red=0, white=0,blue=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    red++;
                }
                else if(nums[i]==1){
                    white++;
                }
                else{
                    blue++;
                }
            }
            for(int i=0;i<red;i++){
                nums[i]=0;
            }
            for(int i=red;i<red+white;i++){
                nums[i]=1;
            }
            for(int i=white+red;i<nums.length;i++){
                nums[i]=2;
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
             
            sortColors(nums);
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }
}
