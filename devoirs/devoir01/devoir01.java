package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        boolean EstMajeur;
        byte MonAge = 17;
        if (MonAge<=18) {EstMajeur=false;
            
        } else {EstMajeur=true;
            
        }
        System.out.println("Je m'appelle Szuta Bartosz");
        
        System.out.println("Mon âge est de " + MonAge + " ans");

        // Relisez bien la donnée, String n'est
        // le bon choix pour estMajeur. Il faut une variable
        // qui permet de stocker si oui ou non la personne est majeure.
        // changez ceci et corrigez la suite de l'exercice

        if (EstMajeur==true) {
            System.out.println("estMajeur");

        } else{System.out.println("Je ne suis pas encore majeur");}

    }

}
