package OOP.abstraction;

// the astraction is create class where he can have alot for in formation
// for example car but we don't know how the moteur work or call
// but we can create class for abstract class
abstract class Car{

  public  abstract void drive(); // when we call abstract method the class should be abstract

  public void playmusic(){
    System.out.println("Drinving");
  }
}

class Bmw extends Car{

  @Override
  public void drive(){
    System.out.println("the Bmw is drived");
  }

}



public class Demo {

  public static void main(String[] args) {
      Car m3 = new Bmw();

      m3.drive();
  }
  
}
