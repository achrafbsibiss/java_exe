import java.util.Scanner;
class Ex21{
    public static void main(String args[]){
        int[] tableau = new int[5];
        Scanner chose = new Scanner(System.in);
        int var1 = 0;



        for(int i = 0 ; i < tableau.length ; i++){
            System.out.println("Enetre the numbre n"+i);
            int num = chose.nextInt();
            tableau[i] = num;
        }

        for(int i : tableau){
            System.out.println( i);
        }

        for(int i = 0 ; i< (tableau.length -1); i++){

            for (int j = i+1 ; j < (tableau.length) ; j++ ){
                if (tableau[i] < tableau[j]){
                    var1 = tableau[i];
                    System.out.println("this the change 1 " + var1);
                    tableau[i] = tableau[j];
                    System.out.println("this the change " + tableau[i]);
                    tableau[j] = var1;
                } 
            }
        }

        System.out.println("the deferences");
        for(int i : tableau){
            System.out.println( i);
        }



    }
}