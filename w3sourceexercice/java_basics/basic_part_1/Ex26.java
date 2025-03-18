import java.util.Scanner;


class Ex26{

  static void convert(String num){
    
    int numInt = Integer.parseInt(num, 8);
    String binary = Integer.toBinaryString(numInt);

    System.out.println("this the convert the octal: "+ num+ " to binary: " + binary);
  }
 
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String oct;

    System.out.println("Enter the number ");
    oct = scan.nextLine();

    // check if the octal don't pase 8
    
    for(int i = 0; i < oct.length(); i++){
      
      char chare = oct.charAt(i);
      int num =  Integer.parseInt(String.valueOf(chare));

      if( num >= 8){
        System.out.println("is not octal number");
        break;
      }else if(i == (oct.length() - 1)){
          convert(oct);
      }

    }





  }


}
