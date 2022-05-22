package Questao1;

import java.util.Scanner;
import java.util.ArrayList;

public class Q1 {

    public static void main(String[] args) {
        System.out.print("Digite os valores:");
        Scanner ler = new Scanner(System.in);

        int a;
        int b;
        int con = 0;

        a = ler.nextInt();
        b = ler.nextInt();


        int tamanho = b - (a - 1);

       /* for (int k = 0; k < tamanho; k++) {
            if (primo(v[k]))
                System.out.println(v[k]);
            a++;
        }*/

        EncontradorPrimos encontrar = new EncontradorPrimos();
        ArrayList<Integer> numerosPrimos = encontrar.encontrarPrimos(a, tamanho);

        for (int i : numerosPrimos) {
            System.out.println(i);
        }
    }
}





