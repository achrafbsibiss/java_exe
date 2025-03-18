import java.util.Scanner;

class Calc{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int a,b;

    System.out.println(" Enter the the number for the cal do wo wan to make: 1/ + \n2/ -\n3/ *\n4/ /\n5/ %");
    int num = input.nextInt();

    
        System.out.println("entre the first number");
        a = input.nextInt();
        System.out.println("entre the second number");
        b = input.nextInt();

    switch(num){
      case 1:
        System.out.println(" this the resulte "+ add(a, b));
        break;
      case 2:
       System.out.println(" this the resulte "+ sub(a, b));
       break;
      case 3:
        System.out.println(" this the resulte "+ mul(a, b));
        break;
      case 4:
        System.out.println(" this the resulte "+ div(a, b));
        break;
      case 5:
        System.out.println(" this the resulte "+ mod(a, b));
        break;
      default:
        System.out.println(" we don't have this");
        break;
      
    }
  
  }

  public static int add(int a, int b){
    return a+b;
  }

  public static int sub(int a, int b){
    return a - b;
  }

  public static int mul(int a, int b){
    return a * b;
  }

  static int div(int a, int b){
    return a / b;
  }

  static int mod(int a, int b){
    return a % b;
  }
}