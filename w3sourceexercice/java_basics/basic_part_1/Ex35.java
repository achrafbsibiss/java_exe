package  w3sourceexercice.java_basics.basic_part_1;

import java.util.Scanner;


public class Ex35 {

  static final float pi = 3.14f;

  public static double areaPoligon(float hiegth, int numSide){
    return (numSide * Math.pow(hiegth, 2))/(4*Math.tan(pi/numSide));
  }

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      float hiegth;
      int numSide;

      System.out.println("Entre the hiegth: ");
      hiegth = scan.nextFloat();
      System.out.println("Entre the num side: ");
      numSide = scan.nextInt();

      System.out.println("this the result for is: " + areaPoligon(hiegth, numSide));


  }
  
}
