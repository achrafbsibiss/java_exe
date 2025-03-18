package OOP.inheretence.packages;

public class Cars {
  public String brand; // we should for evry variable the access modifier
  protected String model; // if we use protected we can't access it in the different package
  protected int year;
  public String color;

  public Cars(String brand, String model, int year, String color) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.color = color;
  }

}
