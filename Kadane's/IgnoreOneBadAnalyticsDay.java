public class IgnoreOneBadAnalyticsDay {
    public static void main(String[] args) {
        int arr[] = {1,-2,0,3};
        maximumSum(arr);
    }
    public static int maximumSum(int[] arr) {
        int n = arr.length;
        int dp0 = arr[0];   
        int dp1 = 0;       
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            dp1 = Math.max(dp0, dp1 + arr[i]);
            dp0 = Math.max(arr[i], dp0 + arr[i]);
            ans = Math.max(ans, Math.max(dp0, dp1));
        }
        
        return ans;
    }
}
