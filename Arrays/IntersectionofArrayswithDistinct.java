import java.util.HashSet;

public class IntersectionofArrayswithDistinct {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int n=a.length;
        int m=b.length;
        
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        
        for(int i=0; i<n; i++){
            set.add(a[i]);
        }
        for(int i: b){
            if(set.contains(i)) count++;
        }
        return count;
    }
}
