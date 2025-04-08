package OOP.Treads;

// class A implements Runnable{
//   @Override
//   public void run(){
//     for(int i=1 ; i<=10 ; i++){
//       System.out.println("Hello from A: " + i);
//     }
//     System.out.println("");
//   }
  
// }

class B implements Runnable{
  @Override
  public void run(){
    for(int i=1 ; i<=10 ; i++){
      System.out.println("Hey from B: " + i);
    }
  }
}


public class Demo {

  public static void main(String[] args) {
    Runnable obj1 = () -> {
          for(int i=1 ; i<=10 ; i++){
            System.out.println("Hello from A: " + i);
          }
          System.out.println("");
        };


    Runnable obj2 = new B();
    
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();
  }
  
}
