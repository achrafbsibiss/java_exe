import java.util.Scanner;

public class Ex17 {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first binary number: ");
        String binary1 = scanner.nextLine();
        
        System.out.print("Enter second binary number: ");
        String binary2 = scanner.nextLine();
        
        // Convert binary strings to integers using base 2
        int num1 = Integer.parseInt(binary1, 2);
        System.out.println("this the first binary: " + num1);
        int num2 = Integer.parseInt(binary2, 2);
        System.out.println("this the second binary: "+ num2);
        // Add the numbers
        int sum = num1 + num2;
        
        // Convert sum back to binary
        String binarySum = Integer.toBinaryString(sum);
        
        System.out.println("Sum in binary: " + binarySum);
        
        scanner.close();

  }
}
