package w3sourceexercice.java_basics.basic_part_1;

import java.util.Scanner;

public class Ex34 {
  static final float pi = 3.14f;

  static double areaHexagon(int hiegth){
    return (6 * Math.pow(hiegth, 2))/(4* Math.tan(pi/6));
  }
  
  public static void main(String[] args){
    int hiegth;
    Scanner scan = new Scanner(System.in);

    System.out.println("entre the lenght: ");
    hiegth = scan.nextInt();
    System.err.println( pi );

    System.out.println(areaHexagon(hiegth));
  }
}
