package peselSDA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeselValidator {
    private static int[] PESEL = new int[11];
    private String pesel;
    private static boolean valid = false;
    private List<Integer> peselList;
    private int intNumbers[] = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};

    public PeselValidator(String pesel) {
        if (pesel.length() == 11) {
            this.pesel = pesel;
            this.peselList = Arrays.stream(pesel.split("\\B"))
                    .map(s -> Integer.valueOf(s))
                    .collect(Collectors.toList());

            checkSum(this.peselList.get(10));
        }
    }

    public boolean isValid() {
        return valid;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setValid(boolean valid) {
        PeselValidator.valid = valid;
    }

    public void checkSum(int sumaKontrolna) {
        int suma = 0;
        for (int i = 0; i < this.intNumbers.length; i++) {
            suma += this.intNumbers[i] * this.peselList.get(i);
        }

        valid = suma % 10 == sumaKontrolna;
    }

    public static int getRokUrodzenia() {
        int rok;
        int miesiac;
        rok = 10 * PESEL[0];
        rok += PESEL[1];
        miesiac = 10 * PESEL[2];
        miesiac += PESEL[3];
        if (miesiac > 80 && miesiac < 93) {
            rok += 1800;
        } else if (miesiac > 0 && miesiac < 13) {
            rok += 1900;
        } else if (miesiac > 20 && miesiac < 33) {
            rok += 2000;
        }
        return rok;
    }

    public static int getMiesiacUrodzenia() {
        int miesiac;
        miesiac = 10 * PESEL[2];
        miesiac += PESEL[3];
        if (miesiac > 80 && miesiac < 93) {
            miesiac -= 80;
        } else if (miesiac > 20 && miesiac < 33) {
            miesiac -= 20;
        } else if (miesiac > 40 && miesiac < 53) {
            miesiac -= 40;
        } else if (miesiac > 60 && miesiac < 73) {
            miesiac -= 60;
        }
        return miesiac;
    }


    public static int getDzienUrodzenia() {
        int dzien;
        dzien = 10 * PESEL[4];
        dzien += PESEL[5];
        return dzien;
    }

    public static String getPlec() {
        if (valid) {
            if (PESEL[9] % 2 == 1) {
                return "Mezczyzna";
            } else {
                return "Kobieta";
            }
        } else {

        }
        return null;
    }
}
