package OOP.object_class;

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void speak(){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }

    @Override
    // we use the override annotation to override the toString method from the object class
    // we can use the toString method to print the object but he will print the address of the object
    public String toString(){
        return "My name is "+name+" and I am "+age+" years old.";
    }

}


public class Demo{

  public static void main(String[] args) {
      Person person1 = new Person("Achraf", 25);
      Person person2 = new Person("Davin", 30);

      System.out.println(person1.toString());
      System.out.println(person2);
  }

}