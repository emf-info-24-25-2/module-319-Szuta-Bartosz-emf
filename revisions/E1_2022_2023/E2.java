package revisions.E1_2022_2023;

import java.util.Random;

public class E2 {

    // Constantes
    private static final int TEMPS_MIN = 35;
    private static final int TEMPS_MAX = 75;

    // Méthode pour générer des temps aléatoires
    public static int[] genererTemps(int taille) {
        Random random = new Random();
        int[] tabTemps = new int[taille];
        for (int i = 0; i < taille; i++) {
            tabTemps[i] = random.nextInt(TEMPS_MAX - TEMPS_MIN + 1) + TEMPS_MIN;
        }
        return tabTemps;
    }

    // Méthode pour trouver l'index du meilleur temps
    public static int positionMeilleurTemps(int[] tabTemps) {
        int meilleurTemps = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < tabTemps.length; i++) {
            if (tabTemps[i] < meilleurTemps) {
                meilleurTemps = tabTemps[i];
                index = i;
            }
        }
        return index;
    }

    // Méthode pour calculer les riders qualifiés
    public static String[] calculQualification(String[] riders, int[] tabTemps) {
        int qualifiés = riders.length / 2;
        String[] ridersRestants = new String[qualifiés];

        for (int i = 0; i < qualifiés; i++) {
            int index = positionMeilleurTemps(tabTemps);
            ridersRestants[i] = riders[index];
            tabTemps[index] = Integer.MAX_VALUE; // Exclure ce rider pour l'itération suivante
        }
        return ridersRestants;
    }

    // Méthode principale
    public static void main(String[] args) {
        String[] riders = {"Kilian", "Max", "Noé", "Beat", "André", "Alex", "John", "Fred"};
        int tour = 1;

        while (riders.length >= 2) {
            // Générer les temps
            int[] tabTemps = genererTemps(riders.length);

            // Affichage du tour actuel
            switch (tour) {
                case 1 -> System.out.println("Résultat du quart de final :");
                case 2 -> System.out.println("Résultat de la demi-finale :");
                case 3 -> System.out.println("Résultat de la finale :");
            }

            // Afficher les riders et leurs temps
            for (int i = 0; i < riders.length; i++) {
                System.out.println(riders[i] + " [" + tabTemps[i] + "s]");
            }
            System.out.println("-----------------------------");

            // Préparer le prochain tour
            riders = calculQualification(riders, tabTemps);
            tour++;
        }

        // Afficher le gagnant
        System.out.println("Le gagnant est : " + riders[0]);
    }
}

