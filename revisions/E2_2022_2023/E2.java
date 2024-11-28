package revisions.E2_2022_2023;
import java.util.Scanner;
public class E2 {
 
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;


    public static final int[] CATEGORIE_SALLE = {3, 3, 2, 2, 1, 1, 2, 2, 3, 3};

    public static void main(String[] args) { 
        
        boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length];
        int commande = -1;
        Scanner scanner = new Scanner(System.in);

        while (commande != 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("1 = Commander un billet, 2 = Afficher les tarifs, 3 = Afficher l'état de la salle, 0 = Quitter");
            System.out.print("Quelle opération voulez-vous faire : ");
            commande = scanner.nextInt();

            switch (commande) {
                case 0:
                    System.out.println("Au revoir");
                    break;
                case 1:
                    occupationSalle = commanderBillet(occupationSalle);
                    break;
                case 2:
                    afficherTarifs();
                    break;
                case 3:
                    afficherSalle(occupationSalle);
                    break;
                default:
                    System.out.println("Commande inconnue");
                    break;
    
    
                }

            }
            scanner.close();
}
        public static void afficherTarifs() {
            System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
            System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
            System.out.println("Catégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF");
        } 
        public static void afficherSalle(boolean[] occupationSalle) {
            System.out.println("Occupation de la salle :");
            for (int categorie : CATEGORIE_SALLE) {
                System.out.print(categorie + " ");
            }
            System.out.println();
            for (boolean occupé : occupationSalle) {
                System.out.print((occupé ? "O" : "X") + " ");
            }
            System.out.println();
        }
        public static int trouverPlace(int categorie, boolean[] occupationSalle) {
            for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
                if (CATEGORIE_SALLE[i] == categorie && !occupationSalle[i]) {
                    return i;
                }
            }
            return -1; 
        }
    
       
        public static boolean[] commanderBillet(boolean[] occupationSalle) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Quelle catégorie voulez-vous : ");
            int categorie = scanner.nextInt();
    
            if (categorie < 1 || categorie > 3) {
                System.out.println("Cette catégorie n'existe pas");
                return occupationSalle;
            }
    
            int positionPlace = trouverPlace(categorie, occupationSalle);
            if (positionPlace != -1) {
                occupationSalle[positionPlace] = true; 
                int prix = switch (categorie) {
                    case 1 -> PRIX_CATEGORIE_UN;
                    case 2 -> PRIX_CATEGORIE_DEUX;
                    case 3 -> PRIX_CATEGORIE_TROIS;
                    default -> 0;
                };
                System.out.println("Votre place est réservée et coûte " + prix + " CHF");
            } else {
                System.out.println("Aucune place disponible");
            }
            return occupationSalle;
           
    }

        
}


        



    
