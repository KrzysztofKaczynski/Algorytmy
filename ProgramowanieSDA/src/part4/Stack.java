package part4;

/**
 * Created by wojciechpotocki on 07.05.2018.
 */
public interface Stack {
    void push(Element element);
    Element pop();
    Element peek();
    int size();
    boolean isEmpty();
    void show();
}
