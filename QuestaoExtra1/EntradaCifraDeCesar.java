package QuestaoExtra1;

import java.util.Scanner;

public class EntradaCifraDeCesar {  // 65 a 90 - Maiusculo
    public static void main(String[] args) {  // 97 - 122 - Minusculo

        String cifraDeCesar;
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a String:");
        cifraDeCesar = input.next();

        System.out.println("Insira o valor de n:");
        n = input.nextInt();

        CifraDeCesar cifra = new CifraDeCesar();
        cifra.somandoNaString(n, cifraDeCesar);

    }
}
