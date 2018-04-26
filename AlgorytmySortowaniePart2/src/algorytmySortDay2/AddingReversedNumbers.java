package algorytmySortDay2;

/**
 * @author KRIS
 */
public class AddingReversedNumbers {
    public static void main(String[] args) {
        int number = 12340;
        System.out.println("Number " + number);
        System.out.println("Reversed number " + reverse(number));

        int sum =0;
        sum = number + reverse(number);
        System.out.println("sum: " + sum);
        System.out.println("reserve sum: " + reverse(sum));

    }

    static int reverse(int n){
        String string = String.valueOf(n);
        int lenght = string.length();
        int[] tab = new int[lenght];
        int[] revtab = new int[lenght];
        int revNumber =0;
        int j=0;

        for(int i=lenght-1; i>=0;i--){
            tab[j]= (int) (n/Math.pow(10,i));
            n= n-tab[j]* (int) Math.pow(10,i);
            j++;
        }
        j=0;
        for(int i=lenght-1; i>=0;i--){
            revtab[j]=tab[i];
            j++;
        }

        for(int i=0;i<tab.length;i++) {
            revNumber =revNumber+ (int) (revtab[i] * Math.pow(10, lenght-1));
            lenght--;
        }

        return revNumber;
    }
}
