package OOP.interfaces.metods_interface;

@FunctionalInterface
interface Interface1 {
  int add(int i, int j);
}

public class Demo1 {
  public static void main(String[] args) {

    Interface1 interface1 = (i,j) -> i+j;

    int result = interface1.add(10, 20);

    System.out.println("Result: " + result);
  }
}
