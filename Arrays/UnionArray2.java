package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray2 {
     public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int t=m;
        if(n>m){
            t=n;
        }
        for(int i=0; i<t; i++){
            if(i<n){
                set.add(a[i]);
            }
            if(i<m){
                set.add(b[i]);
            }
        }
        for(Integer i: set){
            ans.add(i);
        }
        return ans;
    }
}
