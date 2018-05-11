package pesel;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pesel: ");
        PeselValidator pesel = new PeselValidator(scanner.nextLine());

        System.out.println("Czy pesel poprawny: " + pesel.isValid());

    }
}
