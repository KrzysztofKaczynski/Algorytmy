package part4;

/**
 * Created by wojciechpotocki on 07.05.2018.
 */
public class StackElement implements Stack {
    private int size = 0;
    private Element top;

    @Override
    public void push(Element element) {
        if(!this.isEmpty()) {
            element.setPrevious(this.top);
        }
        this.top = element;
        this.size++;
    }

    @Override
    public Element pop() {
        if(!this.isEmpty()) {
            Element popElement = top;
            this.top = this.top.getPrevious();
            this.size--;
            return popElement;
        }

        return null;
    }

    @Override
    public Element peek() {
        return this.top;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void show() {
        Element temp = top;
        while(temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getPrevious();
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
