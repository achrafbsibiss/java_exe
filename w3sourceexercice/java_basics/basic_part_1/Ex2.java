import java.util.Scanner;

class Ex2{
  // Sum of Two Numbers
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int a,b;

    System.out.println("Entre the num1: ");
    a = obj.nextInt();
    System.out.println("entre the num2: ");
    b = obj.nextInt();

    System.out.println("the value for ure sum "+ add(a,b));



  }

  // let create function to add tow value
  
  static int add(int a, int b){
    return a + b;
  }
}