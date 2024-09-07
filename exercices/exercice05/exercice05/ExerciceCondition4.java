package exercices.exercice05.exercice05;

public class ExerciceCondition4 {public static void main(String[] args) {

    int température = 3;
    if (température<-10) {System.out.println("Il fait très froid");
        
    } else if (température>=-10 && température<0) {System.out.println("Il fait froid");
        
    } else if (température>=0 && température<25) {System.out.println("Il fait normal");
        
    }else if (température>=25 && température<=35) {System.out.println("Il fait chaud");
        
    }else if (température>35) {System.out.println("Il fait très chaud");
        
    }
        
    }
        
    
}
    

