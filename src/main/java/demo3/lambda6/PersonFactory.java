package main.java.demo3.lambda6;

/**
 * 获得Person对象的工厂接口，也是一个函数式接口
 *
 */
public interface PersonFactory {
    /**
     * 获得Person对象的方法
     */
    Person createPerson(String firstName, String lastName);
}
