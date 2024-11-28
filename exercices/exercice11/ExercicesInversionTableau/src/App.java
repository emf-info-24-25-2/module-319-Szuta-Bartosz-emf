import java.util.Random;
 
public class App {
    // Déclaration des constantes MIN et MAX
    public static final int MIN = 0;
    public static final int MAX = 100;
 
    // Méthode pour inverser un tableau
    public static int[] inverseLeTableau(int[] tableau) {
        int taille = tableau.length;
        int[] tableauInverse = new int[taille];
        for (int i = 0; i < taille; i++) {
            tableauInverse[i] = tableau[taille - 1 - i];
        }
        return tableauInverse;
    }
 
    public static void main(String[] args) {
        // Déclaration et initialisation du tableauInitial avec des valeurs aléatoires
        int[] tableauInitial = new int[4];
        Random rand = new Random();
 
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = rand.nextInt(MAX - MIN + 1) + MIN;
        }
 
        // Affichage du contenu du tableauInitial
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tableauInitial.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }
 
        // Inverser le tableauInitial et stocker le résultat dans tableauFinal
        int[] tableauFinal = inverseLeTableau(tableauInitial);
 
        // Affichage du contenu du tableauFinal
        System.out.println("\nContenu du tableau final :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final [" + i + "] = " + tableauFinal[i]);
        }
    }
}
