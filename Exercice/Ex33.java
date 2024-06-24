import java.util.Scanner;

class Ex33{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);

        System.out.println("Entre the numbre for the num1");
        int num1 = num.nextInt();

        System.out.println("Entre the numbre for the num2");
        int num2 = num.nextInt();

        if(num1 < num2){
            System.out.println(num2 + " / "+ num1 + " = " + num2/num1);
        }else{
            System.out.println(num1 + " / "+ num2 + " = " + num1/num2);
        }


    }
}