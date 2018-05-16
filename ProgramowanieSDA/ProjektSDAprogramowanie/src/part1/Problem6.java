package part1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by wojciechpotocki on 25.04.2018.
 */
public class Problem6 {
    public static void main(String[] args) {
//        int array[] = new int[10];
//
//        for(int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }

        int sum = IntStream.iterate(0, i -> i + 2).limit(5)
                .map(i -> {
                    System.out.println(i);
                    return i % 2 != 0 ? i * 2 - 1 : i;
                })
                //.map(i -> i % 2 != 0 ? i * 2 - 1 : i)
                .map(i -> i % 2 == 0 ? i / 2 : i)
                .sum();
    }
}
