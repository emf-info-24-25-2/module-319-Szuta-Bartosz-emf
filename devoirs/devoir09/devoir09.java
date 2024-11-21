package devoirs.devoir09;
import java.util.*;

public class devoir09 {
    
    
        // Déclaration des constantes
        public static final int NBRE_CHIFFRES = 6;
        public static final int MIN = 0;
        public static final int MAX = 42;
    
        public static void main(String[] args) {
            // Appel de la méthode pour générer un tirage
            int[] tirage = genereTirage(NBRE_CHIFFRES, MIN, MAX);
    
            // Affichage du tirage
            System.out.println("Tirage du loto :");
            for (int chiffre : tirage) {
                System.out.println(chiffre);
            }
        }
    
        /**
         * Méthode pour générer un tirage du loto.
         * @param nbreChiffres Le nombre de chiffres du tirage.
         * @param min La valeur minimale d'un chiffre.
         * @param max La valeur maximale d'un chiffre.
         * @return Un tableau contenant les chiffres tirés.
         */
        public static int[] genereTirage(int nbreChiffres, int min, int max) {
            // Créer un Set pour ne pas avoir de doublons
            Set<Integer> tirageSet = new HashSet<>();
    
            // Générer les chiffres jusqu'à ce que l'on ait le nombre désiré
            Random rand = new Random();
            while (tirageSet.size() < nbreChiffres) {
                int tirage = rand.nextInt(max - min + 1) + min;
                tirageSet.add(tirage);  // Ajoute un chiffre, les doublons sont ignorés
            }
    
            // Convertir le Set en un tableau
            int[] tirageArray = new int[nbreChiffres];
            int i = 0;
            for (int chiffre : tirageSet) {
                tirageArray[i++] = chiffre;
            }
    
            return tirageArray;
        }
    }
    
    

