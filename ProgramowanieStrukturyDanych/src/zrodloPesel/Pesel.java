package zrodloPesel;
/**
 * Program sprawdza poprawnosc wpisanego numeru Pesel
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pesel {
    private String NumerPesel;
    private int PomnozonyPesel;
    private int[] waga = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };

    // -----------------------------------------------------------
    private void Mnozenie() {
        for (int i = 0; i < waga.length; i++) {
            PomnozonyPesel += (waga[i] * Integer.parseInt(NumerPesel.substring(i, i + 1))) % 10;
        }
    }

    // -----------------------------------------------------------
    public Pesel(String CiagCyfr) {
        NumerPesel = CiagCyfr;
    }

    // -----------------------------------------------------------
    public void Wyswietl() {
        System.out.print("PESEL: " + NumerPesel);
    }

    // -----------------------------------------------------------
    public void SprawdzPoprawnosc() {
        Mnozenie();
        int LiczbaKontrolnaOrg = Integer.parseInt(NumerPesel.substring(10, 11));
        int LiczbaKontrolnaNew, Peselek;
        Peselek = PomnozonyPesel % 10;
        if (Peselek == 0) {
            LiczbaKontrolnaNew = 0;
        } else {
            LiczbaKontrolnaNew = 10 - Peselek;
        }
        if (LiczbaKontrolnaOrg == LiczbaKontrolnaNew) {
            System.out.println("Ten numer pesel jest poprawny: " + NumerPesel);
        } else {
            System.out.println("Ten numer nie jest poprawny: " + NumerPesel);
        }
    }
}

// //////////////////////////////////////////////////////////////

class Uruchom {
    // -----------------------------------------------------------
    public static void main(String[] args) throws IOException {
        Pesel psl;

        System.out.println("Wpisz pesel, poprawna ilosc to 11 cyfr");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(
                System.in), 1);
        String str = stdin.readLine();
        int dlugosc = str.length();
        if (dlugosc != 11) {
            System.out.println("Niepoprawna ilosc znakow=" + dlugosc
                    + ", Poprawna ilosc znakow=11");
        } else {
            psl = new Pesel(str);
            psl.SprawdzPoprawnosc();
        }
    }
}
