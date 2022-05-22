package Questao5;

import javax.xml.transform.Source;

public class MatrizTransposta {
    public void SomaETransposta(double[][] A, double[][] B, int linha, int coluna) {
        System.out.println("A+B:");

        double C[][] = new double[coluna][linha];
        double D[][] = new double[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                D[i][j] = A[i][j] + B[i][j];
                System.out.println(D[i][j]);
            }
        }

        System.out.println("\n T de A+B:");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                C[i][j] = D[j][i];
                System.out.println(C[i][j]);
            }

        }
    }

}