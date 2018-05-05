package algorytmKMP;

/**
 * Algorytm Knutha-Morrisa-Pratta - wyszukiwanie wzorca
 */

public class AlgorytmKMP {
    public static void main(String[] args) {
        String wzorzec;
        String tekst;
        int m, n, i, j, t;
        int P[] = new int[100];
        //maksymalna dlugosc wzorca to 100 symboli

        System.out.println("Podaj tekst");
        tekst = Console.readString("?");
        System.out.println("Podaj wzorzec");
        wzorzec = Console.readString("?");
        n = tekst.length();
        m = wzorzec.length();
        System.out.println("Indeksy poczatku wzorca w tekscie");

//		obliczenie tablicy P
        P[0] = 0;
        P[1] = 0;
        t = 0;
        for (j = 2; j <= m; j++) {
            while ((t > 0) && (wzorzec.charAt(t) != wzorzec.charAt(j - 1))) {
                t = P[t];
            }
            if (wzorzec.charAt(t) == wzorzec.charAt(j - 1)) {
                t++;
            }
            P[j] = t;
        }

//		algorytm KMP
        i = 1;
        j = 0;
        while (i <= n - m + 1) {
            j = P[j];
            while ((j < m) && (wzorzec.charAt(j) == tekst.charAt(i + j - 1))) {
                j++;
            }
            if (j == m) {
                System.out.println(i);
            }
            i = i + Math.max(1, j - P[j]);
        }
        return;
    }
}

