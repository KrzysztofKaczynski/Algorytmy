package algorytmySortDay3;

public class HeapSort {

    public static void main(int[] arrayToSort) {
        int n = arrayToSort.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            HeapSort.validateMaxHeap(arrayToSort, n, i);

        }

        }

    private static void validateMaxHeap(int[] array, int heapSize, int parentIndex) {
        int maxIndex = parentIndex;
        int leftChild = parentIndex * 2 + 1;
        int rightChild = parentIndex * 2 + 2;

        if (leftChild < heapSize && array[leftChild] > array[maxIndex]) {
            maxIndex = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[maxIndex]) {
            maxIndex = rightChild;
        }
        if (maxIndex != parentIndex){
            SortUtils.swap(array, heapSize, parentIndex);
            validateMaxHeap(array, heapSize, maxIndex);
        }
    }
}
