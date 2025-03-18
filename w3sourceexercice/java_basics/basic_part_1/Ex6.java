import java.util.Scanner;

class Ex6{

  public static void main(String[]  args){
    Scanner select = new Scanner(System.in);
    int a;

    System.out.println("select OPERATION \n 1- Addition\n 2- multiplication\n 3- Division\n  4- subtraction\n 5- module");
    a = select.nextInt();
    operation(a);
  } 

  static void operation(int a){
    int num1, num2;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter first num1:" );
    num1 = obj.nextInt();
    System.out.println("Enter Second  num2:" );
    num2 = obj.nextInt();

    switch(a){
      case 1:
        System.out.println("this the resulte: "+ add(num1, num2));
        break;
      case 2:
        System.out.println("this the resulte: "+ mul(num1, num2));
        break;
      case 3:
        System.out.println("this the resulte: "+ div(num1, num2));
        break;
      case 4:
        System.out.println("this the resulte: "+ sub(num1, num2));
        break;
      case 5:
        System.out.println("this the resulte: "+ mod(num1, num2));
        break;
      default:
        System.out.println("we don't have this Shows ");
      
    }
  }

  static int add(int a, int b){
    return  a + b;
  }

  static int div(int a, int b){
    return a/b;
  }

  static int mul(int a, int b){
    return a*b;
  }

  static int mod(int a, int b){
    return a % b;
  }

  static int sub(int a, int b){
    return a - b;
  }



}