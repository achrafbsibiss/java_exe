class Testarray{
  // why we use the array
  // we use the array to not creat many a lot for instance varaiable we use array also for 
  // optimaze the memory

  public static void main(String[] args){
    //  we can create array like that
    int num[] = new int [4];
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 4;

    // to print all value we use for

    for(int i=0; i < num.length; i++){
      System.out.println( num[i]);
    }


    int num2[] = {2, 4,5 ,6,74};

    for(int i=0; i < num2.length; i++){
      System.out.println( num2[i]);
    }

    // to create array for 2D

    int star [][] = new int[3][4];
    int random = 0;

    for(int i=0; i <3; i++){
      for(int j=0; j< 4; j++){
        star[i][j] = (int) (Math.random() * 10);
        System.out.print(star[i][j]+ " ");
      }
      System.out.println();
    }

    System.out.println("hello start");
    for(int n[] : star){
      for(int c: n){
        System.out.print(c + " ");
      }
      System.out.println();
    }



  ///////////////////////////////
  //////////////jagged-array//////
  ////////////////////////////////

    int nums[][] = new int[5][];
    int count = 0;

    // we should create array, first the muntion number of the size   
    for (int i = 0; i < nums.length; i++){
      nums[i] = new int[i + 1];
    }

    for(int i = 0; i < nums.length; i++){
      for(int b = 0; b < nums[i].length; b++){
       ++count;
        nums[i][b] = count;
        System.out.print(nums[i][b]+ " ");
      }
      System.out.println();
    }

  }
}