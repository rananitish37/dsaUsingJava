import java.util.Scanner;

public class Repeatations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int maxCount=1;
        int currCount=1;
        char item=input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i)!=item){
                item=input.charAt(i);
                if (currCount>maxCount) {
                    maxCount=currCount;
                }
                currCount=1;
                continue;
            }
            currCount++;
        }
        if (currCount>maxCount) {
            maxCount=currCount;
        }
        System.out.println(maxCount);
    }
}
