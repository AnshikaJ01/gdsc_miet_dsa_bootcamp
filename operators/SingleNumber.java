public class SingleNumber {
    static int singleNumber(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    break;
                }
            }
            if(j==nums.length){
                for(j=0;j<i;j++){
                    if(nums[i]==nums[j]){
                        break;
                    }
                }
                if(j==i)
                return nums[i];
            }
        }
        return nums[i];
    }
    public static void main(String args[]){
        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
