package part2;

/**
 * Created by wojciechpotocki on 26.04.2018.
 */
public class HeapSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        int dlugoscTablicy = array.length;

        for (int i = dlugoscTablicy / 2 - 1; i >= 0; i--) {
            budujKopiec(array, dlugoscTablicy, i);
        }

        for (int i = dlugoscTablicy - 1; i >= 0; i--) {
            // przenosimy root na koniec
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            budujKopiec(array, i, 0);
        }
    }

    void budujKopiec(int tablica[], int dlugoscTablicy, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // jeśli lewe dziecko jest większe niż root
        if(left < dlugoscTablicy && tablica[left] > tablica[largest]) {
            largest = left;
        }

        // jeśli prawe dziecko jest większe niż root
        if(right < dlugoscTablicy && tablica[right] > tablica[largest]) {
            largest = right;
        }

        // czy największy element jest root
        if (largest != i) {
            int temp = tablica[i];
            tablica[i] = tablica[largest];
            tablica[largest] = temp;

            budujKopiec(tablica, dlugoscTablicy, largest);
        }
    }
}

//https://inf.ug.edu.pl/~wpawlowski/08-09/asd-c/heapsort.html
