import java.util.Scanner;


class Ex23{

  static void hex(String a){
    
    int num = Integer.parseInt(a,2);
    String hexa = Integer.toHexString(num);

    System.out.println("this for the convert: "+ hexa);

  }


  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    String bin;

    System.out.println("Entre the binary ");

    bin = scan.nextLine();
    hex(bin);

    scan.close();

  }
}
