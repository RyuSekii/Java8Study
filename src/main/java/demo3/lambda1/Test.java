package main.java.demo3.lambda1;

public class Test {
    public static void main(String[] args) {
        MyInterface mi1 = new MyInterfaceImpl();
        System.out.println(mi1.sum(123,456));
    }
}
