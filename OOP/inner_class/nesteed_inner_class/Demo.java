package OOP.inner_class.nesteed_inner_class;

class Car{

  private String name;


  Car(String name) {
    this.name = name;
  }

  public String show(){
    return "in the show car";
  }

  class Moteur{
    public void config(){
      System.out.println("in config " + name);
    }

    public void tobale(){
      System.out.println(show() + " " + name);
    }
  }
}

public class Demo {
  public static void main(String[] args) {
    Car car2 = new Car("Audi");
    Car.Moteur car1 = car2.new Moteur();
      car1.tobale();
      car1.config();
  }
}
