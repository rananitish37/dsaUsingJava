public class TrappingRainWater {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int previousMax[]=new int[n];
        int nextMax[] = new int[n];

        int pMax=0;
        int fMax=0;
        
        for(int i=0; i<n; i++){
            if(pMax>arr[i]){
                previousMax[i]=pMax;
                continue;
            }
            previousMax[i]=0;
           pMax=arr[i];
        }
        for(int i=n-1; i>0; i--){
            if(fMax>arr[i]){
                nextMax[i]=fMax;
                continue;
            }
            nextMax[i]=0;
            fMax=arr[i];
           
        }
        int ans=0;
        for(int i=0; i<n ;i++){
            if(previousMax[i]<nextMax[i]){
               int diff =  previousMax[i]-arr[i];
                if(diff<0){
                    ans=ans+0;
                    continue;
                }
                ans = ans+diff;
            }else{
                int diff =  nextMax[i]-arr[i];
                if(diff<0){
                    ans=ans+0;
                    continue;
                }
                ans = ans+diff;
            }
        }
        return ans;
    }
}
