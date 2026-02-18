package TwoPointer;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        int count=0;
        int slow=0,fast=0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
                count++;
            }
            fast++;
        }
        System.out.println(count);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
