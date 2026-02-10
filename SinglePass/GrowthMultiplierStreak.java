public class GrowthMultiplierStreak {
    public static void main(String[] args) {
        int multiplier[] = {2,3,-2,4};

        int ans = multiplier[0];
        int maxEnding = multiplier[0];
        int minEnding = multiplier[0];
        for(int i=1; i<multiplier.length; i++){
            int curr = multiplier[i];
            int tempMax = Math.max(curr, Math.max(minEnding*curr, maxEnding*curr));
            int tempMin = Math.min(curr, Math.min(minEnding*curr, maxEnding*curr));

            maxEnding = tempMax;
            minEnding = tempMin;

            ans = Math.max(ans, maxEnding);
        }

        System.out.println(ans);
    }
}
