package devoirs.devoir03;
import java.util.Scanner;

import java.util.Scanner;

public class devoir03 {public static void main(String[] args) {
     // Déclaration des variables pour jour, mois et année
        int jour, mois, annee;

        // Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le jour, le mois et l'année
        System.out.print("Entrez le jour : ");
        jour = scanner.nextInt();

        System.out.print("Entrez le mois : ");
        mois = scanner.nextInt();

        System.out.print("Entrez l'année : ");
        annee = scanner.nextInt();

        // Validation des limites prescrites
        if (annee < 0 || annee > 9999) {
            System.out.println("L'année doit être comprise entre 0 et 9999.");
            return;
        }

        if (mois < 1 || mois > 12) {
            System.out.println("Le mois doit être compris entre 1 et 12.");
            return;
        }

        if (jour < 1 || jour > 31) {
            System.out.println("Le jour doit être compris entre 1 et 31.");
            return;
        }

        // Vérifier si l'année est bissextile
        boolean estBissextile = false;
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            estBissextile = true;
        }

        // Nombre de jours dans chaque mois
        int joursDansMois = 0;

        switch (mois) {
            case 1: joursDansMois = 31; break;
            case 2:
                if (estBissextile) {
                    joursDansMois = 29;
                } else {
                    joursDansMois = 28;
                }
                break;
            case 3: joursDansMois = 31; break;
            case 4: joursDansMois = 30; break;
            case 5: joursDansMois = 31; break;
            case 6: joursDansMois = 30; break;
            case 7: joursDansMois = 31; break;
            case 8: joursDansMois = 31; break;
            case 9: joursDansMois = 30; break;
            case 10: joursDansMois = 31; break;
            case 11: joursDansMois = 30; break;
            case 12: joursDansMois = 31; break;
            default:
                System.out.println("Le mois saisi est invalide.");
                return;
        }

        // Validation du jour par rapport au mois
        if (jour > joursDansMois) {
            System.out.println("Le jour saisi est invalide pour ce mois.");
            return;
        }

        // Calcul du jour de l'année
        int jourAnnee = jour;
        switch (mois - 1) {
            case 11: jourAnnee += 30; // Novembre
            case 10: jourAnnee += 31; // Octobre
            case 9: jourAnnee += 30;  // Septembre
            case 8: jourAnnee += 31;  // Août
            case 7: jourAnnee += 31;  // Juillet
            case 6: jourAnnee += 30;  // Juin
            case 5: jourAnnee += 31;  // Mai
            case 4: jourAnnee += 30;  // Avril
            case 3: jourAnnee += 31;  // Mars
            case 2: jourAnnee += (estBissextile ? 29 : 28); // Février
            case 1: jourAnnee += 31;  // Janvier
        }

        // Afficher le résultat
        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourAnnee + " de l'An.");
        
        // Fermer le scanner
        scanner.close();
}
    
}
