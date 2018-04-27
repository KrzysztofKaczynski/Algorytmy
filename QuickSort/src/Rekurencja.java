public class Rekurencja{

        /**
         * Rekurencja zwana rekursją polega na wywołyuwaniu przez funkcję samej siebie.
         */
   public static int sumRecursive(int a, int b) {

       if (a == 0) {
            return b;
       }
       else {
           return sumRecursive(--a, ++b);
       }

   }
    public static void main(String[] args) {
        System.out.println(sumRecursive(10, 7));
        System.out.println(sumRecursive(2, 1));
    }
}
