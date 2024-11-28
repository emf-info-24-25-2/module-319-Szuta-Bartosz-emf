package devoirs.devoir08;
import java.util.Random;
public class devoir08 {

 
        // Déclaration de la constante CARACTERES qui contient les 10 premières lettres de l'alphabet
        public static final String[] CARACTERES = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
        };
    
        // Déclaration des constantes NBR_ESSAI et TAILLE_MOT_DE_PASSE
        public static final int NBR_ESSAI = 5;
        public static final int TAILLE_MOT_DE_PASSE = 15;
    
        // Méthode qui génère un mot de passe
        public static String genereMotDePasse(int taille) {
            Random rand = new Random();  // Générateur de nombres aléatoires
            String resultat = "";  // Variable qui va contenir le mot de passe généré
    
            // Boucle pour générer le mot de passe
            while (resultat.length() < taille) {
                // Choisir une position aléatoire dans le tableau CARACTERES
                int position = rand.nextInt(CARACTERES.length);  
                // Ajouter le caractère correspondant à la position choisie
                resultat += CARACTERES[position];
            }
    
            return resultat;  // Retourner le mot de passe généré
        }
    
        public static void main(String[] args) {
            // Boucle pour effectuer NBR_ESSAI essais
            for (int i = 0; i < NBR_ESSAI; i++) {
                // Appeler la méthode genereMotDePasse avec TAILLE_MOT_DE_PASSE comme paramètre
                String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
                // Afficher le mot de passe généré
                System.out.println(motDePasse);
            }
        }
    }
    
    

