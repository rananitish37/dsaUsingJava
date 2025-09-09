package dsaUsingJava.Matrix;

public class RotateLeftByKOptimal {
    int[][] rotateMatrix(int k, int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            int shift = k % m;
            if (shift == 0) continue;

            reverse(mat[i], 0, shift - 1);
            reverse(mat[i], shift, m - 1);
            reverse(mat[i], 0, m - 1);
        }
        return mat;
    }

    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
