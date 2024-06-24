import java.util.*;

class Test{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int a = 45;
        int b = 2;
        int[] tableau = new int[10];
        System.out.println("hello");

        System.out.println(a + " / " + b + " = " + a/b  );

        for(int i = 0; i < tableau.length; i++ ){
            System.out.println("Entre the numbure ");
            int n1 = num.nextInt();
            tableau[i]= n1;
        }

        System.out.println("Entre le nobre que vous cherche ");
        int cherche = num.nextInt();

        for( int rst : tableau){
            if (rst == cherche){
                System.out.println(rst + 1);
            }
        }

        int bg=0;
        for(int d=0 ; d < (tableau.length - 1); d++){
            if (tableau[d] < tableau[d+1]){
                bg = tableau[d+1];
            }else{
                bg = tableau[d];
            }
        }
        System.out.println(bg);



        
    
    }
}