import java.util.Scanner;

class Ex18{
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    String dex;
    int num;

    System.out.println("Entre your Hexdicimal: ");
    dex = scan.nextLine();

    num = Integer.parseInt(dex, 16);

    System.out.println("the covert: " + num);

    scan.close();


  }

}
