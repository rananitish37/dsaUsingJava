public class BestStreakofAudienceEngagement {
    public static void main(String[] args) {
        int []engagement={-50, +120, -30, +200, -20, +100, -300};

        int curr = engagement[0];
        int best = engagement[0];

        for (int i = 1; i < engagement.length; i++) {
            curr = Math.max(engagement[i], curr+engagement[i]);
            best = Math.max(curr, best);
        }
        System.out.println(best);
    }
}
