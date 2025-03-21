 package w3sourceexercice.java_basics.basic_part_1;

 import java.util.Scanner;


 class Ex36{
  static final float EARTH_R  = 6371.01f;

  static double distanceTowPoint(double lan1, double log1, double lan2, double log2){
      lan1 = Math.toRadians(lan1);
      log1 = Math.toRadians(log1);
      lan2 = Math.toRadians(lan2);
      log2 = Math.toRadians(log2);

      double d = EARTH_R  * Math.acos(Math.sin(lan1) * Math.sin(lan2) + Math.cos(lan1) * Math.cos(lan2) * Math.cos(log1 - log2));
      return d;

  }

  public static void main(String[] args){
    
      double lan1, log1, lan2, log2;
      Scanner input = new Scanner(System.in);
      System.out.print("Input the latitude of coordinate 1: ");
      lan1 = input.nextDouble();
      System.out.print("Input the longitude of coordinate 1: ");
      log1 = input.nextDouble();
      System.out.print("Input the latitude of coordinate 2: ");
      lan2 = input.nextDouble();
      System.out.print("Input the longitude of coordinate 2: ");
      log2 = input.nextDouble();
      System.out.println("The distance between those points is: " + distanceTowPoint(lan1, log1, lan2, log2) + " km");


  }

}
