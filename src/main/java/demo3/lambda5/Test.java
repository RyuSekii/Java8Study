package main.java.demo3.lambda5;

import main.java.demo3.lambda4.MyInterface;

/**
 *作用域-final
 */
public class Test {
    public static void main(String[] args) {
        // 局部变量，被匿名内部类或lambda表达式调用之后，默认为final型
        int age = 9;
        /**
         * 匿名内部类
         */
        MyInterface mi1 = new MyInterface() {

            @Override
            public void test() {
                System.out.println(age);
            }
        };
        /**
         * lambda简写
         */
        MyInterface mi2 = () -> System.out.println(age);
    }
}
