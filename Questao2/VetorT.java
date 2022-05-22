package Questao2;

public class VetorT {



    public int criandoVetorT(int a, int b) {
        int res;
            if (a % 2 == 0 && b % 2 == 0) {
                res = a + b;
            } else if (a % 2 != 0 && b % 2 != 0) {
                res = a - b;
            } else {
                res = a * b;
            }
        return(res);
        }

        }



