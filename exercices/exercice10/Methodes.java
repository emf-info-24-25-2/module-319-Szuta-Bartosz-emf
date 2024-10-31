package exercices.exercice10;

public class Methodes {
    public static void main(String[] args) {
        direBonjour();
        dire("Salut tout le monde !");
        math();

    }

    public static void direBonjour() {
        System.out.println("bonjour");
    }

    public static void dire(String dire) {
        System.out.println(dire);

    }

    public static void math() {
        // Variables de base pour démonstration
        int a = -10;
        int b = 15;
        double base = 4;
        double exponent = 3;
        double nombrePourRacine = 25;

        int minimum = Math.min(a, b);
        System.out.println("Le minimum entre "+ a +" et "+ b +" est : "+ minimum);
        // 2. Utilisation de Math.max()
        int maximum = Math.max(a, b);
        System.out.println("Le maximum entre "+ a +" et "+ b +" est : "+ maximum);
        // 3. Utilisation de Math.pow()
        double puissance = Math.pow(base, exponent);
        System.out.println(base +" élevé à la puissance "+ exponent +" est : "+ puissance);
        // 4. Utilisation de Math.sqrt()
        double racineCarree = Math.sqrt(nombrePourRacine);
        System.out.println("La racine carrée de "+ nombrePourRacine +" est : "+ racineCarree);
        // 5. Utilisation de Math.abs()
        int valeurAbsolue = Math.abs(a);
        System.out.println("La valeur absolue de "+ a +" est : "+ valeurAbsolue);
    }

}