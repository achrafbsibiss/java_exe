import java.util.Scanner;

class Ex38{
  public static void main(String args[]){
    Scanner number = new Scanner(System.in);
    int pair = 0, impair = 0;

    int[] arr = new int[10];

    for(int i = 0; i< arr.length; i++ ){
      System.out.println("Entre the numbre in the arr "+i);
      arr[i] = number.nextInt();
    }

    for(int i : arr){
      if(i%2 == 0){
        pair++;
      }else{
        System.out.println(i);
        impair++;
      }
    }
    System.out.println("the number for the pair "+ pair);
    System.out.println("the number for the impair "+ impair);


  }
}