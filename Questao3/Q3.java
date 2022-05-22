package Questao3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
       int x = 1;
       int y = 0;
       int n;

        System.out.println("Digite o valor de n");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        Fibonacci lista = new Fibonacci();
        lista.sequenciaFibonacci(x, y, n);


        }
    }

