package OOP.inheretence;

import OOP.inheretence.packages.Cars;



public class Voiture{

  // public Voiture(float speed, float km){
  //   super(speed, km);
  // }
  public static void main(String[] args) {
    Cars cars1 = new Cars("Toyota", "Corolla", 2020, "Black");
    Moto moto1 = new Moto(120, 1000);

    System.out.println("Speed: " + moto1.speed);
    System.out.println("Km: " + moto1.km);
    System.out.println("Brand: " + cars1.brand);
    // System.out.println("Model: " + cars1.model);
    // System.out.println("Year: " + cars1.year);
  }
}