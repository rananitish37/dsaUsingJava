package TwoPointer;

import java.util.Arrays;

public class ValidTriangle {
    public static void main(String[] args) {
        int nums[]={4,2,3,4};
         int n=nums.length;
       Arrays.sort(nums);
        int count=0;
       for(int k=n-1; k>-2; k--){
        int i=0, j=k-1;
        while(i<j){
            if((nums[i]+nums[j])>nums[k]){
                count += j-i;
                j--;
            }else i++;
        }
       }
       System.out.println(count);
    }
}
