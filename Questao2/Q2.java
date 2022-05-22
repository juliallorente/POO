package Questao2;

import java.util.Arrays;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 4;
        System.out.println("Insira os valores do primeiro vetor");
        int v[] = new int[n]; // atributos
        int u[] = new int[n];


        for (int i = 0; i < n; i++) {
            v[i] = input.nextInt();


        }
        System.out.println("Insira os valores do segundo vetor");

        for (int j = 0; j < n; j++) {
            u[j] = input.nextInt();


        }

        int t[] = new int[n];

        for (int k = 0; k < n; k++) {
            int a = v[k];
            int b = u[k];
            VetorT calcula = new VetorT();
            t[k] = calcula.criandoVetorT(a, b);
        }

        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
    }


}
