package algorytmySortDay3;

public class FibbRecursion {
    public static int fibNumber(int nth){
        if (nth == 0) {
            return 0;
        }
        else if (nth == 1){
            return 1;
        }else {
            return fibNumber(nth- 1) + fibNumber(nth- 2);

        }
    }

    // 0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {
        System.out.println(fibNumber(10));
    }
}
