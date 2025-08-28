public class Kadane'sAlgo {
    
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int sum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<n; i++){
            currSum +=arr[i];
            if(currSum>sum){
                sum = currSum;
            }
            
            if(currSum<0){
                currSum=0;
            }
        }
        return sum;
    }
}
