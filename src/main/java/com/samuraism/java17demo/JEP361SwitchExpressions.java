package com.samuraism.java17demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @see <a href="https://openjdk.java.net/jeps/361">JEP 361: Switch Expressions</a>
 * @since Java 14
 */
public class JEP361SwitchExpressions {
    public static void main(String[] args) {
        System.out.println(isBusinessDay(LocalDate.now().getDayOfWeek()));
    }

    public static boolean isBusinessDay(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
            case SATURDAY, SUNDAY -> false;
        };
    }
}
