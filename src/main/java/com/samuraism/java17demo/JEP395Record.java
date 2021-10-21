package com.samuraism.java17demo;

import java.util.Objects;

/**
 * @see <a href="https://openjdk.java.net/jeps/395">JEP 395: Records</a>
 * @since Java 16
 */
public class JEP395Record {
    public static void main(String[] args) {
        Person yusuke = new Person("yusuke", 18);
        System.out.printf("name:%s age:%s%n", yusuke.name(), yusuke.name());
    }
}

record Person(String name, int age) {
}
