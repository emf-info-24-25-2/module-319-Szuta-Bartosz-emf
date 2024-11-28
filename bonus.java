public class bonus {
    public static void main(String[] args) { 
    
        int[] obtenu=genererTableauUnique(3,6,79);
        System.out.println("youpi");
    }
    public static int[] genererTableauUnique(int nombre, int min, int max) {
        // Création d'un tableau pour stocker les nombres uniques
        int[] tab = new int[nombre];
    
        // Remplissage du tableau 
        for (int i = 0; i < nombre; i++) {
            boolean trouve = false;
            while (!trouve) {
                // Génération d'un nombre aléatoire entre min et max
                int aleatoire = (int) (Math.random() * (max - min + 1)) + min;
                // Vérification si le nombre existe déjà dans le tableau
                trouve = true; // On suppose d'abord que le nombre est unique
                for (int j = 0; j < i; j++) {
                    if (aleatoire == tab[j]) {
                        trouve = false; // Le nombre existe déjà, il faut en générer un autre
                        break;
                    }
                }
                // Si le nombre est unique, on l'ajoute dans le tableau
                if (trouve) {
                    tab[i] = aleatoire;
                }
            }
        }
    
        // Retourner le tableau final
        return tab;
    }
    
}
