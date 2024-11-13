package devoirs.devoir07;
import java.util.Random;

public class devoir07 {

    // Constantes
    private static final int TAILLE_TABLEAU = 10;
    private static final int MIN_NOMBRE = -8;
    private static final int MAX_NOMBRE = 8;
    private static final int VALEUR_RECHERCHEE = 7;

    // Méthode pour générer un tableau de valeurs aléatoires
    public static int[] genererValeursAleatoires(int taille, int min, int max) {
        int[] tableau = new int[taille];
        Random random = new Random();
        
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;
        }
        return tableau;
    }

    // Méthode pour trouver la position d'une valeur dans le tableau
    public static int positionValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Générer le tableau
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);
        
        // Rechercher la position de la valeur recherchée
        int position = positionValeur(tableau, VALEUR_RECHERCHEE);

        // Affichage des informations
        System.out.println("Devoir 07 du module 319");
        System.out.println("---------------------------------------");
        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");
        
        // Afficher les deux premières et deux dernières valeurs
        System.out.print("Les deux premières/dernières valeurs sont : ");
        System.out.print("[" + tableau[0] + "][" + tableau[1] + "] ... ");
        System.out.println("[" + tableau[TAILLE_TABLEAU - 2] + "][" + tableau[TAILLE_TABLEAU - 1] + "]");

        // Afficher la position de la valeur recherchée
        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + position + " du tableau !");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " ne figure pas dans le tableau !");
        }

        // Afficher le contenu complet du tableau
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
    }
}
