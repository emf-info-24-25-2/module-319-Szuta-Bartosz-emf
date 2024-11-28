package devoirs.devoir04;

import java.util.Scanner;

public class devoir04 {
    public static void main(String[] args) {
        // Déclaration des variables
        int year, month, day;

        // Initialisation avec des valeurs données ou en entrée
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez l'année : ");
        year = sc.nextInt();
        System.out.print("Entrez le mois : ");
        month = sc.nextInt();
        System.out.print("Entrez le jour : ");
        day = sc.nextInt();
        
        // Affichage de la date entrée
        System.out.println("La date entrée est le " + day + "." + month + "." + year);

        // Vérification de l'année
        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
            return;
        }
        // RIF: c'est une bonne solution mais rappelez-vous de la convention EMF=> un seul return par methode

        // Vérification du mois
        if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
            return;
        }

        // Vérification du jour en fonction du mois
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));  // Année bissextile

        boolean dayIsValid = false;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: // Mois avec 31 jours
                if (day >= 1 && day <= 31) {
                    dayIsValid = true;
                }
                break;
            case 4: case 6: case 9: case 11: // Mois avec 30 jours
                if (day >= 1 && day <= 30) {
                    dayIsValid = true;
                }
                break;
            case 2: // Février
                if (isLeapYear && day >= 1 && day <= 29) {
                    dayIsValid = true;
                } else if (!isLeapYear && day >= 1 && day <= 28) {
                    dayIsValid = true;
                }
                break;
            default:
                break;
        }

        if (!dayIsValid) {
            System.out.println("Le jour [" + day + "] est hors limites !");
            return;
        }

        // Formatage de la date avec le mois en texte
        String monthText = "";
        switch (month) {
            case 1:  monthText = "janvier"; break;
            case 2:  monthText = "février"; break;
            case 3:  monthText = "mars"; break;
            case 4:  monthText = "avril"; break;
            case 5:  monthText = "mai"; break;
            case 6:  monthText = "juin"; break;
            case 7:  monthText = "juillet"; break;
            case 8:  monthText = "août"; break;
            case 9:  monthText = "septembre"; break;
            case 10: monthText = "octobre"; break;
            case 11: monthText = "novembre"; break;
            case 12: monthText = "décembre"; break;
        }

        // Affichage de la date formatée
        System.out.println("La date formatée est le " + day + " " + monthText + " " + year);
    }
}
