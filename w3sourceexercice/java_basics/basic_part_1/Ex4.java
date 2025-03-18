import java.util.Scanner;

class Ex4{
  // Arithmetic Operations
  // i will create small Calculator 
  public static void main(String[] args){
    Scanner select = new Scanner(System.in);
    System.out.println("select OPERATION \n 1- Addition\n 2- multiplication\n 3- Division\n  4- subtraction\n 5- module");
    int g = select.nextInt();
    operation(g);

  }

  static void operation(int g){
    Scanner obj1 = new Scanner(System.in);
    int a,b;
    switch(g){
      case 1:
        System.out.println("Entere the first num and the last num");
        a = obj1.nextInt();
        b = obj1.nextInt();
        System.out.println("this the value" + add(a,b));
        break;
      case 2:
        System.out.println("Entere the first num and the last num");
        a = obj1.nextInt();
        b = obj1.nextInt();
        System.out.println("this the value" + mul(a,b));
        break;
      case 3:
        System.out.println("Entere the first num and the last num");
        a = obj1.nextInt();
        b = obj1.nextInt();
        System.out.println("this the value" + div(a,b));
        break;
      case 4:
        System.out.println("Entere the first num and the last num");
        a = obj1.nextInt();
        b = obj1.nextInt();
        System.out.println("this the value" + sub(a,b));
        break;
      case 5:
        System.out.println("Entere the first num and the last num");
        a = obj1.nextInt();
        b = obj1.nextInt();
        System.out.println("this the value" + mod(a,b));
        break;
      default:
        System.out.println("select from 1 to 5");
    }
  }

  static int add(int a, int b){
    return  a + b;
  }

  static int div(int a, int b){
    return  a / b;
  }

  static int mul(int a, int b){
    return  a * b;
  }

  static int sub(int a, int b){
    return  a - b;
  }

  static int mod(int a, int b){
    return  a % b;
  }

  
}