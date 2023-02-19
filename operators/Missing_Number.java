
public class Missing_Number{
    static int missingNumber(int A[], int N){
        int n=N-1;
        int sum1=N*(N+1)/2;
        int sum2=0;
        
        for(int i=0;i<n;i++){
              sum2=sum2+A[i];
        }
        return sum1-sum2;
    }
    public static void main(String args[]){
        int[] arr={1,2,4,3};
        System.out.println(missingNumber(arr,5));

    }
}