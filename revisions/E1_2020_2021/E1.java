package revisions.E1_2020_2021;
import java.util.Random;

public class E1 {

    // Constantes
    private static final int LIBRE = 0;
    private static final int OCCUPEE = 1;
    private static final int TOUCHEE = 2;
    private static final int TAILLE_GRILLE = 20;
    private static final int NBRE_BATEAUX = 5;

    // Méthode pour choisir un index aléatoire
    public static int choisirIndexAleatoire(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Méthode pour générer la grille
    public static int[] genererGrille(int tailleGrille, int nbreBateaux) {
        int[] grille = new int[tailleGrille];
        int nbreBateauxPlaces = 0;

        while (nbreBateauxPlaces < nbreBateaux) {
            int index = choisirIndexAleatoire(0, tailleGrille - 1);
            if (grille[index] == LIBRE) {
                grille[index] = OCCUPEE;
                nbreBateauxPlaces++;
            }
        }
        return grille;
    }

    // Méthode pour tester si la grille est terminée
    public static boolean testerGrille(int[] grille) {
        for (int cellule : grille) {
            if (cellule == OCCUPEE) {
                return false;
            }
        }
        return true;
    }

    // Méthode principale
    public static void main(String[] args) {
        boolean jeuTermine = false;
        int nbreCoups = 0;
        int[] grille = genererGrille(TAILLE_GRILLE, NBRE_BATEAUX);

        while (!jeuTermine) {
            nbreCoups++;
            int index = choisirIndexAleatoire(0, TAILLE_GRILLE - 1);
            System.out.println("Le joueur vise la cellule " + index);

            switch (grille[index]) {
                case LIBRE:
                    System.out.println("A l'eau!");
                    break;
                case OCCUPEE:
                    System.out.println("Touché!");
                    grille[index] = TOUCHEE;
                    break;
                case TOUCHEE:
                    System.out.println("Déjà touchée...");
                    break;
            }

            jeuTermine = testerGrille(grille);
            if (jeuTermine) {
                System.out.println("Le jeu est terminé en " + nbreCoups + " coups.");
            }
        }
    }
}
