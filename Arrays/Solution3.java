import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates
                
                int start = j + 1;
                int end = n - 1;
                
                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        
                        // move start forward skipping duplicates
                        while (start < end && nums[start] == nums[start + 1]) start++;
                        // move end backward skipping duplicates
                        while (start < end && nums[end] == nums[end - 1]) end--;
                        
                        start++;
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ans;
    }
}