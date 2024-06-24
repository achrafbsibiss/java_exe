import java.util.Scanner;

class Ex9{
  public static void main(String args[]){
    Scanner print = new Scanner(System.in);
    int arr[] = new int [5];
    int change = 0;

    for(int i = 0 ; i < arr.length ; i++){
        System.out.println("numbre for the arr "+i);
        int num = print.nextInt();
        arr[i] = num;
    }

    for(int i : arr){
        System.out.println(i);
    }


    for(int i = 0; i < (arr.length -1); i++){
        for(int j = i+1; j< arr.length; j++){
            if (arr[i] < arr[j]){
               change = arr[j];
               arr[j] = arr[i];
               arr[i] = change ;
            }
        }
    }

    for(int i : arr){
        System.out.println("this for the array " + i);
    }

  }
}