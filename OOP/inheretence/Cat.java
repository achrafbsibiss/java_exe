// package OOP.inheretence;
import OOP.inheretence.inheretence_package.Animal;


public class Cat extends Animal {
  public char position;

  Cat(String name,int age, String color, String type, char position){
    super(name, age, color, type);
    this.position = position;
  }
  public static void main(String[] args){

    Cat mo = new Cat("momo", 12,"blue", "alif", '+');

    System.out.println(mo);
  }
}



