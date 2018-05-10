package pesel;

public class Pesel {
    private static PeselValidator PeselVal;

    public static void main(String[] args) {
        String PESEL;


        System.out.println("Podaj numer PESEL");
        PESEL = Console.readString("?");
        PeselVal = new PeselValidator(PESEL);

        if (PeselVal.isValid()) {
            System.out.println("Numer PESEL jest prawidłowy");
            System.out.println("Rok urodzenia: " + PeselVal.getBirthYear());
            System.out.println("Miesiąc urodzenia: " + PeselVal.getBirthMonth());
            System.out.println("Dzień urodzenia: " + PeselVal.getBirthDay());
            System.out.println("Płeć: " + PeselVal.getSex());
        }
        else {
            System.out.println("Numer PESEL jest nieprawidłowy");
        }
    }

}
