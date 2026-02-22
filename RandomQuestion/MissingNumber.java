
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        // int n=5;
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int nums[] = new int[n-1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            set.add(i);
        }
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){ 
                System.out.println(i);
                break;
            }
        }

        // int xor=0;
        // for(int i=0; i<nums.length; i++){
        //     xor = xor^nums[i]^i;
        // }
        // xor = xor^nums.length;
        // System.out.println(xor);
    }
}
