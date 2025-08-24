import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        if(arr.length<3) return false;
        Arrays.sort(arr);
        
        for(int start=0; start<arr.length-2; start++){
            int mid=start+1;
            int end=arr.length-1;
        
            while(mid<end){
                int sum=arr[start]+arr[mid]+arr[end];
                if(sum==target) return true;
                else if(sum>target){
                    end--;
                }else{
                    mid++;
                }
            }
        }
        return false;
    }
}
