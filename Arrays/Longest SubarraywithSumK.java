public class Longest SubarraywithSumKWithTLE {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum=sum+arr[j];
                if(sum==k && ((j-i)+1)>ans){
                    ans=(j-i)+1;
                }
            }
        }
        return ans;
    }
}
