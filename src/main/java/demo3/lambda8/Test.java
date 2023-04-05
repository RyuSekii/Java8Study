package main.java.demo3.lambda8;

import java.util.function.Function;

/**
 * 实例方法引用
 */
public class Test {
    /**
     * 需求：
     * 已知String中有一个实例方法（非静态的）endsWith
     * 想自己写一个类封装上面的这个方法
     *
     * 借助于java8提供的一个接口Function
     * @FunctionalInterface
     * public interface Function<T, R> {
     *     R apply(T t);
     * }
     *
     */
    public static void main(String[] args) {
        /**
         * 使用匿名内部类
         */
        String str1 = "PSD";
        Function<String,Boolean> func1 = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String suffix) {
                return str1.endsWith(suffix);
            }
        };

        /**
         * 使用lambda表达式常规写法
         */
        String str2 = "PSD";
        Function<String,Boolean> func2 = suffix -> str2.endsWith(suffix);

        /**
         * 使用lambda表达式简写
         * 实例方法引用（对象方法引用）
         */
        String str3 = "PSD";
        Function<String,Boolean> func3 = str1::endsWith;

        Boolean b = func3.apply("D");
        System.out.println(b);
    }
}
