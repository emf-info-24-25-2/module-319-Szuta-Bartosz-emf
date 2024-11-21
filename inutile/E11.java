package inutile;

import java.util.Random;

public class E11 {

    // Constantes
    private static final int MIN = 2;
    private static final int MAX = 14;

    // Méthode pour tirer une carte
    public static int tirerUneCarte() {
        Random random = new Random();
        return random.nextInt(MAX - MIN + 1) + MIN;
    }

    // Méthode pour déterminer l'index du gagnant
    public static int determinerIndexGagnant(int[] scores) {
        int indexGagnant = -1;
        int meilleurScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 21 && scores[i] > meilleurScore) {
                meilleurScore = scores[i];
                indexGagnant = i;
            }
        }
        return indexGagnant;
    }

    // Méthode pour donner le nom d'une carte
    public static String donnerNomCarte(int carte) {
        switch (carte) {
            case 11:
                return "valet";
            case 12:
                return "dame";
            case 13:
                return "roi";
            case 14:
                return "as";
            default:
                return String.valueOf(carte);
        }
    }

    // Méthode principale
    public static void main(String[] args) {
        String[] joueurs = {"Jacques", "Pierre", "Paul"};
        int[] scores = new int[joueurs.length];
        boolean jeuTermine = false;

        while (!jeuTermine) {
            for (int i = 0; i < joueurs.length; i++) {
                int carte = tirerUneCarte();
                String nomCarte = donnerNomCarte(carte);

                if (carte > 10) {
                    scores[i] += 11;
                } else {
                    scores[i] += carte;
                }

                System.out.println(joueurs[i] + " a tiré la carte " + nomCarte);
                System.out.println("   Nouveau score : " + scores[i]);

                if (scores[i] == 21) {
                    System.out.println(joueurs[i] + " a gagné !");
                    jeuTermine = true;
                    break;
                } else if (scores[i] > 21) {
                    System.out.println(joueurs[i] + " a dépassé 21 !");
                    int indexGagnant = determinerIndexGagnant(scores);
                    System.out.println(joueurs[indexGagnant] + " a gagné !");
                    jeuTermine = true;
                    break;
                }
            }
        }
    }
}
