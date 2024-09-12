public class ExerciceBoucle1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        for (int i =1;i<6;i++)
        {if (i==3) continue; {System.out.println(i);}
            
        }
         
        int i = 1;
        while (i<6) {System.out.println(i);i++;
            if (i==4) { break; }
            
        }

        int ii = 1;
        do {
       System.out.println(ii);ii++;
            
        } while (ii<6);


    }

}
