package w3sourceexercice.java_basics.basic_part_1;
import java.util.Scanner;





public class Ex33 {
  static int degits(int num1){
    String con = Integer.toString(num1);
    int sum = 0;
    char x;

    for(int i = 0; i < con.length(); i++){
      x = con.charAt(i);
      sum += (x - '0');

    }

    return sum;
  }
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int num1;

    System.out.println("Entre the numbre: ");
    num1 = scan.nextInt();

    System.out.println(degits(num1));
  }
  
}
