package w3sourceexercice.java_basics.basic_part_1;

import java.util.Scanner;

public class Ex32 {

  static void compar(int num1, int num2){
    if (num1 == num2) {
        System.out.println(num1 + " == " + num2);
    } else {
        System.out.println(num1 + " != " + num2);
        System.out.println(num1 + (num1 > num2 ? " > " : " < ") + num2);
        System.out.println(num1 + (num1 > num2 ? " >= " : " <= ") + num2);
    }
  }

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int num1, num2;

    System.out.println("Enter the first num");
    num1 = scan.nextInt();

    System.out.println("Enter the second num");
    num2 = scan.nextInt();
    compar(num1,num2);
  }
  
}
