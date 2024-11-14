package exercices.exercice10;

import java.util.Random;

public class Methodes1 {

    // 1. Créer un tableau d'une taille donnée
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    // 2. Remplir un tableau avec une valeur fixe
    public static int[] remplirTableauValeurFixe(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }
        return tableau;
    }

    // 3. Remplir un tableau avec des valeurs aléatoires entre 1 et 20
    public static int[] remplirTableauAleatoire(int[] tableau) {
        Random rand = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(20) + 1; // Valeur aléatoire entre 1 et 20
        }
        return tableau;
    }

    // 4. Déterminer la taille d'un tableau
    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }

    // 5. Afficher le contenu d'un tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }

    // 6. Rechercher la valeur minimum d'un tableau
    public static int trouverMin(int[] tableau) {
        int min = tableau[0];
        for (int valeur : tableau) {
            if (valeur < min)
                min = valeur;
        }
        return min;
    }

    // 7. Rechercher la valeur maximum d'un tableau
    public static int trouverMax(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max)
                max = valeur;
        }
        return max;
    }

    // 8. Compter la fréquence d'une valeur dans un tableau
    public static int compterFrequence(int[] tableau, int valeur) {
        int count = 0;
        for (int val : tableau) {
            if (val == valeur)
                count++;
        }
        return count;
    }

    // 9. Calculer la somme des valeurs d'un tableau
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int val : tableau) {
            somme += val;
        }
        return somme;
    }

    // 10. Calculer la moyenne des valeurs d'un tableau
    public static double moyenneTableau(int[] tableau) {
        return (double) sommeTableau(tableau) / tableau.length;
    }

    // 11. Remplacer une valeur par une autre dans un tableau
    public static int[] remplacerValeur(int[] tableau, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ancienneValeur)
                tableau[i] = nouvelleValeur;
        }
        return tableau;
    }

    // 12. Rechercher la première occurrence d'une valeur dans un tableau
    public static int premiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur)
                return i;
        }
        return -1;
    }

    // 13. Rechercher la dernière occurrence d'une valeur dans un tableau
    public static int derniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur)
                return i;
        }
        return -1;
    }

    // Méthode principale pour tester toutes les méthodes
    public static void main(String[] args) {
        int[] tab1;
        int[] tab;
        int[] tab2;
        // 1. Créer et remplir un tableau
        int[] tableau = creerTableau(50);
        remplirTableauAleatoire(tableau);

        tab2= new int[9];
        // 2. Afficher la taille du tableau
        System.out.println("Le tableau a une taille de " + tailleTableau(tableau) + " cellules.\n");

        // 3. Afficher le contenu du tableau
        System.out.println("Contenu du tableau aléatoire :");
        afficherTableau(tableau);

        // 4. Afficher la valeur minimale et maximale du tableau
        System.out.println("\nLa valeur min trouvée = " + trouverMin(tableau));
        System.out.println("La valeur max trouvée = " + trouverMax(tableau));

        // 5. Remplacer toutes les occurrences de la valeur 12 par la valeur 5
        remplacerValeur(tableau, 12, 5);
        System.out.println("\nAprès remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
        afficherTableau(tableau);

        // 6. Calculer et afficher la somme et la moyenne des valeurs du tableau
        System.out.println("\nLa somme des cellules du tableau = " + sommeTableau(tableau));
        System.out.printf("La moyenne des cellules du tableau = %.2f%n", moyenneTableau(tableau));

        // 7. Rechercher la première et la dernière occurrence de la valeur 13
        int valeurRecherchee = 13;
        int premierePos = premiereOccurrence(tableau, valeurRecherchee);
        int dernierePos = derniereOccurrence(tableau, valeurRecherchee);
        System.out.println("\nLa valeur " + valeurRecherchee + " a été trouvée à la 1ère position N°" + premierePos);
        System.out.println("La valeur " + valeurRecherchee + " a été trouvée à la dernière position N°" + dernierePos);
    }
}