package binarySearchArrays;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchArrayWithComparator
{
    public static void main(String[] args) {
        MyObj[] array = {new MyObj(1), new MyObj(4), new MyObj(2), new MyObj(3)};

        Comparator<MyObj> comp = ((o1, o2) -> Integer.compare(o1.getI(), o2.getI()));
        Arrays.sort(array, comp);
        int index = Arrays.binarySearch(array, new MyObj(2), comp);
        System.out.println(index);
    }

    private static class MyObj{
        private int i;

        public MyObj (int i){
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }
}
