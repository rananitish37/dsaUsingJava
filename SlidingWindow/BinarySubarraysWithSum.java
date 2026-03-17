package SlidingWindow;

public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int nums[] ={1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    // Counts subarrays with sum <= k
    private  static int atMost(int[] nums, int k) {
        if (k < 0)
            return 0; // important when goal-1 becomes -1
        int n = nums.length;
        // Define tail and head
        int tail = 0, head = -1;
        // Define the DataStructure used in the window
        int sum = 0;

        // Maintain answer (count of valid subarrays)
        int ans = 0;
        // For each start
        while (tail < n) {
            // Eat as many elements as possible until condition is valid
            // validity: sum <= k, so expand while next keeps sum <= k
            while (head + 1 < n && sum + nums[head + 1] <= k) {
                // Add to the Data Structure
                sum += nums[head + 1];
                head++;
            }
            // Update answer for current state:
            // For fixed tail, any end in [tail..head] makes sum <= k
            // => number of subarrays starting at tail = (head - tail + 1)
            ans += (head - tail + 1);
            // Reset
            if (tail > head) {
                tail++;
                head = tail - 1;
            } else {
                // Remove from DataStructure
                sum -= nums[tail];
                // Shrink the window
                tail++;
            }
        }
        return ans;
    }
}
