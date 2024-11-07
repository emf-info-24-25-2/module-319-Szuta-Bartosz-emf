package devoirs.devoir05;

import java.util.Scanner;
//D'abord je vais importer le scannner 
// après je vais crée le scanner 
// je vais imprimer le message qui demande un nombre entre 1f et 100
// ensuite je vais définir la variable pour quel équivale a l'entré du scanner 
// je vais mettre le scanner.nextLine(). pour ignorrer la touche return 
// je crée un deuxième scanner qui va prendre le chiffre de la deuxième personne. 
// je vais mettre une vérification si le nombre et plus grand que 100 il affichera le nombre entré est trop grand et si il est trop petit il dira le nombre entré est trop petit.
// après je vais mettre une boucle For qui va continuer jusqu'a ce que la personne trouve le chiffre 

public class devoir05 {
   

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // La première personne choisit un nombre entre 1 et 100

        System.out.print("Choisissez un nombre entre 1 et 100 : ");

        int nombreATrouver = scanner.nextInt();

        // Vérifie que le nombre est bien entre 1 et 100

        while (nombreATrouver < 1 || nombreATrouver > 100) {

            System.out.print("Le nombre doit être entre 1 et 100. Réessayez : ");

            nombreATrouver = scanner.nextInt();

        }

        // Efface l'écran pour cacher le nombre choisi (dans un vrai environnement, sinon à commenter si non nécessaire)

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Essayez de deviner le nombre !");
 
        int nombreDevine;

        // Boucle principale pour que la deuxième personne devine le nombre

        while (true) {

            // La deuxième personne entre un nombre pour essayer de deviner

            System.out.print("Devinez le nombre : ");

            nombreDevine = scanner.nextInt();

            // Vérifier si le nombre deviné est trop petit

            if (nombreDevine < nombreATrouver) {

                System.out.println("Trop petit !");

            }

            // Vérifier si le nombre deviné est trop grand

            else if (nombreDevine > nombreATrouver) {

                System.out.println("Trop grand !");


            }

            // Si le nombre deviné est correct

            else {

                System.out.println("Bravo, trouvé !");

                break; // Sortir de la boucle

            }

        }

        // Fermer le Scanner

        scanner.close();

    }

}

 
