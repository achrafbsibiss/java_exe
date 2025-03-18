import java.util.Scanner;

class Ex7{
  
  public static void main(String[] args){
    Scanner mul = new Scanner(System.in);
    int a;

    System.out.println("entre the number :");
    a = mul.nextInt();
    table(a);

  }

  static void table(int a){
    for (int i = 0; i < 11; ++i){
      System.out.println(i + " *  " + a + " = " + a*i);
    }
  } 
}