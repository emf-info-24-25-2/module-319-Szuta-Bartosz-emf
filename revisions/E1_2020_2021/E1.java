package revisions.E1_2020_2021;
import java.util.Random;
public class E1 {
    public static final int LIBRE = 0;
    public static final int OCCUPEE = 1;
    public static final int TOUCHEE = 2;
    public static final int TAILLE_GRILLE = 20;
    public static final int NBRE_BATEAUX = 5;
    public static int choisirIndexAleatoire(int min, int max){
    Random rand = new Random();
    int valeurale = rand.nextInt(max-min+1)+min;
    return valeurale;
    }
    public static int[] genererGrille(int[] taille) {
int nbrBateauxPlaces = 0;
while (nbrBateauxPlaces<=NBRE_BATEAUX) {
    
    
}
    }
}
