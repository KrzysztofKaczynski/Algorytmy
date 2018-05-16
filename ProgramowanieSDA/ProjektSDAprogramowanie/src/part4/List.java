package part4;

/**
 * Created by wojciechpotocki on 08.05.2018.
 */
public interface List {
    ListElement getFirst();
    ListElement getLast();
    ListElement get(int index);
    void add(ListElement element);
    void remove(int index);
    int size();
    default boolean isEmpty() {
        return size() == 0;
    }
}
