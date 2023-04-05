package main.java.demo1;

public interface MyInterface {
    /**
     * java8以前定义的接口方法，
     * 需要实现类去进行实现，
     * 可以隐藏public abstract
     */
    void test();

    /**
     * java8以后可以定义静态接口方法，
     * 不需要实例化就可以进行调用，
     * 不可以被重写
     */
    static void testStatic(){
        System.out.println("hello testStatic...");
    }

    /**
     * java8以后可以定义默认接口方法，
     * 需要实例化进行调用，可以被重写
     */
    default void testDefault(){
        System.out.println("hello testDefault...");
    }
}
