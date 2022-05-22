package QuestaoExtra1;

public class CifraDeCesar {
    public static void somandoNaString(int n, String cifraDeCesar){
        char[] novaString = cifraDeCesar.toCharArray();
        for(int i = 0; i < cifraDeCesar.length(); i++){
            novaString[i] += n;
        }
        System.out.println(novaString);
    }

}
