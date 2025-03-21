package OOP.finale;

// final keword is constant, we can't change it
// in class level, we can't inherit from it
// in method level, we can't override it
// in variable level, we can't change it

class clac{
  static final void show(){
    System.out.println("Achraf");
  }
}

class AdvancedCalc extends clac{

  // if we try to override the final method we will get an error
  // static void show(){
  //   System.out.println("davin");
  // }
}

public class Demo {

  public static void main(String[] args) {
    clac h = new AdvancedCalc ();

    h.show();
  }
  
}
