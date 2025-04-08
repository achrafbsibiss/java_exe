package w3sourceexercice.java_basics.basic_part_1;

import java.util.Scanner;
public class Ex41 {
  
  public static void main(String[] a){
    Scanner scan = new Scanner(System.in);
    char b = scan.next().charAt(0);

    int ascii = b;
    System.out.println("ASCII value of " + b + ": " + ascii);
  }

}
