package peselInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pesel {
    private String NumerPesel;
    private String Miesiac;

    // -----------------------------------------------------------
    public Pesel(String Ciag) {
        NumerPesel = Ciag;
    }

    // -----------------------------------------------------------
    public String RokUrodzenia() {
        String Rok1 = "";
        String Rok2 = NumerPesel.substring(0, 2);
        Miesiac = NumerPesel.substring(2, 4);
        int Mint = 0;
        String MiesiacArr[] = {"Styczen", "Luty", "Marzec", "Kwiecien", "Maj",
                "Czerwiec", "Lipiec", "Sierpien", "Wrzesien", "Pazdziernik",
                "Listopad", "Grudzien"};

        if (Miesiac.equals("81")) {
            Rok1 = "18";
            Mint = 0;
        } else if (Miesiac.equals("82")) {
            Rok1 = "18";
            Mint = 1;
        } else if (Miesiac.equals("83")) {
            Rok1 = "18";
            Mint = 2;
        } else if (Miesiac.equals("84")) {
            Rok1 = "18";
            Mint = 3;
        } else if (Miesiac.equals("85")) {
            Rok1 = "18";
            Mint = 4;
        } else if (Miesiac.equals("86")) {
            Rok1 = "18";
            Mint = 5;
        } else if (Miesiac.equals("87")) {
            Rok1 = "18";
            Mint = 6;
        } else if (Miesiac.equals("88")) {
            Rok1 = "18";
            Mint = 7;
        } else if (Miesiac.equals("89")) {
            Rok1 = "18";
            Mint = 8;
        } else if (Miesiac.equals("90")) {
            Rok1 = "18";
            Mint = 9;
        } else if (Miesiac.equals("91")) {
            Rok1 = "18";
            Mint = 10;
        } else if (Miesiac.equals("92")) {
            Rok1 = "18";
            Mint = 11;
        } else if (Miesiac.equals("01")) {
            Rok1 = "19";
            Mint = 0;
        } else if (Miesiac.equals("02")) {
            Rok1 = "19";
            Mint = 1;
        } else if (Miesiac.equals("03")) {
            Rok1 = "19";
            Mint = 2;
        } else if (Miesiac.equals("04")) {
            Rok1 = "19";
            Mint = 3;
        } else if (Miesiac.equals("05")) {
            Rok1 = "19";
            Mint = 4;
        } else if (Miesiac.equals("06")) {
            Rok1 = "19";
            Mint = 5;
        } else if (Miesiac.equals("07")) {
            Rok1 = "19";
            Mint = 6;
        } else if (Miesiac.equals("08")) {
            Rok1 = "19";
            Mint = 7;
        } else if (Miesiac.equals("09")) {
            Rok1 = "19";
            Mint = 8;
        } else if (Miesiac.equals("10")) {
            Rok1 = "19";
            Mint = 9;
        } else if (Miesiac.equals("11")) {
            Rok1 = "19";
            Mint = 10;
        } else if (Miesiac.equals("11")) {
            Rok1 = "19";
            Mint = 11;
        } else if (Miesiac.equals("21")) {
            Rok1 = "20";
            Mint = 0;
        } else if (Miesiac.equals("22")) {
            Rok1 = "20";
            Mint = 1;
        } else if (Miesiac.equals("23")) {
            Rok1 = "20";
            Mint = 2;
        } else if (Miesiac.equals("24")) {
            Rok1 = "20";
            Mint = 3;
        } else if (Miesiac.equals("25")) {
            Rok1 = "20";
            Mint = 4;
        } else if (Miesiac.equals("26")) {
            Rok1 = "20";
            Mint = 5;
        } else if (Miesiac.equals("27")) {
            Rok1 = "20";
            Mint = 6;
        } else if (Miesiac.equals("28")) {
            Rok1 = "20";
            Mint = 7;
        } else if (Miesiac.equals("29")) {
            Rok1 = "20";
            Mint = 8;
        } else if (Miesiac.equals("30")) {
            Rok1 = "20";
            Mint = 9;
        } else if (Miesiac.equals("31")) {
            Rok1 = "20";
            Mint = 10;
        } else if (Miesiac.equals("32")) {
            Rok1 = "20";
            Mint = 11;
        } else if (Miesiac.equals("41")) {
            Rok1 = "21";
            Mint = 0;
        } else if (Miesiac.equals("42")) {
            Rok1 = "21";
            Mint = 1;
        } else if (Miesiac.equals("43")) {
            Rok1 = "21";
            Mint = 2;
        } else if (Miesiac.equals("44")) {
            Rok1 = "21";
            Mint = 3;
        } else if (Miesiac.equals("45")) {
            Rok1 = "21";
            Mint = 4;
        } else if (Miesiac.equals("46")) {
            Rok1 = "21";
            Mint = 5;
        } else if (Miesiac.equals("47")) {
            Rok1 = "21";
            Mint = 6;
        } else if (Miesiac.equals("48")) {
            Rok1 = "21";
            Mint = 7;
        } else if (Miesiac.equals("49")) {
            Rok1 = "21";
            Mint = 8;
        } else if (Miesiac.equals("50")) {
            Rok1 = "21";
            Mint = 9;
        } else if (Miesiac.equals("51")) {
            Rok1 = "21";
            Mint = 10;
        } else if (Miesiac.equals("52")) {
            Rok1 = "21";
            Mint = 11;
        } else if (Miesiac.equals("61")) {
            Rok1 = "22";
            Mint = 0;
        } else if (Miesiac.equals("62")) {
            Rok1 = "22";
            Mint = 1;
        } else if (Miesiac.equals("63")) {
            Rok1 = "22";
            Mint = 2;
        } else if (Miesiac.equals("64")) {
            Rok1 = "22";
            Mint = 3;
        } else if (Miesiac.equals("65")) {
            Rok1 = "22";
            Mint = 4;
        } else if (Miesiac.equals("66")) {
            Rok1 = "22";
            Mint = 5;
        } else if (Miesiac.equals("67")) {
            Rok1 = "22";
            Mint = 6;
        } else if (Miesiac.equals("68")) {
            Rok1 = "22";
            Mint = 7;
        } else if (Miesiac.equals("69")) {
            Rok1 = "22";
            Mint = 8;
        } else if (Miesiac.equals("70")) {
            Rok1 = "22";
            Mint = 9;
        } else if (Miesiac.equals("71")) {
            Rok1 = "22";
            Mint = 10;
        } else if (Miesiac.equals("72")) {
            Rok1 = "22";
            Mint = 11;
        }

        Miesiac = MiesiacArr[Mint];
        return Rok1 + Rok2;
    }

    // -----------------------------------------------------------
    public String MiesiacUrodzenia() {
        return Miesiac;
    }

    // -----------------------------------------------------------
    public String DzienUrodzenia() {
        return NumerPesel.substring(4, 6);
    }

    // -----------------------------------------------------------
    public String Plec() {
        Integer Cyfra = Integer.parseInt(NumerPesel.substring(10, 11));
        String Plec = "";
        if ((Cyfra % 2) == 0) {
            Plec = "Mezczyzna";
        } else {
            Plec = "Kobieta";
        }
        return Plec;
    }

    // -----------------------------------------------------------
    public String NumerSeryjny() {
        return NumerPesel.substring(6, 10);
    }
    // -----------------------------------------------------------

}

// //////////////////////////////////////////////////////////////

class Uruchom {
    // -----------------------------------------------------------
    public static void main(String[] args) throws IOException {
        Pesel psl;

        print("Wpisz pesel, poprawna ilosc cyfr to 11");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(
                System.in), 1);
        String str = stdin.readLine();
        int dlugosc = str.length();
        if (dlugosc != 11) {
            print("Niepoprawna ilosc znakow=" + dlugosc
                    + ", Poprawna ilosc znakow=11");
        } else {
            psl = new Pesel(str);
            print("Rok urodzenia: " + psl.RokUrodzenia());
            print("Miesiac : " + psl.MiesiacUrodzenia());
            print("Dzien : " + psl.DzienUrodzenia());
            print("Plec : " + psl.Plec());
            print("Numer seryjny osobnika : " + psl.NumerSeryjny());
        }
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
