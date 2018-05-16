package wydawanieReszty;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        HashMap<Integer, Integer> nominalyWydane = new HashMap<>();
        int ileMonet = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj resztę: ");
        int resztaDoWydania = scanner.nextInt();


        for (int i = 0; ((i < nominaly.length) && (resztaDoWydania > 0)); i++) {
            if (resztaDoWydania >= nominaly[i]) {
                int temp = resztaDoWydania / nominaly[i];
                nominalyWydane.put(nominaly[i], temp);
                resztaDoWydania = resztaDoWydania - temp * nominaly[i];
               ileMonet += temp;
            }
        }
        System.out.println(nominalyWydane);
    }

    }
