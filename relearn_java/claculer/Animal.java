class Cat{

  // if you don't not one to return any value you can use void in youre method
  public void playvoice(){
    System.out.println("play voice .....");
  }

  public int timeToEat(){
    return 3;
  }
  
}

class Animal{

  public static void main(String[] args){

    Cat cat = new Cat();

    cat.playvoice();
    // System.out.println( cat.timeToEat());


  }
}