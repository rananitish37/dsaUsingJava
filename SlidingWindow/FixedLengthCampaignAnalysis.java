public class FixedLengthCampaignAnalysis {
    public static void main(String[] args) {
        int []performance = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n=performance.length;
        double windowSum=0;

        for(int i=0; i<k; i++) windowSum += performance[i];

        double maxSum=windowSum;

        for (int i = k; i < n; i++) {
            windowSum = windowSum - performance[i-k]+performance[i];

            if(windowSum>maxSum)maxSum=windowSum;
        }

        System.out.println(maxSum);
    }
}
