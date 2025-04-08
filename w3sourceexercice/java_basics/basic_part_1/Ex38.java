package w3sourceexercice.java_basics.basic_part_1;

import java.util.Scanner;

public class Ex38{
  // just one create my one Algorithms but we 
  /** can use the  Character#isDigit(int)
     * @see     Character#isJavaIdentifierStart(int)
     * @see     Character#isLetterOrDigit(int)
     * @see     Character#isLowerCase(int)
     * @see     Character#isTitleCase(int)
     * @see     Character#isUnicodeIdentifierStart(int)
     * @see     Character#isUpperCase(int)
  */
  
  static int countnum(String str){
    int sum = 0;
    for(int i = 0; i< str.length(); i++ ){
      char a =  str.charAt(i);
      if(a >= '0' && a <= '9')
        sum++;
      
    }

    return sum;
  }

  static int contLetter(String str){
    int sum = 0;
    for(int i = 0; i< str.length(); i++ ){
      char a =  str.charAt(i);
      if( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')){
        sum++;
      }
    }
    return sum;
  
  }

  static int contSpace(String str){
    char b = ' ';
    int sum = 0;
    for(int i = 0; i< str.length(); i++ ){
      if(b == str.charAt(i)){
          ++sum;
      }
    }
  

    return sum;

  }

  public static void main(String[] args){

    Scanner scan =  new Scanner(System.in);
    String str;

    System.out.println("Entre the string");
    str = scan.nextLine();

    System.err.println("this number " + countnum(str) +  " letters: " + contLetter(str) + " this space: " + contSpace(str));



    
  }
}
