import java.util.HashMap;
import java.util.Map;

public class MAjorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n=nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int majority=Integer.MIN_VALUE;
        int ans=0;
        for(Map.Entry<Integer, Integer> entries: map.entrySet()){
            if(entries.getValue()>majority){
                majority=entries.getValue();
                ans=entries.getKey();
            }
        }
        return ans;
    }
}
