import java.util.HashMap;
import java.util.Map;

public class SubarraywithSumK {
     Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        prefixMap.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixMap.containsKey(prefixSum - k)) {
                int subarrayLength = i - prefixMap.get(prefixSum - k);
                if (subarrayLength > maxLength) {
                    maxLength = subarrayLength;
                }
            }
            prefixMap.putIfAbsent(prefixSum, i);
        }
        return maxLength;
}
