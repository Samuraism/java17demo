package com.samuraism.java17demo;

/**
 * @see <a href="https://openjdk.java.net/jeps/378">JEP 378: Text Blocks</a>
 * @since Java 15
 */
public class JEP378TextBlocks {
    public static void main(String[] args) {
        String name = "Yusuke Yamamoto";
        String postalCode = "171-0022";
        String myJson = """
                {
                    "name": "%s",
                    "postal-code": "%S",
                    "address": "Minami-Ikebukuro 2-33-6"
                }""".formatted(name, postalCode);
        System.out.println(myJson);
    }
}
