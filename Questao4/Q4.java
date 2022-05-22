package Questao4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){

        int n;
        String s;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a string");
        s = ler.next();

        System.out.println("Para vogais 1 e para consoantes 2");
        n = ler.nextInt();

        VogalOuConsoante string = new VogalOuConsoante();

        if (n == 1) {
            string.vogais(s);
        } else if (n == 2) {
            string.consoantes(s);
        } else {
            System.out.println("Numero invalido");
        }
    }
}


