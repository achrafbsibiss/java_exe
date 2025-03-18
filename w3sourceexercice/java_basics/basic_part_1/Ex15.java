class Ex15{

  public static void main(String[] args){
    int a,b,c;
    // Write a Java program to swap two variables.
    a = 5;
    System.out.println("a: "+a);
    b = 4;
    System.out.println("b: "+b);
    c = a;
    a = b;
    System.out.println("a: "+a);
    b = c;
    System.out.println("b: "+b);

    int nums[] = {1,2,3,4};

    for(int i : nums){
      System.out.println(i);
    }
  }
}