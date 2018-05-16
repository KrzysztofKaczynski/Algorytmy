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
        if(index >= size) {
            return null;
        }

        ListElement element = first;
        while(index-- > 0) {
            element = element.getNext();
        }

        return element;
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

        size++;

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
        ListElement toRemove = get(index);

        if(size == 1) {
            first = null;
            last = null;
        } else if(toRemove.equals(first)) {
            first.getNext().setPrevious(null);
            first = first.getNext();
        } else if(toRemove.equals(last)) {
            last.getPrevious().setNext(null);
            last = last.getPrevious();
        } else {
            toRemove.getNext().setPrevious(toRemove.getPrevious());
            toRemove.getPrevious().setNext(toRemove.getNext());
        }

        size--;
    }

    @Override
    public int size() {
        return this.size;
    }
}
