package part1;

import java.util.stream.IntStream;

/**
 * Created by wojciechpotocki on 25.04.2018.
 */
public class Prime {
    public static void main(String[] args) {
        int liczba = 1;
        boolean isPrime = true;

        if(liczba <= 1 || liczba % 2 == 0) {
            isPrime = false;
        } else {
            for(int i = 3; i * i <= liczba; i += 2) {
                if(liczba % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Czy liczba jest pierwsza: " + isPrime);

        boolean czyPierwsza = IntStream.rangeClosed(2, (int) Math.sqrt(liczba))
                                .noneMatch(i -> liczba % i == 0);

        System.out.println("Czy liczba jest pierwsza: " + czyPierwsza);
    }
}
