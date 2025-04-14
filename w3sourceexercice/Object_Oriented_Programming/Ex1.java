package Object_Oriented_Programming;

class Cat{
  private String name;
  private int age;


  Cat(){
    this.name = "Unkonu";
    this.age = 0;
  }

  Cat(int age, String name){
    this.name = name;
    this.age = age;
  }




  public String get_name(){
    return name;
  }
  
  public int get_age(){
    return age;
  }

  public String toString(){
    return "thename for the cat is: " + get_name() + " and the age: " + get_age() + " ";
  }
}


public class Ex1{
  public static void main(String args[]){
    Cat cat1 = new Cat();
    Cat cat2 = new Cat(12, "mino");

    System.out.println(cat1.toString());
    System.out.println(cat2.toString());
  }
}
