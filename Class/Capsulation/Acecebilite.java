// so here we will learn the capsulation in java
// the java capsulation to protect the data and we should ask for it
// thas why we use the getr and seter
// in the set method we should do the (this) we tell it's thw current object


class Perso{
  private String name ;
  private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void to_string(){
      System.out.println("tha name "+ getName() + " age " + getAge());
     }

  
}



class Acecebilite {
  public static void main(String[] args) {
      Perso pr1 = new Perso();
      pr1.to_string();
      
      pr1.setName("achraf");
      pr1.setAge(12);
  }
  
}
