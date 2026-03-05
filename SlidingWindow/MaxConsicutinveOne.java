package SlidingWindow;

public class MaxConsicutinveOne {
    public static void main(String[] args) {
        int []nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {

        int n = nums.length;

        int head = -1, tail = 0;

        // what data structure we will use inside window
        int countZero = 0;

        int ans = 0;

        while (tail < n) {

            while ((head + 1 < n) && (nums[head + 1] == 1 || countZero < k)) {
                // add/increament ds
                if (nums[head + 1] == 0) {
                    countZero++;
                }
                head++;
            }
            ans = Math.max(ans, head - tail + 1);

            if (tail > head) {
                tail++;
                head = tail - 1;
            } else {
                // srink widnow + remove from DS
                if (nums[tail] == 0) {
                    countZero--;
                }
                tail++;
            }
        }
        return ans;
    }
}
