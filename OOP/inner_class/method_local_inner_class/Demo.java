package OOP.inner_class.method_local_inner_class;

class Moteur{

  public String cond;

  public Moteur(String cond){
    this.cond = cond;
  }

  public void show(){
    System.err.println("Start moteur create condicteur: ");

    class Condicteur{

      public String name;

      public Condicteur(String name) {
        this.name = name;
      }

      public String read(){
        return  "this the name for the condicteur " +name ;
      }
    }

    Condicteur con = new Condicteur(cond);
    System.err.println(con.read());
  }

}

public class Demo {
  public static void main(String[] args) {
      Moteur m1 = new Moteur("Achraf");
      Moteur m2 = new Moteur("ali");

      m2.show();

      m1.show();
  }
}
