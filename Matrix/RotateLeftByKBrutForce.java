package dsaUsingJava.Matrix;

public class RotateLeftByKBrutForce {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int n=mat.length; int m=mat[0].length;
        
        for(int i=0; i<n; i++){
            int k1 = k%m;
            while(k1-- > 0){
                int temp = mat[i][0];
                for(int j=1; j<m; j++){
                    mat[i][j-1]=mat[i][j];
                }
                mat[i][m-1]=temp;
            }
            
        }
        return mat;
    }
}
