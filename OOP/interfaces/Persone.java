package OOP.interfaces;

interface Computer {

  void run();
  void code();
  
}


class Laptop implements Computer{

  @Override
  public void run(){
    System.out.println("let run laptop");
  }

  @Override
  public void code(){
    System.out.println("Let run the code in the laptop");
  }
}

class Desktop implements Computer{

  @Override
  public void run(){
    System.out.println("let run laptop");
  }

  @Override
  public void code(){
    System.out.println("Let run the code in the laptop");
  }

}

public class Persone{

  public String name;
  public int age;
  public Computer type;


  public Persone(String name, int age, Computer type){
    this.name = name;
    this.age = age;
    this.type = type;
  }

  @Override
  public String toString(){
    this.type.run();
    this.type.code();
    
    return "the user: " +getname() + " his age: "+ getage();
  }

  public String getname(){
    return  this.name;
  }

  public int getage(){
    return  this.age;
  }

  public static void main(String[] a){

    Computer b = new Desktop();
    Computer c = new Laptop();

    Persone p1 = new Persone("Achraf", 4, c);
    Persone p2 = new Persone("Ali", 10, b);


    System.out.println(p1.toString());
    System.out.println(p2.toString());

    

  }

 
}
