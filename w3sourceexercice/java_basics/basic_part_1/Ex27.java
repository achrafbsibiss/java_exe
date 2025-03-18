import java.util.Scanner;

class Ex27{

  static void convert(String num){
    int num1 = Integer.parseInt(num, 8);
    String dix = Integer.toHexString(num1);
    System.out.println(" this the value: "+ dix);
  }

  public static void main(String[] arg){

    Scanner scan = new Scanner(System.in);
    String Octal;

    System.out.println("Entre octal number: ");
    Octal = scan.nextLine();

     

    for(int i = 0; i < Octal.length(); i++){
      
      char a = Octal.charAt(i);
      int num = Integer.parseInt(String.valueOf(a));

      if(num > 8){
        System.out.println("this nuber is not octal");
        break;
      }else if(i == (Octal.length() -1)){
        
        convert(Octal);

      }
    
    }

  }

}
