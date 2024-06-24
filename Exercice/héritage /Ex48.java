package Exercice.héritage ;

class Form{
  private float largeur, hauteur;
  Form(){
    this.hauteur = 0;
    this.largeur = 0;
  }

  Form(float largeur, float hauteur){
    this.hauteur = hauteur;
    this.largeur = largeur;
  }
}

class Tringle extends Form{
  private  int i ,x;

  Tringle(){
    super();
  }

  Tringle(int x, int i){
    super(x, i);
  }

  public int aire(){
    return  (x * i)/2 ;
  }

}

class  Rectangle extends Form{
    
  
}

public class Ex48 {
  
}
