package OOP.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Demo {
  public static void main(String[] args) {
    // List is ordered and allows duplicates values 
    List <Integer> list = new ArrayList<>();
     
    // is not ordered and does not allow duplicates values also hee don't have the index value
    Set<Integer> nums = new  HashSet<>(); 
      nums.add(1);
      nums.add(2);
      nums.add(2);
      nums.add(3);




      list.add(5);
      list.add(6);
      list.add(10);

      int num[] = {1,2,3};
      int num2[] = num.clone();

      for(int n : num2){
        System.err.println("the num: " + n);
      }


      for(int i = 0 ; i < list.size(); i++){
        System.out.println("the num: " + list.get(i));
      }
  }
}
