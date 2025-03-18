import java.util.Scanner;

class Ex5{

  public static void main(String[] args){
    Scanner ob1 = new Scanner(System.in);
    int a,b;
    System.out.println("Input first number: ");
    a = ob1.nextInt();
    System.out.println("Input Second  number: ");
    b = ob1.nextInt();
    System.out.println(a+ " * " + b + " = "+ mul(a,b));



  }

  static int mul(int a, int b){
    return a * b;
  }
}