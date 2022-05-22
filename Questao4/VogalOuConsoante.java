package Questao4;

public class VogalOuConsoante {

    public static void vogais(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                System.out.print('a');
            }
            if (s.charAt(i) == 'e') {
                System.out.print('e');
            }
            if (s.charAt(i) == 'i') {
                System.out.print('i');
            }
            if (s.charAt(i) == 'o') {
                System.out.print('o');
            }
            if (s.charAt(i) == 'u') {
                System.out.print('u');

            }
        }
    }

    public static void consoantes(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'a'
                    && s.charAt(i) != 'e'
                    && s.charAt(i) != 'i'
                    && s.charAt(i) != 'o'
                    && s.charAt(i) != 'u') {
                System.out.print(s.charAt(i));
            }
        }
    }
}



