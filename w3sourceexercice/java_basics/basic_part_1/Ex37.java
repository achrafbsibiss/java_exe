package w3sourceexercice.java_basics.basic_part_1;
import java.util.Scanner;

public class Ex37 {
  
  static String reverseString(String str){
    char a;
    StringBuffer revString = new StringBuffer();

    for(int i = 0; i < str.length(); i ++){
      a = str.charAt(i);
      revString.insert(0, a);
    }

    return revString.toString();
  }
  
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str;
      System.out.print("Input a string: ");
      str = scan.nextLine();

      System.out.println("The length of the string is: " + reverseString(str));

  }
}
