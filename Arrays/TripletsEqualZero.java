package Arrays;

import java.util.Arrays;

public class TripletsEqualZero {
     public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0; i<n-2; i++){
            int start=i+1;
            int end=n-1;
            
            while(start<end){
                int sum = arr[start]+arr[end]+arr[i];
                if(sum==0){
                    return true;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }
}
