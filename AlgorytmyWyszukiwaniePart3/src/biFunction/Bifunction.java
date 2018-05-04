package biFunction;

import java.util.function.BiFunction;

public class Bifunction {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> addition = (a, b) -> Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println(addition.apply("11","5"));
    }
}
