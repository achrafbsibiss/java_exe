package w3sourceexercice.java_basics.basic_part_1;

import java.util.Scanner;

public class Ex38{

  static int countnum(String str){
    char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8','9'}; 
    char a;
    int sum = 0;
    for(int i = 0; i< str.length(); i++ ){
      a =  str.charAt(i);
      for(char num : nums){
        if(num == a)
          sum++;
      }
    }

    return sum;
  }

  static int contLetter(String str){
    char[] caseLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
                           'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char a;
    int sum = 0;
    for(int i = 0; i< str.length(); i++ ){
      a =  str.charAt(i);
      for(char num : caseLetters){
        if(num == a || a == Character.toUpperCase(num)){
          ++sum;
          break;
        }
      }
    }
    return sum;
  
  }

  static int contSpace(String str){
    char b = ' ';
    char a;
    int sum = 0;
    for(int i = 0; i< str.length(); i++ ){
      a =  str.charAt(i);
        if(b == a){
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
