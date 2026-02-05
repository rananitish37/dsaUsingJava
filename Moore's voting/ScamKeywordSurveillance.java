import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class ScamKeywordSurveillance {
    public static void main(String[] args) {
        int[] keywords = {7, 3, 7, 2, 7, 3, 7, 5};
        int k = 4;

        HashMap<Integer, Integer> candidates = new HashMap<>();

        for (int x : keywords) {
            if (candidates.containsKey(x)) {
                candidates.put(x, candidates.get(x) + 1);
            } 
            else if (candidates.size() < k - 1) {
                candidates.put(x, 1);
            } 
            else {
                Iterator<Map.Entry<Integer, Integer>> it = candidates.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, Integer> entry = it.next();
                    entry.setValue(entry.getValue() - 1);
                    if (entry.getValue() == 0) {
                        it.remove();
                    }
                }
            }
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : keywords) {
            if (candidates.containsKey(x)) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        }

        System.out.println("Elements appearing more than n/k times:");
        for (int key : freq.keySet()) {
            if (freq.get(key) > keywords.length / k) {
                System.out.println(key);
            }
        }
    }
}
