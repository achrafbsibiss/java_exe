import java.util.Scanner;

class Ex24{

  static void oct(String bin){
    
    int num = Integer.parseInt(bin, 2);
    String octal = Integer.toOctalString(num);

    System.out.println("this the value: "+ octal);

  }


  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String bin;

    System.out.println("Entre the binary num");

    bin = scan.nextLine();

    oct(bin);

    scan.close();


  }
  
}
