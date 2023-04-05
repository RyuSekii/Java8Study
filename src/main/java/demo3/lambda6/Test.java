package main.java.demo3.lambda6;

/**
 * 构造方法引用
 */
public class Test {
    /**
     *需求：
     *有一个Person类
     * 有一个获得Person对象的接口的工厂
     * 想通过工厂获得一个Person对象
     * 需要现有一个实际的工厂对象
     */
    public static void main(String[] args) {
        /**
         * 使用匿名内部类的方式
         */
        PersonFactory factory1 = new PersonFactory() {
            @Override
            public Person createPerson(String firstName, String lastName) {
                return new Person(firstName, lastName);
            }
        };

        /**
         * 使用lambda表达式：常规写法
         */
        PersonFactory factory2 = (firstName,lastName) -> new Person(firstName,lastName);

        /**
         * 使用lambda表达式：简写
         * 构造方法引用
         */
        PersonFactory factory3 = Person::new;

        Person person1 = factory1.createPerson("张","三");
        Person person2 = factory2.createPerson("李","四");
        Person person3 = factory3.createPerson("王","五");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
