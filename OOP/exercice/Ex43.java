package OOP.exercice;

import java.util.Scanner;

class Point{
  private 
    double x, y;

  public Point(){
    this.x = 0;
    this.y = 0;
  }

  public Point(double x, double y){
    this.x = x;
    this.y = y;

  }

  public double get_y(){
    return  y;
  }

  public double get_x(){
    return x;
  }

  public void set_x(double x){
    this.x = x;
  }

  public void set_y(double y){
    this.y = y;
  }

  public Point deplace(float dx, float dy ){
    set_x(get_x()+dx);
    set_y(get_y()+dy);
    return this;
  }

  public void affiche(){
    System.out.println("les coordonnees sont:");
    System.out.println("the x :" + get_y());
    System.out.println("the y :" + get_x());
  }

  public void saisir(){
    Scanner n = new Scanner(System.in);
    System.err.println("Entre the x");
    this.x = n.nextFloat();
    System.err.println("Entre the y");
    this.y = n.nextFloat();
  }
  

  public double distance(Point other){
    double x1,y1,rst;

    x1 = this.get_x() - other.get_x();
    y1 = this.get_y() - other.get_y();
    rst = Math.sqrt( x1 * x1 + y1 * y1);

    return rst;
  }

  public void milieu(Point other){

    double x1,y1;
    x1 = (this.get_x() + other.get_x()) / 2;
    y1 = (this.get_y() + other.get_y()) / 2;
    Point p = new Point(x1, y1);
    p.affiche();
  }
}

public class Ex43 {

  public static void main(String[] args){

    Point p1 = new Point(12,14);
    Point p2 = new Point(2,4);
    Point p3 = new Point();

    System.out.println("the distence bwtwen this tow point " + p1.distance(p2));

    p3.saisir();
    System.out.println("the info for the " + p3.get_x() + " " +p3.get_y());

    p1.milieu(p3);

    Point c = p1.deplace(12, 1).deplace(1, 1);

    System.out.println("the deplacce :" );
    c.affiche();
  }
  
}

