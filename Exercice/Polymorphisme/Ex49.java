package Exercice.Polymorphisme;

class Forme{

  public void aire(){
    System.out.println("im form");
  }
}

class Trinangle extends Forme{
  private int hauteur, base;

  public Trinangle(){
    this.hauteur = 0;
    this.base = 0;
  }

  public Trinangle(int hauteur,int base){
    this.hauteur = hauteur;
    this.base = base;
  }

  public void aire(){
    System.out.println("im Trinangle");
  }
}

class Cercle extends Forme{

  private float rayon;


  public Cercle(){
    this.rayon = 0;
  }

  public Cercle(float  rayon){
    this.rayon = rayon;
  }

  public void aire(){
    System.out.println("im Cercle");
  }
}

class Rectangle extends Forme{
   private int longueur , largeur;

   public Rectangle(){
    this.longueur = 0;
    this.largeur = 0;
   }

   public Rectangle(int longueur, int largeur){
     this.longueur = longueur;
     this.largeur = largeur;
   }

   public void aire(){
    System.out.println("im rectangle");
  }

}

class Carre extends Forme{
  private int cote;

  public Carre(){
    this.cote = 0;
  }

  public Carre(int cote){
    this.cote = cote;
  }

  public void aire(){
    System.out.println("im carre");
  }
}

class Ex49{
  public static void main(String a[]){

    Forme[]  t = new Forme[4];
    t[0]= new Trinangle(6,5);
    t[1]= new Carre(5);
    t[2]= new Cercle(6);
    t[3]= new Rectangle(3,4) ;

    for(Forme forme : t){
      forme.aire();
    }

  }
}