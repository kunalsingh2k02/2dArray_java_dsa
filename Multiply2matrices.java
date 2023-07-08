class Solution {
    public int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
            }
        }
        
        return result;
    }
}

public class Multiply2matrices{
    public static void main(String[] args) {
        
    }
}
