public class CircularDeliveryRouteProfit {
    public static void main(String[] args) {
        int profit[] = {8, -4, 3, -5, 4};

        int total=0;
        int maxSum=profit[0]; int currMax = 0;
        int minSum=profit[0]; int currMin = 0;
        for(int x: profit){
            total += x;

            currMax = Math.max(currMax+x, x);
            maxSum = Math.max(currMax, maxSum);
            currMin = Math.min(currMin+x, x);
            minSum = Math.min(currMin, minSum);
        }
        if(maxSum <0){
            System.out.println(maxSum);
            return;
        }

        System.out.println(Math.max(maxSum, total-minSum));
    }
}
