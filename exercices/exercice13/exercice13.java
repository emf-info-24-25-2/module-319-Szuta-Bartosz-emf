package exercices.exercice13;
public class exercice13 {
    public static void main(String[] args) {
        // Lance l'attaque par force brute pour trouver le mot de passe à 4 chiffres
        bruteForcePassword();
    }
 
    private static void bruteForcePassword() {
        // On boucle sur toutes les combinaisons possibles de 0000 à 9999
        for (int i = 0; i <= 9999; i++) {
            // Formate l'entier en chaîne de caractères de 4 chiffres (ex : 7 devient "0007")
            String attempt = String.format("%04d", i);
            // Teste le mot de passe
            if (testPassword(attempt)) {
                System.out.println("Mot de passe trouvé : " + attempt);
                break; // Arrête le programme une fois le mot de passe trouvé
            }
        }
    }
 
    // Méthode de test du mot de passe (simulée pour cet exemple)
    private static boolean testPassword(String password) {
        // Remplacez "1234" par le mot de passe réel que vous voulez tester
        String correctPassword = "1231";
        return password.equals(correctPassword);
    }
}
