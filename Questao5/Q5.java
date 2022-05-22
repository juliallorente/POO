package Questao5;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {

        int linha = 4;
        int coluna = 3;
        double B[][] = new double[linha][coluna];
        double A[][] = new double[linha][coluna];

        Random gerador = new Random();


        System.out.println("A:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                A[i][j] = gerador.nextDouble() *100;
                System.out.println((A[i][j]));
            }
        }
        System.out.println("\n");
        System.out.println("B:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                B[i][j] = gerador.nextDouble() *100;
                System.out.println((B[i][j]));
            }
        }

        System.out.println("\n");

        MatrizTransposta transposta1 = new MatrizTransposta();
        transposta1.SomaETransposta(A, B, linha, coluna);

    }
}