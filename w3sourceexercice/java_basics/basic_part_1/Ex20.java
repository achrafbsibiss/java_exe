import java.util.Scanner;

class Ex20{
  
  static void conToHex(int a){
    String  hex = Integer.toHexString(a);

    System.out.println("this the number hexadicimale: " + hex );
  }


  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int num;

    System.out.print("Enter the num ");
    num = scan.nextInt();

    conToHex(num);

    scan.close();
  }

}
