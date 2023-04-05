package main.java.demo3.lambda4;

/**
 * lambda表达式：无参数无返回
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 匿名内部类
         */
        MyInterface mi1 = new MyInterface() {

            @Override
            public void test() {
                System.out.println(666);
            }
        };

        /**
         * lambda常规写法
         */
        MyInterface mi2 = () -> {
            System.out.println(777);
        };

        /**
         * lambda简写
         */
        MyInterface mi3 = () -> System.out.println(888);

        /**
         * 什么也不写
         */
        MyInterface mi4 = () -> {};

        mi1.test();
    }
}
