class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];  
        }
        if (n % 2 == 1) {
            int center = n / 2;
            sum -= mat[center][center];
        }
        
        return sum;
    }
}

public class MatrixDiagonalSum{
    public static void main(String[] args) {
        
    }
}
