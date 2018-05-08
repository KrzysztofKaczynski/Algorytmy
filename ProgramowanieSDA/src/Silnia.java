/**
 * Created by wojciechpotocki on 26.04.2018.
 */
public class Silnia {
    public int silniaRekurencja(int n) {
        if(n < 2) {
            return 1;
        }

        return n*silniaRekurencja(n-1);
    }
}
