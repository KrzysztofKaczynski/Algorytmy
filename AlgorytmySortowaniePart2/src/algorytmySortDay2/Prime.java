package algorytmySortDay2;

import java.util.stream.IntStream;


public class Prime {
    public static void main(String[] args) {
        int number =11;
        System.out.println(isPrime(number));
        boolean isPrime = IntStream.range(2, (int)Math.sqrt(number))
                .noneMatch(i -> number % i ==0);

    }
    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}
