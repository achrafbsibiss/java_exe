import java.util.Scanner;

class Ex12{

  public static void main(String[] args){

    Scanner ob = new Scanner(System.in);
    int a,b,c;

    System.out.println("Entre first number: ");
    a = ob.nextInt();
    System.out.println("Entre second number: ");
    b = ob.nextInt();
    System.out.println("Entre tert number: ");
    c = ob.nextInt();

    System.out.print("the avrege for this number: "+ (c+a+b)/3);
  }
}