package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        boolean EstMajeur;
        byte MonAge = 17;
        if (MonAge<=18) {EstMajeur=false; //RIF: attention au formatage, retournez a la ligne
            
        } else {EstMajeur=true;
            
        }
        System.out.println("Je m'appelle Szuta Bartosz");
        
        System.out.println("Mon âge est de " + MonAge + " ans");


        if (EstMajeur==true) {
            System.out.println("estMajeur"); //RIF: ce serait mieux avec une phrase :-)

        } else{System.out.println("Je ne suis pas encore majeur");}

    }

}
