package algorytmySortDay3;

public class Silnia {
    public static int silniaRekurencja(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silniaRekurencja(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(silniaRekurencja(5));

    }
}