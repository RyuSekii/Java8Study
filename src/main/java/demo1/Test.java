package main.java.demo1;

public class Test {
    public static void main(String[] args) {
        MyInterface.testStatic();
        MyInterface mi1 = new MyInterfaceImpl();
        mi1.test();
        mi1.testDefault();
        new SubInterfaceImpl().testDefault();
    }
}
