package exercices.exercice05.exercice05;

import java.util.Scanner;

public class ExerciceCondition4 {public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
   System.out.print("Entrez la température : ");
        int temperature = scanner.nextInt();

    if (temperature<-10) {System.out.println("Il fait très froid");
        
    } else if (temperature>=-10 && temperature<0) {System.out.println("Il fait froid");
        
    } else if (temperature>=0 && temperature<25) {System.out.println("Il fait normal");
        
    }else if (temperature>=25 && temperature<=35) {System.out.println("Il fait chaud");
        
    }else if (temperature>35) {System.out.println("Il fait très chaud");
        
    }
    
    
        
    }
        
    
}
    

