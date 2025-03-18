package OOP.inheretence;

public class Moto{
  protected float speed; // when we give for the acces modifier protected, we can access it in the sub class
  protected float km; // but we can not access it different packages non sub class

  public Moto(float speed, float km){
    this.speed = speed;
    this.km = km;
  }

}