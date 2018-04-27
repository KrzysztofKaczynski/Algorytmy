package algorytmySortDay2;

import java.util.stream.IntStream;

public class Streaming {
    public static void main(String[] args) {

        int sum = IntStream.range(0, 10)
                .map(i -> i % 2 != 0 ? i * 2 - 1 : i)
                .map(i -> i % 2 == 0 ? i / 2 : i)
                .sum();
        System.out.println(sum);

        IntStream.iterate(0, i -> i + 2).limit(5)
                .map(i -> {
                    System.out.print(i + ", ");
                    return i % 2 != 0 ? i * 2 - 1 : i;
                })
                .map(i -> {
                    System.out.print(i + ", ");
                    return i % 2 == 0 ? i / 2 : i;
                }).forEach(System.out::print);


    }


}
