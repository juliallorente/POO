package Questao6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int n = 3;
        int v[] = new int[n]; // atributos
        int u[] = new int[n];

        System.out.println("Insira os valores do primeiro vetor");
        for (int i = 0; i < n; i++) {
            v[i] = input.nextInt();
        }

        System.out.println("Insira os valores do segundo vetor");

        for (int j = 0; j < n; j++) {
            u[j] = input.nextInt();

        }

        OperacoesVetores intersecao = new OperacoesVetores();
        intersecao.intersecaoDeVetores(v, u, n);
        OperacoesVetores soma = new OperacoesVetores();
        soma.somaDeVetores(v, u, n);
        OperacoesVetores uniao = new OperacoesVetores();
        uniao.uniaoDeVetores(v, u, n);
        OperacoesVetores amenosb = new OperacoesVetores();
        amenosb.diferencaamenosb(v, u, n);
        OperacoesVetores bmenosa = new OperacoesVetores();
        bmenosa.diferencabmenosa(v, u, n);
    }
}