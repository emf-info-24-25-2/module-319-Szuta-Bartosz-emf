public class ExerciceBoucle2 {
    public static void main(String[] args) {
        System.out.println("Boucle for:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Décollage !!");

        int i = 5;
        System.out.println("\nBoucle while:");
        while (i >= 1) {
            System.out.println(i);
            i--;

        }
        System.out.println("Décollage !!");

        System.out.println("\nBoucle do-while:");
        int j = 5;
        do {
            System.out.println(j);
            j--;

        } while (j >= 1);
        System.out.println("Décollage !!");

    }
}
