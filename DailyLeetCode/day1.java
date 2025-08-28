package dsaUsingJava.DailyLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Date: 28/08/2025
public class day1 {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        //for rows
        for(int i=0; i<n; i++){
            sortTheElem(i, 0, grid);
        }   
        //for columns
        for(int i=1; i<m; i++){
            sortTheElem(0, i, grid);
        }    

        return grid;
    }
    public void sortTheElem(int i, int j, int grid[][]){
        int n=grid.length;
        int m = grid[0].length;
        List<Integer> list = new ArrayList<>();
        int r=i;
        int c=j;
        while(r<n && c<m){
            list.add(grid[r++][c++]);
        }

        if(j==0){
            Collections.sort(list, Collections.reverseOrder());
        }else{
            Collections.sort(list);
        }
       

        //put back
        int elm=0;
        r=i;c=j;
        while(r<n && c<m){
            grid[r++][c++]=list.get(elm++);
        }
    }
}
