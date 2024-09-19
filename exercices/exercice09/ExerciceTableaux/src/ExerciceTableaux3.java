 import java.util.Random;
public class ExerciceTableaux3 {
    public static final int TAILLE_TABLEAU = 10;
    public static final int VALEUR_MIN = 1;
    public static final int VALEUR_MAX = 6;
public static void main(String[] args) {
    float total = 0;
    int[] tableauEntiers = new int[TAILLE_TABLEAU]; 
    Random random = new Random();
    for (int i=0; i < tableauEntiers.length; i++){
        tableauEntiers[i]= random.nextInt(VALEUR_MAX-VALEUR_MIN+1)+VALEUR_MIN;
        total = total+tableauEntiers[i];
             }
             float moyenne = total/tableauEntiers.length;
        for (int i=0; i < tableauEntiers.length; i++) {
            System.out.println("Cellule "+i+":"+tableauEntiers[i]);
    }
   System.out.println("La moyenne est : "+moyenne);
}
    
}
