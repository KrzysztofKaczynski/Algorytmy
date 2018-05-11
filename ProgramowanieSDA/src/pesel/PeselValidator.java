package pesel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeselValidator {
    private String pesel;
    private boolean valid = false;
    private List<Integer> peselList;
    private int intNumbers[] = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};

    public PeselValidator(String pesel) {
        if(pesel.length() == 11) {
            this.pesel = pesel;
            this.peselList =  Arrays.stream(pesel.split("\\B"))
                    .map(s->Integer.valueOf(s))
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
        this.valid = valid;
    }

    public void checkSum(int sumaKontrolna) {
        int suma = 0;
        for(int i = 0; i < this.intNumbers.length; i++) {
            suma += this.intNumbers[i] * this.peselList.get(i);
        }

        this.valid = suma % 10 == sumaKontrolna;
    }
}
