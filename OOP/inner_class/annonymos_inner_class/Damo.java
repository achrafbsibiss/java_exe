package OOP.inner_class.annonymos_inner_class;

class Other{

  public void show(){
    System.out.println("Achraf");
  };
}

public class Damo {
  

  public static void main(String[] args) {
      
    Other b = new Other()
    {
      @Override
      public void show(){
          System.out.println("hello navin");
      }
    };
    b.show();
  }
  
}
