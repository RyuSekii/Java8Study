package main.java.demo3.lambda2;

/**
 * lambda表达式：接受两个参数且有返回值
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 匿名内部类
         */
        MyInterface mi1 = new MyInterface() {
            @Override
            public int sum(int num1, int num2) {
                return num1+num2;
            }
        };
        /**
         * lambda常规写法
         */
        MyInterface mi2 = (int num1, int num2) -> {
            return num1 + num2;
        };

        /**
         * lambda简写
         * 1.形参列表中的数据类型可以不写，会自动推断
         * 2.如果方法体中的代码只有一句，可以省略{}，如果时return返回数据的，可以省略掉return
         */
        MyInterface mi3 = (num1, num2) -> num1 + num2;
        System.out.println(mi1.sum(123,456));
    }
}
