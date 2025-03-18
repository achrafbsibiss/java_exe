import java.util.Scanner;

class Ex21{
  
  static void toOct(int num){
    String oct = Integer.toOctalString(num);

    System.out.println("this to octal "+ oct);
  }

  public static void main(String[] args){
    
    int num;
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre the number do you wan to convert ");
    num = scan.nextInt();

    toOct(num);

    scan.close();
  }

}
