package Exercice;

class Compte{
  private int solde;
  public Compte(){
    solde = 0;
  }

  public Compte(int solde){
    this.solde = solde;
  }

  public int getSolde() {
      return solde;
  }

  public void setSolde(int solde){
      this.solde = solde; 
  }

  public void depose(int metre){
    setSolde(getSolde() + metre);  
  }

  public void retre(int retre){
    if( getSolde() < retre || retre == 0){
      System.out.println("you can not do the retre");
    }else{
      setSolde(getSolde() - retre);
      System.out.println("take your :" + retre);
    }
  }

  public int intere(int inter){
      solde =  solde * (1 + inter);
      return solde;
  }

  
}


public class Ex45 {

  public static void main(String[] args) {
      Compte achraf = new Compte(14);

      // achraf.depose(12);
      achraf.retre(2);
      System.out.println(achraf.getSolde());
      System.out.println( achraf.intere(11) );
      System.out.println(achraf.getSolde());
  }
  

}
