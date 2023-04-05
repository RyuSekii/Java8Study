package main.java.demo1;

public interface SubInterface extends MyInterface {
    /**
     * 重写了默认的接口方法
     */
    @Override
    default void testDefault() {
        System.out.println("hello subTestDefault...");
    }
}
