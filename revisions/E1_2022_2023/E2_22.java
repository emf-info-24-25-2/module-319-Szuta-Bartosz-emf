package revisions.E1_2022_2023;
import java.util.Random;
public class E2_22 {
    public static final int TEMPS_MIN =35;
    public static final int TEMPS_MAX =75;
    public static void main(String[] args){

    }     
    public static int[] genererTemps(int taille) {
        int[] temps =new int[taille];
        Random random = new Random();
        for (int i = 0; i< taille;i++){
        temps[i]= TEMPS_MIN + random.nextInt(TEMPS_MAX-TEMPS_MIN+1);
        }
return temps;
    }
     
}
