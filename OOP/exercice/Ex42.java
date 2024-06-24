package OOP.exercice;

import java.util.Scanner;

class Etudient{

  private
    String name;
    float note1, note2;

  public Etudient( String name, float note1, float note2){
    this.name = name;
    this.note1 = note1;
    this.note2 = note2; 
  }

  

  public String getName() {
    return name;
  }



  public float getNote1() {
    return note1;
  }



  public float getNote2() {
    return note2;
  }



  public float calc_moy(){
    return  (getNote1() + getNote2())/2;
  }

  public void to_string(){
    System.out.println("the student "+ getName() + " the result he have " + calc_moy());
  }
  
  

}

public class Ex42 {

  public static void main(String[] args) {
    Scanner put = new Scanner(System.in);
    String name;
    float note1, note2;

    System.out.println("Entre the name for the Student: ");
    name =  put.nextLine();
    System.out.println("Entre the note1 for the Student: ");
    note1 =  put.nextInt();
    System.out.println("Entre the note2 for the Student: ");
    note2 =  put.nextInt();

    Etudient n1 = new Etudient(name, note1, note2);


    n1.to_string();


  }
  
}
