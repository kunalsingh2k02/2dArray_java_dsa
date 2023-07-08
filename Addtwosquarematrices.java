class Solution {
    public void matrixAddition(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Addtwosquarematrices{
    public static void main(String[] args) {
        
    }
}

