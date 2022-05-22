package Questao1;

import java.util.ArrayList;

public class EncontradorPrimos {

    public ArrayList<Integer> encontrarPrimos(int a, int tamanho) {
       ArrayList<Integer> bloco = new ArrayList<>();
        for (int i = a; i < tamanho; i++) {
            if (ehPrimo(i)) {
                bloco.add(i);

            }
        }
        return bloco;
    }

    private int[] converterBlocoParaVetor(ArrayList<Integer> bloco) {
        int [] resposta = new int[bloco.size()];
        int j = 0;
        for (int k = 0; k < bloco.size(); k++) {
            resposta[j] = k;
            j++;
        }
        return resposta;
    }
    private static boolean ehPrimo(int i){
        if(i == 1) return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0){
                return false;
            }
        } return true;
    }
}
