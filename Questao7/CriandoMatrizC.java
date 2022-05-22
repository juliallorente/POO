package Questao7;

public class CriandoMatrizC {

    public void criandoMatiz(int[][] A, int[][] B, int n) {
        int C[][] = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (k > l) {
                    C[k][l] = B[k][l];
                } else {
                    C[k][l] = A[k][l];
                }  System.out.println(C[k][l]);
            }        }

    }
}
