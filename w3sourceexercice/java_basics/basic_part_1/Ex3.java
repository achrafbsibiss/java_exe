import java.util.Scanner;

class Ex3{
  // Division of Two Numbers

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int a,b;

    System.out.println("Entre nuber you wan to be div");
    a = obj.nextInt();
    System.out.println("the second num");
    b = obj.nextInt();

    System.out.println("this the value; "+ div(a,b));

  }

  // crete metod for division

  static int div(int a, int b){
    return a/b;
  }
}