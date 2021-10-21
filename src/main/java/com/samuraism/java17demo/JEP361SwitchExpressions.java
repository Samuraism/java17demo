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
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return true;
            case SATURDAY:
            case SUNDAY:
                return false;
            default:
                return false;
        }
    }
}
