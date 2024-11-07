package exercices.exercice13;


    public class exercice132 {
    // Caractères possibles dans le mot de passe
    private static final char[] CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
 
    public static void main(String[] args) {
        // Lance l'attaque par force brute pour trouver le mot de passe
        bruteForcePassword("");
    }
 
    // Méthode récursive pour tester toutes les combinaisons possibles
    private static void bruteForcePassword(String attempt) {
        // Vérifie si la tentative de mot de passe a une longueur de 5 caractères
        if (attempt.length() == 5) {
            // Teste le mot de passe
            if (testPassword(attempt)) {
                System.out.println("Mot de passe trouvé : " + attempt);
                System.exit(0); // Arrête le programme une fois le mot de passe trouvé
            }
            return;
        }
 
        // Génère toutes les combinaisons possibles en ajoutant chaque caractère
        for (char c : CHARACTERS) {
            bruteForcePassword(attempt + c);
        }
    }
 
    // Méthode de test du mot de passe (simulée pour cet exemple)
    private static boolean testPassword(String password) {
        // Remplacez "abc12" par le mot de passe réel que vous voulez tester
        String correctPassword = "abc12";
        return password.equals(correctPassword);
    }
}
    

