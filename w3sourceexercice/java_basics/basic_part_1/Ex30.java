import java.util.Scanner;


public class Ex30 {
  
  public static boolean checkHex(String hex){
    char[] verification = {'A', 'a', 'B', 'b', 'c', 'C', 'D', 'd',
                           'e', 'E', 'f', 'F','0', '1', '2', '3',
                            '4', '5', '6', '7', '8', '9' };
    boolean validation = false;

    for(int i = 0 ; i < hex.length(); i++){
      char a = hex.charAt(i);

      for(char value : verification){
        
        if(a == value){
          validation = true;
          break;
        }
        validation = false;
      }

      if(!validation){
        System.out.println("this is not a hexadecimal number: "+ a);
      }
      
    }
    
    convert(validation, hex);
    return validation;

  }

  public static void convert(boolean validation, String hex){
    int num;
    Stri ng binary;

    if (validation){
      num = Integer.parseInt(hex, 16);
      binary = Integer.toBinaryString(num);
      System.out.println("this the convert hexadecimal to binary: "+ binary);
    }


  }
 
  public static void main(String[] Args){

    Scanner scan = new Scanner(System.in);
    String hex;
    System.out.println("Entre the number: ");
    hex = scan.nextLine();
    
    checkHex(hex);
    

    scan.close();
  }  
}
