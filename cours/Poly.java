package cours;

class A{

  public final  String met_a(){
    return  "this a";
  }
}


class B extends  A{

  // public String met_a(){
  //   return  "this b";
  // }

}

public class Poly {

  public static void main(String[] args) {
      A b = new B();

      System.out.println( b.met_a());
  }

  
}
