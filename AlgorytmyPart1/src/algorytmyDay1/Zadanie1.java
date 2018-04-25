package algorytmyDay1;

/**
 * "CWICZENIA Z LICZBAMI"
 */

public class Zadanie1

/**
 *  wypisać   1, 3, 5, 7, 9, 11... 61
 */
{
    public static void main(String[] args) {
        for (int i = 0; i < 61; i = i += 2) {
            System.out.println(i + " ");
        }
        System.out.println("----------------------------");

/**
 *  wypisać   0, 2, 4, 6, 4, 2, 0
 */

        for (int i = 0; i <= 6 ; i+= 2) {
            System.out.println(i + " ");
        }
        System.out.println("----------------------------");
    }

}
