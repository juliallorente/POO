package Questao6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperacoesVetores {
    public static void intersecaoDeVetores(int[] v, int[] u, int n) {
        int intersecao[] = new int[n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (v[i] == u[j]) {
                    intersecao[i] = v[i];
                }
            }
        }
        System.out.println("Intersecao");
                System.out.println(Arrays.toString(intersecao));
            }

      public static void somaDeVetores(int[] v, int[] u, int n) {
        int soma[] = new int[n];
        for (int i = 0; i < n; i++) {
            soma[i] = v[i] + u[i];
        }
        System.out.println("soma" + Arrays.toString(soma));
    }

    public static void uniaoDeVetores(int[] v, int[] u, int n) {
        int lenArray1 = v.length;
        int lenArray2 = u.length;
        int[] concate = new int[lenArray1 + lenArray2];
        System.arraycopy(v, 0, concate, 0, lenArray1);
        System.arraycopy(u, 0, concate, lenArray1, lenArray2);
        System.out.println("Uniao" + Arrays.toString(concate));

    }

    public static void diferencaamenosb(int[] v, int[] u, int n) {
        List<Integer> vetorAmenosB = new ArrayList<>();
        int cont = 0;
        int resposta;
        int vetor[] = new int[n];

        for (int i = 0; i < n; i++) {  // a - > aux
            vetor[i] = v[i];
        }
        for (int i = 0; i < n; i++) { // while
            for (int k = 0; k < n; k++) {
                if (vetor[i] == u[k]) {
                    vetor[i] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] >= 0) {
                vetorAmenosB.add(vetor[i]);
            }
        }
        System.out.println("A-B");
        System.out.println(vetorAmenosB);
    }


    public void diferencabmenosa(int[] v, int[] u, int n) {
        List<Integer> vetorBmenosA = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (u[i] == v[k]) {
                    u[i] = -1;

                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (u[i] >= 0) {
                vetorBmenosA.add(u[i]);
            }
        }
        System.out.println("B-A");
        System.out.println(vetorBmenosA);
    }
}


