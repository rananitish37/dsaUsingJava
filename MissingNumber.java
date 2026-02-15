import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int n=5;
        int numbers[] = {2,3,1,5};

        HashSet<Integer> set = new HashSet<>();

        for(int i: numbers){
            set.add(i);
        }
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){ 
                System.out.println(i);
                break;
            }
        }
    }
}
