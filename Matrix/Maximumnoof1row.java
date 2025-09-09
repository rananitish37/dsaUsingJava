package dsaUsingJava.Matrix;

import java.util.HashMap;
import java.util.Map;

public class Maximumnoof1row {
     public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int row=0;
        int col=0;
        while(row<N){
            if(col==M){
                col=0;
                row++;
                continue;
            }
            if(Mat[row][col] == 1){
                map.put(row, map.getOrDefault(row, 0)+1);
            }
            
            col++;
        }
        
        int maxIdx=0;
        int maxVal=0;
        for(Map.Entry<Integer, Integer> entries: map.entrySet()){
            if(entries.getValue() > maxVal){
                maxVal = entries.getValue();
                maxIdx = entries.getKey();
            }
        }
        return maxIdx;
    }
}
