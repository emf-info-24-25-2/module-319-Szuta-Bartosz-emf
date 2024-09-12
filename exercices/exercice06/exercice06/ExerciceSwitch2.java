package exercices.exercice06.exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age = 11;
        if (age == 7) {
            System.out.println("Poussin");
        } else if (age == 8 || age == 9) {
            System.out.println("Pupille");
        }

        else if (age == 10 || age == 11) {
            System.out.println("Minime");

        } else if (age < 7 || age > 11) {
            System.out.println("Inconnu");

        }

    }

}
