import java.util.*;

class MaxSubArray {
        static int maxSubArray(int[] nums) {
            int max_sum=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                if(sum>max_sum){
                    max_sum=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            return max_sum;
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
        System.out.println("Maximum Subarray: "+maxSubArray(nums));
        }
}
