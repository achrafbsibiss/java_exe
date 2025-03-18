package Exercice.heritage ;

class Form {
  protected float largeur, hauteur;

  Form() {
      this.hauteur = 0;
      this.largeur = 0;
  }

  Form(float largeur, float hauteur) {
      this.hauteur = hauteur;
      this.largeur = largeur;
  }

  public float getLargeur() {
      return largeur;
  }

  public float getHauteur() {
      return hauteur;
  }
}

class Tringle extends Form{
  private  float i ,x;

  Tringle(){
    super();
  }

  Tringle(float x, float i){
    super(x, i);
  }

  public float aire(){
    return this.largeur * this.hauteur;
  }

}

class  Rectangle extends Form{
  private float lar, longeur;

  public Rectangle(){
    super();
  }

  public Rectangle(float lar, float longeur){
    super(lar,longeur);
  }

  public float aire(){
    return this.largeur * this.hauteur;
  }

  
}

public class Ex48 {
    public static void main(String args[]) {
        Rectangle R = new Rectangle(2, 3);
        Tringle T = new Tringle(2, 3);
        Rectangle R1 = new Rectangle();

        System.out.println("Rectangle R - Largeur: " + R.getLargeur() + ", Hauteur: " + R.getHauteur());
        System.out.println("Rectangle R - Aire: " + R.aire());

        System.out.println("Tringle T - Largeur: " + T.getLargeur() + ", Hauteur: " + T.getHauteur());
        System.out.println("Tringle T - Aire: " + T.aire());

        System.out.println("Rectangle R1 - Largeur: " + R1.getLargeur() + ", Hauteur: " + R1.getHauteur());
        System.out.println("Rectangle R1 - Aire: " + R1.aire());
    }
}
