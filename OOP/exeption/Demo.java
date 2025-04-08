package OOP.exeption;

public class Demo {
  public static void main(String[] args) {
      int i = -2;
      int j = 10;
      int[] arr = new int[5];
      
      try {
        System.out.println("result = " +j/i);
        System.out.println(arr[0]);
        System.out.println(arr[5]);
        
          
      } catch (ArithmeticException e) {
          System.out.println("Can't divide by zero");
      }
      catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Array out of bound");
      }
      catch (Exception e) {
          System.out.println("Something went wrong" + e);
      }
  
      System.out.println("Outside try-catch block");
  }
  
}
