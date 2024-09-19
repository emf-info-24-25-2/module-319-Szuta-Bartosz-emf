import java.util.Scanner;
public class ExerciceTableaux4 {
    public static void main(String[] args) {
        int[] tableaux = new int [5];
        Scanner scanner = new Scanner(System.in);
        int nbrdépart = scanner.nextInt();
        for (int i=0;i<5;i++) {
            tableaux[i]=nbrdépart+(i+1);
            
        }
        for (int i = 0; i<tableaux.length;i++) {
            System.out.println("Cellule "+i+":"+tableaux[i]);
            

            
        }
        scanner.close();
        
    }
    
}
