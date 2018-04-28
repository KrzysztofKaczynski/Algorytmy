package wyszukiwanieBinarne;
/**
 * @author Tomasz
 */
import java.util.Arrays;
/**
 * Zmiana komentarzy na blokowe ;)
 * @author KRIS
 */
public class WyszukiwanieBinarne2 {

    private int dlugAbstrTablicy(int poczatekAbstracyjnejTablicy, int koniecAbstrakcyjnejTablcy) {
        return koniecAbstrakcyjnejTablcy - poczatekAbstracyjnejTablicy;
    }

    public int search(int[] array, int number) {
/**
 * Tworzymy "abstrakcyjny" początek i koniec tablicy, będą to zwykłe int'y reprezetujące dany indeks tablicy
 * Na początku będą to po prostu indeks zerowy i indeks ostatni:
 */
        int poczAbstrTablicy = 0;
        int koniecAbstrTablicy = array.length;
/**
 * Sortujemy tablicę, bo nie wiadomo w jakim stanie została ona przekazana do funkcji:
 */
        Arrays.sort(array);
/**
 * Pętla while będzie musiała wykonywac się tak długo aż nie będzie się dało podzielić tablicy na mniejsze:
 */
        while (dlugAbstrTablicy(poczAbstrTablicy, koniecAbstrTablicy) >= 1) {
/**
 *  Pierwsza instrukcja warunkowa zostanie uruchomiona jeśli tablica ma parzystą liczbę elementów:
 */
            if ((koniecAbstrTablicy - poczAbstrTablicy) % 2 == 0) {
/**
 * Skoro tablica jest podzielna na pół to w pierwszej instrukcji warunkowej najpierw warto sprawdzić indeksy
 * w połowie, czyli np. dla tablicy 10-elementowej indeks 4 i 5, dla tablicy 20-elementowej indeks 9 i 10
 * (przypominam że w tablicy indeksy zaczynają się od 0!):
 */
                if ((array[(koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy - 1] == number)
                        || (array[(koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy] == number)) {
                    return 1;
/**
 * Powyższe wzory na uchwycenie indeksu środkowego tablicy wynikają ze wzoru matematycznego na środek
 * odcinka, którego osią jest tablica (śr.odcinka = (Xa + Xb)/2 + Xa), odjęcie 1 na końcu jest spowodowane
 * zaczynaniem się tablicy od indeksu 0.
 */
                } else if (array[(koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy - 1] > number) {
/**
 *  Po sprawdzeniu że dwa indeksy będące w środku tablicy są różne od "number" nalezy utworzyć kolejną abstrakcyjną
 *  tablicę będącą połówką poprzedniej pomniejszoną o ten skrajny element który już został sprawdzony wyżej, więc
 *  nie ma sensu pakować go znowu do kolejnej tablicy. Jeśli "number" jest mniejsze od liczby leżącej na lewo od
 *  "środka" to znaczy, że "number" może być gdzieś z lewej, więc początek abstrakcyjnej tablicy zostaje na miejscu
 *  a koniec zostaje przesunięty w lewo na miejsce o jedno wcześniej od środka:
 */
                    koniecAbstrTablicy = (koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy - 2;

                } else {
/**
 * W  przeciwnym wypadku przesuwamy abstrakcyjną tablicę analogicznie jak wyżej, ale tym razem przesuwamy początek:
 */
                    poczAbstrTablicy = (koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy - 1;
                }
/**
 * Druga instrukcja warunkowa zostanie uruchomiona jeśli tablica ma nieparzystą liczbę elementów:
 */
            } else {
/**
 *  Sposób działania jest analogiczny do tego powyżek, z tą różnicą że na "środku" leży tylko jeden element a nie
 *  dwa jak poprzednio. Przypominam tylko że nieparzysty integer podzielony na pół zwraca liczbę rzeczywistą
 *  o 0,5 mniejszą od właściwego wyniku, czyli np 5/2 = 2, 7/2 = 3.
 */
                if (array[(koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy] == number) {
                    return 1;
                } else if
                        (array[(koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy] > number) {
                    koniecAbstrTablicy = (koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy;
                } else {
                    poczAbstrTablicy = (koniecAbstrTablicy - poczAbstrTablicy) / 2 + poczAbstrTablicy + 2;
                }
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 6, 4, 7, 9, 8, 10, 11, 13, 12, 15, 14, 17, 16, 19, 18, 20 };
        WyszukiwanieBinarne2 search = new WyszukiwanieBinarne2();
        System.out.println(search.search(array, 2));
        System.out.println(search.dlugAbstrTablicy(1, 5));
        System.out.println(array.length);

    }
    }
