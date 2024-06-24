package OOP.exercice;

class Rectongle{
    private int a;
    private int b;

    public Rectongle(int a, int b){
      this.a = a;
      this.b = b;
    }

    public int surface(){
      return a * b ;
    }

}

public class Ex30 {

  public static void main(String[] args) {
      Rectongle l = new Rectongle(5, 6);
      Rectongle b = new Rectongle(12, 12); 

      System.out.println(l.surface());
      System.out.println(b.surface());
  }

  
}
