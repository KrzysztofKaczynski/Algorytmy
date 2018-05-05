package binarySearchArrays;

import java.util.Arrays;

public class BinarySearchArrayExample2 {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three", "four"};
        Arrays.sort(stringArray);
        System.out.printf("sorted array: %s%n", Arrays.toString(stringArray));

        int index = Arrays.binarySearch(stringArray, "three");
        System.out.println(index);


    }
}
