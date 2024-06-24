import java.util.Scanner;

class Ex31{
    public static void main(String args[]){
        Scanner put = new Scanner(System.in);

        int num;

        System.out.println("entre the number:");
        num = put.nextInt();

        for(int i = num ; i > 1 ; i--){
          int result =  i % 2 ;

          if( result == 0){
            System.out.println( "this is the paire numbber:" + i );
          }
            


        }
    }
}