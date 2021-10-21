package com.samuraism.java17demo;

import java.util.Objects;

/**
 * @see <a href="https://openjdk.java.net/jeps/395">JEP 395: Records</a>
 * @since Java 16
 */
public class JEP395Record {
    public static void main(String[] args) {
        Person yusuke = new Person("yusuke", 18);
        System.out.printf("name:%s age:%s%n", yusuke.getName(), yusuke.getAge());
    }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
