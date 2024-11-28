package devoirs.devoir06;
import java.util.Random;

public class devoir06 {

    public class TableauOperations {
    
        // Constantes
        private static final int TAILLE_TABLEAU = 20;
        private static final int VALEUR_MIN = 0;
        private static final int VALEUR_MAX = 50;
        private static final int VALEUR_RECHERCHEE = 7;
    
        // Méthode pour générer un tableau de valeurs aléatoires
        public static int[] genereTableau(int taille, int valeurMin, int valeurMax) {
            int[] tableau = new int[taille];
            Random random = new Random();
    
            for (int i = 0; i < taille; i++) {
                tableau[i] = random.nextInt(valeurMax - valeurMin + 1) + valeurMin;
            }
            return tableau;
        }
    
        // Méthode pour rechercher la valeur minimale dans un tableau
        public static int rechercheMin(int[] tableau) {
            int min = tableau[0];
            for (int val : tableau) {
                if (val < min) {
                    min = val;
                }
            }
            return min;
        }
    
        // Méthode pour rechercher la valeur maximale dans un tableau
        public static int rechercheMax(int[] tableau) {
            int max = tableau[0];
            for (int val : tableau) {
                if (val > max) {
                    max = val;
                }
            }
            return max;
        }
    
        // Méthode pour rechercher une valeur dans un tableau et retourner son index
        public static int rechercheValeur(int[] tableau, int valeur) {
            for (int i = 0; i < tableau.length; i++) {
                if (tableau[i] == valeur) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {

            // Générer le tableau
            int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);
    
            // Afficher le contenu du tableau
            for (int i = 0; i < tableau.length; i++) {
                System.out.println("Tableau[" + i + "] = [" + tableau[i] + "]");
            }
    
            // Afficher la valeur minimale et maximale
            int min = rechercheMin(tableau);
            int max = rechercheMax(tableau);
            System.out.println("La plus petite valeur trouvée est : " + min);
            System.out.println("La plus grande valeur trouvée est : " + max);
    
            // Afficher la position de la valeur recherchée
            int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
            System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] est à la position [" + position + "] du tableau");
        }
    }
}
        

    

