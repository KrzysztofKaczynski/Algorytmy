package part4;

/**
 * Created by wojciechpotocki on 15.05.2018.
 */
public class KolejkaElement {
    private int wartosc;
    private KolejkaElement previous;

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public KolejkaElement getPrevious() {
        return previous;
    }

    public void setPrevious(KolejkaElement previous) {
        this.previous = previous;
    }
}
