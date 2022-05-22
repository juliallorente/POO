package Questao7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 3 ;
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];

        System.out.println("Insira os valores da primeira matriz");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = input.nextInt();

            }
        }

        System.out.println("Insira os valores da segunda matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = input.nextInt();
            }
        }

        CriandoMatrizC matrizc = new CriandoMatrizC();
        matrizc.criandoMatiz(A, B, n);
    }
}
