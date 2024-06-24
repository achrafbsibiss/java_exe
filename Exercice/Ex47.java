package Exercice;

class Rectangle{
  private int len;
  private int lar;

  Rectangle(){
     this.len = 0;
     this.lar = 0;
  }

  Rectangle(int lar, int len){
    this.lar = lar;
    this.len = len;
  }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getLar() {
        return lar;
    }

    public void setLar(int lar) {
        this.lar = lar;
    }

    public void perimetre(){
      System.out.println("the perimetre " + ( (getLar() * getLen()) * 2 ));
    }

    public void surface(){
      System.out.println("the surface for the " + (getLar() * getLen()));
    }

    public void affiche(){
      for(int i = 0; i < getLen(); i++){
        System.out.println(" ");
        for(int y =0;  y < getLar(); y++){
          System.out.print("*");
        }
      }
    }

  
}

public class Ex47 {

  public static void main(String[] args) {
      Rectangle l = new Rectangle(7, 3);
      l.surface();
      l.perimetre();
      l.affiche();


  }
  
}
