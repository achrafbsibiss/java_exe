import java.util.Scanner;

class Ex22{

  static void toDex(String a){
    int num = Integer.parseInt(a, 2);

    System.out.println("this the resulte  "+ num);
  }


  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    String bin;

    System.out.println("Enter the bbinary num");
    bin = scan.nextLine();

    toDex(bin);

    scan.close();

  }

}
