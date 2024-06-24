import java.util.Scanner;

class Ex32{
    public static void main(String args[]){
        Scanner number = new Scanner(System.in);
        int num, somme = 0;
        
        System.out.println("entre nubmbre");
        num = number.nextInt();

        for(int i = num; i > 0 ; i--){
            
            int result = i%2;

            if( result != 0){
             somme= somme + i;
             System.out.println("this is the result" + somme);
            }

        }

    }
}