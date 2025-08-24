import java.util.Arrays;

class Solution0 {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        if(arr.length==1)return false;
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]+arr[end] == target){
                return true;
            }else if(arr[start]+arr[end]<target){
                start++;
            }else{
                end--;
            }
            
        }
        return false;
    }
}