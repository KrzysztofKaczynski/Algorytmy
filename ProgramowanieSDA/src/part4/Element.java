package part4;

/**
 * Created by wojciechpotocki on 07.05.2018.
 */
public class Element {
    private int value;
    Element previous;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getPrevious() {
        return this.previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }
}
