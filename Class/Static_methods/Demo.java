class Mobile{
  int numbre;
  String name;
  static String casa;

  static void to_string(Mobile obj){
     System.out.println("your name "+ obj.name + " numbre " + obj.numbre + " static " + casa);
  }

  public void to_string1(){
    System.out.println("your name "+ name + " numbre " + numbre + " static " + casa);
  }
}

class Demo {
  public static void main(String[] args) {
      Mobile hello = new Mobile();
      
      hello.name = "Achraf";
      hello.numbre = 123;
      Mobile.casa = "Casa";


      hello.to_string1();
      Mobile.to_string(hello);

  }
  
}
