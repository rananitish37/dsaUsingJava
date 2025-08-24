package Arrays;

import java.util.Arrays;

public class TripletWhereA+B=C {
    int countTriplet(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int i=n-1; i>=2; i--){
            int start=0;
            int end=i-1;
            while(start<end){
                if(arr[start]+arr[end]==arr[i]){
                    count++;
                    start++;
                    end--;
                }else if(arr[start]+arr[end]<arr[i]){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return count;
}
