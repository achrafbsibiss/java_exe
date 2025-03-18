public class test {
  
  public static void main(String[] args) {
    
    int num = 5;
    StringBuffer name = new StringBuffer("Achraf");

    // int result = num++;  //he will fetch the value and after he will Increments 
    int result = ++num; // he will Increment  his self after he will show the value
    System.out.println(result+ " name: " + name.capacity());
    name.append(" Bsibiss sdgvsdfsdfsdgrdfgrgsdagfgasfvasfcasdfadsf");
    System.out.println(result+ " name: " + name.capacity());
  }
}
