class Demo{
  // String name;
  // int price;
  static {
    String serie = "achraf";
    // in java the JRE he will load this class thas why wen we create the 
    // object he will give me this
    // but if we create other object this variable belogs to Demo class we be load one time
    System.out.println("this the Static variable");
  }
  // public void to_string(){
  //   System.out.print("the name is "+ name + " the price "+ price+ "serie :" + serie);
  // }

  public Demo(){
    String name;
    int price;
    System.out.println("this  public variable");
  }

}

class Mobile {
   public static void main(String args[]){
     Demo n1 = new Demo();
     Demo n2 = new Demo();

    //  n1.name = "MACPRO";
    //  n1.price = 12;
    //  n1.serie = "1232dwkd2";

    //  n1.to_string();

   }
  
}
