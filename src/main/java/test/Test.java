package main.java.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId("001");
        person1.setName("CCC");
        person1.setAge(10);

        Person person2 = new Person();
        person2.setId("003");
        person2.setName("BBB");
        person2.setAge(11);

        Person person3 = new Person();
        person3.setId("002");
        person3.setName("AAA");
        person3.setAge(12);

        List<Person> personList = new ArrayList<Person>();
        personList.add(0,person1);
        personList.add(1,person2);
        personList.add(2,person3);

        System.out.println(personList.stream().sorted(Comparator.comparing(Person::getId)).limit(1).collect(Collectors.toList()));
    }
}
