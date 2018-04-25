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
        for (int i = 4; i >= 0; i = i -= 2){
            System.out.println(i + " ");
        }

        // wypisać 100, 10, 200, 20... 900, 90
        for (int i = 1; i < 10; i++) {
            System.out.println(100 * i + ", " + 10 * i);
        }

        // wypisać "Ciąg Fibonacciego" 1, 1, 2, 3, 5, 8, 13, 21, 34...
        for (int i = 1, j = 1, tmp = 0; i < 20; tmp = j, j = j + i, i = tmp){
            System.out.println(i + " ");
        }
        System.out.println("----------------------------");
    }

}
