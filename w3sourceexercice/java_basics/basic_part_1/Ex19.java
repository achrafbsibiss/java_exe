
import java.util.Scanner;


class Ex19{
  
  static void convertIntToBinary(int num){
    String binary = Integer.toBinaryString(num);

    System.out.println("the number is converert to binary: " + binary);
  }
  public static void main(String[] args){
    int num;
    Scanner Scan = new Scanner(System.in);

    System.out.println("Entre the first binary");
    num = Scan.nextInt();

    convertIntToBinary(num);

    Scan.close();
  }
}
