package com.samuraism.java17demo;

/**
 * @see <a href="https://openjdk.java.net/jeps/378">JEP 378: Text Blocks</a>
 * @since Java 15
 */
public class JEP378TextBlocks {
    public static void main(String[] args) {
        String myJson = "{\n" +
                        "    \"name\": \"Yusuke Yamamoto\",\n" +
                        "    \"postal-code\": \"171-0022\",\n" +
                        "    \"address\": \"Minami-Ikebukuro 2-33-6\",\n" +
                        "}";
        System.out.println(myJson);
    }
}
