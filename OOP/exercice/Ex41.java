package OOP.exercice;

import java.util.Scanner;


class Somme{

  private int a, b;

  public Somme(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int som(){
    return a + b;
  }
}


public class Ex41 {
  public static void main(String[] args) {
    Scanner test  =  new Scanner(System.in);
    int a,b;

    System.out.println("Entre the first numbre");
    a = test.nextInt();
    System.out.println("Entre the first numbre");
    b = test.nextInt();

    Somme fi = new Somme(a, b);
    System.out.println("the value for the it's  " + fi.som());

       
    test.close();
  } 
}
