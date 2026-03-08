package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int head=-1,tail=0;
        int maxLength =0;
        HashSet<Character> set = new HashSet<>();

        while(tail < n){

            while(head+1 < n && !set.contains(s.charAt(head+1))){
                set.add(s.charAt(head+1));
                head++;
            }
            maxLength = Math.max(maxLength, head-tail+1);

            
                set.remove(s.charAt(tail));
                tail++;
            
            

        }
        return maxLength;
    }
}
