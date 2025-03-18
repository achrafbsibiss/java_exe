import java.util.Scanner;

class Ex25{

  static void dex(String num){
    int oct = Integer.parseInt(num, 8);
              
    String hexa = Integer.toHexString(oct);
                  
    System.out.println("this the value " + hexa);
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String oct;

    System.out.println("Enter the oct: ");
    oct = scan.nextLine();

    for(int i = 0; i < oct.length(); i++ ){
      char a = oct.charAt(i);      
      System.out.println(a);
      int b = Integer.parseInt(String.valueOf(a));
      System.out.println(b);

      if (b >= 8){
        System.out.println("this is not oct");
        break;
      }else if( i == (oct.length() - 1)){
        dex(oct);
      }

    }
    scan.close();
  }

}
