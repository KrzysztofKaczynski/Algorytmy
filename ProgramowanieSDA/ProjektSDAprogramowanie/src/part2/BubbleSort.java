package part2;

/**
 * Created by wojciechpotocki on 25.04.2018.
 */
public class BubbleSort implements SortAlgorithm {
    public static void main(String[] args) {

    }

    @Override
    public void sort(int[] array) {
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 1; j < array.length - i; j++) {
                if(array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
