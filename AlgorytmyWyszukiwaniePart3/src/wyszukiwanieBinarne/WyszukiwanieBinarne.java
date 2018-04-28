package wyszukiwanieBinarne;

public class WyszukiwanieBinarne
{
    public static int wyszukiwanieBinarne(int szukanaLiczba) {

        int[] tablicaLiczb = {1, 1, 2, 3, 4, 5, 6, 6, 6, 7, 8};

        int lewo = 0, prawo = tablicaLiczb.length - 1, srodek = 0;

        while (lewo <= prawo) {
            srodek = (lewo + prawo) / 2;
            if (tablicaLiczb[srodek] == szukanaLiczba) {
                return srodek;
            } else if (tablicaLiczb[srodek] < szukanaLiczba) {
                lewo = srodek + 1;
            } else {
                prawo = srodek - 1;
            }
        }

        return -1;
        // wyszukiwanie false
    }

    public static void main(String[] args) {
        System.out.println(wyszukiwanieBinarne(7));
    }
}

