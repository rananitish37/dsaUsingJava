package dsaUsingJava.Matrix;

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0; i<n; i++){
            int start=0;
            int end=m-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(matrix[i][mid]==target){
                    return true;
                }
                else if(matrix[i][mid] > target){
                    end--;
                }else{
                    start++;
                }
            }
        }

        return false;
    }
}
