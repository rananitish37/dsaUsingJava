class MaximumProductSubarray
    {
        int maxProduct(int[] arr) {
            // code here
            int n=arr.length;
            // for(int i=0; i<n; i++){
            //     int currPro=1;
            //     for(int j=i; j<n; j++){
            //         currPro = currPro*arr[j];
            //         if(currPro>ans){
            //             ans=currPro;
            //         }
            //     }
            // }
            
            
            int max = arr[0];
            int min = arr[0];
            int ans = arr[0];
            for(int i=1; i<n; i++){
                if (arr[i] == 0) {
                    max = 0;
                    min = 0;
                    ans = Math.max(ans, 0);
                    continue;
                }
                int tempMax = max;
                max = Math.max(arr[i], Math.max(arr[i] * max, arr[i] * min));
                min = Math.min(arr[i], Math.min(arr[i] * tempMax, arr[i] * min));
            
                ans = Math.max(ans, max);
            }
            
            return ans;
        }
    
}
