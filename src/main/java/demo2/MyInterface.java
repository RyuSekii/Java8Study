package main.java.demo2;

@FunctionalInterface
public interface MyInterface {
    void test();
    static void test1(){}
    default void test2(){}
}
