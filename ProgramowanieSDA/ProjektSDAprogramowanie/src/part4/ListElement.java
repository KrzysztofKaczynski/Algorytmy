package part4;

/**
 * Created by wojciechpotocki on 08.05.2018.
 */
public class ListElement {
    private int value;
    private ListElement previous;
    private ListElement next;

    public ListElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListElement getPrevious() {
        return previous;
    }

    public void setPrevious(ListElement previous) {
        this.previous = previous;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}
