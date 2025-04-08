package OOP.inner_class.Static_inner_class;

class Outher{
  private static void otherMethod(){
    System.err.println("this the other");
  }

  static class Inner{

    public static void display(){
      System.err.println("hello");
      otherMethod();
    }
  }
}

public class Demo {

  public static void main(String[] args){

    Outher.Inner.display();

  }
  
}
