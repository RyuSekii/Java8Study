package main.java.demo3.lambda3;

/**
 * lambda表达式：接收一个参数且没有返回值
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 匿名内部类
         */
        MyInterface mi1 = new MyInterface() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        /**
         * lambda常规写法
         */
        MyInterface mi2 = (String s) -> {
            System.out.println(s);
        };

        /**
         * lambda简写
         */
        MyInterface mi3 = s -> System.out.println(s);

        mi1.print("hello lambda...");
    }
}
