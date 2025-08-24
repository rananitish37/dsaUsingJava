package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnioArray1 {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int t=m;
        if(n>m){
            t=n;
        }
        for(int i=0; i<t; i++){
            if(i<n && !ans.contains(a[i])){
                ans.add(a[i]);
            }
            if(i<m && !ans.contains(b[i])){
                ans.add(b[i]);
            }
        }
        return ans;
    }
}
