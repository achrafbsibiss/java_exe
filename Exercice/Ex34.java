import java.util.Scanner;
class Ex34{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);

        int num1;

        System.out.println("Entre the numbre: ");
        num1 = num.nextInt();


        for(int i = 1; i <= num1; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println("\n");
        }



    }
}