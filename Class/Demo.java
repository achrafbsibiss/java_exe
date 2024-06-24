class Human{

  public String name;
  public int age;
  static String dry;

  public void to_string(){
    System.out.println("Your name is " +name + " and your age" + age + "the fort " + dry );
  }

}

class Demo{
  public static void main(String args[]){
    
    Human prs1 = new Human();

    Human.dry = "bsibiss";
    prs1.name = "Achraf";
    prs1.age = 12;
    prs1.to_string();

  }
} 