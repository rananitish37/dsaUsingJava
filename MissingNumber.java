import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        // int n=5;
        int nums[] = {2,3,1,5};

        // HashSet<Integer> set = new HashSet<>();

        // for(int i: numbers){
        //     set.add(i);
        // }
        // for(int i=1; i<=n; i++){
        //     if(!set.contains(i)){ 
        //         System.out.println(i);
        //         break;
        //     }
        // }

        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor = xor^nums[i]^i;
        }
        xor = xor^nums.length;
        System.out.println(xor);
    }
}
