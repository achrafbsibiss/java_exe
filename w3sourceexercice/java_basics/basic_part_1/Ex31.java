package w3sourceexercice.java_basics.basic_part_1;

public class Ex31 {

  public static void main(String[] Args){

    String javaVersion = System.getProperty("java.version");

    System.out.println("openjdk version: " + System.getProperty("java.version") + " Date version: "+ System.getProperty("java.version.date"));
    System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
    System.out.println("Java Home: " + System.getProperty("java.home"));
    System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    System.out.println("Java Vendor url: " + System.getProperty("java.vendor.url"));
    System.out.println("Java class path: " + System.getProperty("java.class.path"));
  }
  
}
