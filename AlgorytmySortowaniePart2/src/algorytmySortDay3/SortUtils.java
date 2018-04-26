package algorytmySortDay3;

public class SortUtils
{
    public static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = index2;
        arr[index2] = temp;
    }
}
