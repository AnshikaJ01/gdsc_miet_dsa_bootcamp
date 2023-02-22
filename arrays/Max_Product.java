import java.util.*;

class Max_Product {
    static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           int product=1;
           for(int j=i;j<nums.length;j++){
               product *=nums[j];
               if(product>max){
                   max=product;
         
               }
           }
       }
       return max;
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
    System.out.println("Maximum Product Subarray: "+maxProduct(nums));
}
}
