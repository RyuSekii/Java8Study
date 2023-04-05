package main.java.demo1;

public class SubInterfaceImpl implements SubInterface {
    @Override
    public void test() {
        System.out.println("hello subTest...");
    }

    @Override
    public void testDefault() {
        System.out.println("hello subTestDefault...");
    }
}
