package devoirs.devoir02;

import java.util.Random;

//RIF: très bien!
public class devoir02 {
    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;

        // exemple classe math entre 2 et 8
        // int hasard1 = ( int ) ( Math.random() * ( 8 - 2 + 1 ) ) + 2;

        // exemple avec la classe Random, ne pas oublier le import
        Random random = new Random();
        // int hasard2 = random.nextInt(2,8+1);
        int remplissage = random.nextInt(CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1);
        System.out.println("Il y a "+remplissage+" litres à remplir.");
         
        while (CAPACITE_RESERVOIR_A>reservoirA && remplissage>0) {
            reservoirA = reservoirA+1; 
            remplissage = remplissage-1;
            System.out.println("\nRemplissage du réservoir A...");
            System.out.println("\nLe réservoir A: "+reservoirA+", le réservoir B: "+reservoirB);
            
        }
        while (CAPACITE_RESERVOIR_B>reservoirB && remplissage>0) {
            reservoirB = reservoirB +1;
            remplissage = remplissage -1;
            System.out.println("\nRemplissage du réservoir B...");
            System.out.println("\nLe réservoir A: "+reservoirA+", le réservoir B: "+reservoirB);
           
            
        }
        System.out.println("\nRemplissage terminé!");
    }

}
