package OOP.interfaces.metods_interface;

interface Interface1 {
    void method1();
    void method2();
}

class MyClass implements Interface1 {
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }
    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
    }
}
