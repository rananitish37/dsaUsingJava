package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        // define tail and head
        int tail = 0, head=-1;
        
        // define the data structure inside the window
        int sum=0;

        //maintain answer
        int minLength = Integer.MAX_VALUE;

        // for every start
        while(tail<n){

            //eat as many as possible
            while(head+1<n && sum < target){
                head++;
                sum += nums[head];
            }

            if(sum >= target){
                minLength = Math.min(minLength, head-tail+1);
            }
           
            //Shrink / remove from data structure
            if(tail>head){
                tail++;
                head = tail-1;
            }else{
                sum -= nums[tail];
                tail++;
            }   
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
