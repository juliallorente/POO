package Questao3;

public class Fibonacci {
    public static void sequenciaFibonacci(int x, int y, int n) {
        if (n == 0) {
            System.out.println("0");
        }

        if (n == 1 || n == 2) {
            System.out.println("1");
        }
        if (n > 2) {
        for (int i = 0; i < n; i++) {
            x = x + y;
            y = x - y;
            System.out.println(y);
        }
    }
    }
}

