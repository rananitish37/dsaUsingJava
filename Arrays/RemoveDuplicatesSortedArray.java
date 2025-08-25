package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesSortedArray {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(!map.containsKey(arr[i]) || map.get(arr[i]) == 0){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entries: map.entrySet()){
            if(entries.getValue()==1){
                ans.add(entries.getKey());
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
