package part4;

/**
 * Created by wojciechpotocki on 08.05.2018.
 */
public class DynamicList implements List {
    private ListElement first;
    private ListElement last;
    private int size = 0;

    @Override
    public ListElement getFirst() {
        return null;
    }

    @Override
    public ListElement getLast() {
        return null;
    }

    @Override
    public ListElement get(int index) {
        return null;
    }

    @Override
    public void add(ListElement element) {
        if(first == null) {
            first = element;
            last = first;
        } else {
            element.setPrevious(last);
            last.setNext(element);
            last = last.getNext();
        }

//        size++;
//        if(size == 1) {
//            last = element;
//        } else if(size == 2) {
//            last.setNext(element);
//            element.setPrevious(last);
//        } else {
//            first.setNext(element);
//            element.setPrevious(first);
//        }
//        first = element;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return this.size;
    }
}
