public class tableauxmeme {public class RemplirTableau { 

 

    // Méthode pour remplir un tableau avec une même valeur 

    public void remplir(int[] tableau, int valeur) { 

        for (int i = 0; i < tableau.length; i++) { 

            tableau[i] = valeur; // Assigner la valeur à chaque élément 

        } 

    } 

 

    public static void main(String[] args) { 

        // Création d'un tableau vide avec 5 éléments 

        int[] tableau = new int[5]; 

 

        // Affichage du tableau avant remplissage 

        System.out.println("Avant remplissage :"); 

        for (int i : tableau) { 

            System.out.print(i + " "); 

        } 

        System.out.println(); 

 

        // Création d'une instance de la classe RemplirTableau 

        RemplirTableau instance = new RemplirTableau(); 

 

        // Remplissage du tableau avec la valeur 7 

        instance.remplir(tableau, 7); 

 

        // Affichage du tableau après remplissage 

        System.out.println("Après remplissage :"); 

        for (int i : tableau) { 

            System.out.print(i + " "); 

        } 

        System.out.println(); 

    } 

} 
    
}
