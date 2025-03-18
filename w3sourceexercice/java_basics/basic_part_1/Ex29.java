import java.util.Scanner;

class Ex29{

  static boolean checkHex(String hex){
    char[] verification = {'A', 'a', 'B', 'b', 'c', 'C', 'D', 'd',
                           'e', 'E', 'f', 'F','0', '1', '2', '3',
                            '4', '5', '6', '7', '8', '9' };
    boolean val = false;
    for(int i= 0; i < hex.length(); i++){
      char a = hex.charAt(i);
      

      for(char value: verification){
        
        if(value == a ){
          val = true;
          break;
        }
        val = false;
      }
      
      System.out.println("this the value for the check: " + a);
      if ( !val ){
        System.out.println("that is not a hexadecimal");
        break;
      }

    }
    System.out.println("this the value for the check: " + val);
    return val;
  }

  static int convertToDecimal(String hex){
    int decimal = Integer.parseInt(hex, 16);
    return decimal;
  }
  public static void main(String[] Args){
    Scanner scan = new Scanner(System.in);
    
    String hex;
  
    System.out.println("Entre the hexa number: ");
    hex = scan.nextLine();

    if(checkHex(hex) == true){
      System.out.println("this the value for convert to dicimal: " + convertToDecimal(hex));
    }

    scan.close();
  }

}
