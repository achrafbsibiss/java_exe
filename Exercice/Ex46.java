package Exercice;

class Time{
  private int heures, min, sec;

  public Time(){
    heures = 0;
    min = 0;
    sec = 0;
  }

  public Time(int heures, int min, int sec){
    this.heures = heures;
    this.min = min;
    this.sec = sec;
  }

  public int getheures(){
    return heures;
  }

  public void setheurs(int heures){
    this.heures = heures;
  }

  public int getmin(){
    return min;
  }

  public void  setmin(int min){
    this.min = min;
  }

  public int getsec(){
    return sec;
  }

  public void getsec(int sec){
    this.sec = sec;
  }

  public void add(Time t1, Time t2){
    this.min = t1.getmin() + t2.getmin();
    this.sec = t1.getsec() + t2.getsec() + (this.sec/60);
    this.heures = t1.getheures() + t2.getheures() + (this.min/60);
    this.min %= 60;
    this.sec %= 60;


    System.out.println("");

  }

  public void to(){
    System.out.println(12/2);
  }

  public void affiche(){
    System.out.println( getheures()+ "h "+ getmin() + "min " +  getsec());
  }



}


public class Ex46 {

  public static void main(String[] args) {

    Time t1 = new Time(3, 55, 20);
    Time t2 = new Time(40, 5, 20);

    Time t3 = new Time();


    t3.add(t1, t2);

    t3.affiche();

      
  }

  
}
