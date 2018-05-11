package peselSDA;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pesel: ");
        PeselValidator pesel = new PeselValidator(scanner.nextLine());

        System.out.println("Czy pesel poprawny: " + pesel.isValid());
        System.out.println("Rok urodzenia: " + PeselValidator.getRokUrodzenia());
        System.out.println("Miesiąc urodzenia: " + PeselValidator.getMiesiacUrodzenia());
        System.out.println("Dzień urodzenia: " + PeselValidator.getDzienUrodzenia());
        System.out.println("Płeć: " + PeselValidator.getPlec());
    }
}
