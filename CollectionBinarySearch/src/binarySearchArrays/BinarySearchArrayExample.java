package binarySearchArrays;

import java.util.Arrays;

public class BinarySearchArrayExample
{
    public static void main(String[] args) {
        int[] ints = {2, 1, 3, 5, 4};
        Arrays.sort(ints);
        System.out.printf("sorted array: %s%n", Arrays.toString(ints));

        int index = Arrays.binarySearch(ints, 3);
        System.out.println(index);
    }
}
