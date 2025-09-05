package dsaUsingJava.Matrix;

public class Rotateby90degree {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        //reverse the column
        for(int i=0; i<n; i++){
            int st=0;int end=n-1;
            while(st<end){
                int tmp=mat[st][i];
                mat[st][i]=mat[end][i];
                mat[end][i]=tmp;
                st++;
                end--;
            }
        }
    }
}
