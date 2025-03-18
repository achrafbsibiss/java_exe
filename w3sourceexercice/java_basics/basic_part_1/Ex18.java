import java.util.Scanner;

class Ex18{
  
  static int mul(int a,int b){
    return a * b;
  }

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String bin1, bin2, sumbin;
    int num1, num2, sum;

    System.out.println("Entre the first binary");
    bin1 = scan.nextLine();
    System.out.println("Entre the second binary");
    bin2 = scan.nextLine();

    num1 = Integer.parseInt(bin1,2);
    num2 = Integer.parseInt(bin2,2);
    sum = mul(num1,num2);

    sumbin = Integer.toBinaryString(sum);


    System.out.println("this value for the result: "+ sumbin);


    
    scan.close();
  }
}
