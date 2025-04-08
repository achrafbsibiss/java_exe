package w3sourceexercice.java_basics.basic_part_1;


public class Ex39{

  public static void main(String[] args) {
      int count = 0;

      for(int i = 1; i <=4 ; i++){
        for(int k = 1; k <=4; k++ ){
          for(int j =1; j <= 4; j++){
            if((k != i) && (k != j) && (i != j)){
              count++;
              System.err.println(i+""+k+""+j);
            }
          }
        }
      }

      System.out.println("this result will have for the tree " + count);
  }
}