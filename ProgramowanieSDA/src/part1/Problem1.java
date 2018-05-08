package part1;

/**
 * Created by wojciechpotocki on 24.04.2018.
 */
public class Problem1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 61; i += 2) {
            System.out.println(i + " ");
        }

        System.out.println("-------------------------");

        for (int i = 0; i <= 6; i += 2) {
            System.out.println(i + " ");
        }

        for (int i = 4; i >= 0; i -= 2) {
            System.out.println(i + " ");
        }

        System.out.println("-------------------------");

        for(int i = 1; i < 10; i++) {
            System.out.println(100 * i + ", " + 10 * i);
        }

        System.out.println("-------------------------");

        for(int i = 1, j = 1, tmp = 0; i < 100; tmp = j, j = j + i, i = tmp) {
            System.out.println(i + " ");
        }
    }
}
