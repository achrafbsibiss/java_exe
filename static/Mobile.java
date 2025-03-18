//  the static variable is belong to the class not the oblecjt
// for example we have brand name is "Apple" so all the other object he will have the apple  brand name 
// because the brand is static variable


class Phone{
  int price;
  String name;
  static{
    System.out.println("create static");
    String brand = "iphone";
  }


//   public void show(){
//     System.out.println("name: "+ name+ " price: " + price + " brand: " + brand);
//   }
//
 }


class Mobile{
  public static void main(String[] args){

    Phone obj1 = new Phone();
    Phone obj2 = new Phone();

    // obj1.name = "X";
    // Phone.brand = "Iphone";
    // obj1.price = 123;



    // obj2.name = "XR";
    // obj2.price = 423;

    // obj1.show();
    // obj2.show();

  }
}