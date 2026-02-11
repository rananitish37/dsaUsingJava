public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};

        int l=0;
        int r=height.length-1;
        int maxArea=0;
        while(l<=r){
            if(height[l]<=height[r]){
                maxArea = Math.max(maxArea, (r-l)*height[l]);
                l++;
            }else{
                maxArea = Math.max(maxArea, (r-l)*height[r]);
                r--;
            }
        }
        System.out.println(maxArea);
    }
}
