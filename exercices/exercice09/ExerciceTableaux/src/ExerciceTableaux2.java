import java.util.Random;

public class ExerciceTableaux2 {
    //Déclaration des constantes
    public static final int TAILLE_TABLEAU = 10;
    public static final int VALEUR_MIN = 1;
    public static final int VALEUR_MAX = 6;
    public static void main(String[] args) {
    // Déclaration et création du tableau d'entiers
    int[] tableauEntiers = new int[TAILLE_TABLEAU];
    //Génerateur de nombres aléatoires
    Random random = new Random();
     // Initialisation du tableau avec des valeurs aléatoires 
    //comprises entre VALEUR_MIN et VALEUR_MAX
    for (int i=0; i < tableauEntiers.length; i++){
        tableauEntiers[i]= random.nextInt(VALEUR_MAX-VALEUR_MIN+1)+VALEUR_MIN;
    }
    // Affichage du contenu du tableau
    System.out.println("Contenu du tableau :");
    for (int i =0; i < tableauEntiers.length; i++) {
        System.out.println("Cellule " + i + " : " + tableauEntiers[i]);
        
    }
    
    }



    
}
