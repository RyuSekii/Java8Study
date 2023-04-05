package main.java.demo3.lambda7;

/**
 * 静态方法引用
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 匿名内部方法
         */
        ParseInterface pi1 = new ParseInterface() {
            @Override
            public int parse(String s) {
                return Integer.parseInt(s);
            }
        };

        /**
         * lambda表达式：常规写法
         */
        ParseInterface pi2 = s -> Integer.parseInt(s);

        /**
         * lambda表达式：简写
         * 静态方法引用
         */
        ParseInterface pi3 = Integer::parseInt;

        int i = pi1.parse("123");
    }
}
