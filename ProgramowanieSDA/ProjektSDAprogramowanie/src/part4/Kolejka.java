package part4;

import java.util.stream.IntStream;

/**
 * Created by wojciechpotocki on 15.05.2018.
 */
public class Kolejka {
    private KolejkaElement first;
    private KolejkaElement last;
    private int licznik = 0;

    public KolejkaElement getFirst() {
        return first;
    }

    public void setFirst(KolejkaElement first) {
        this.first = first;
    }

    public KolejkaElement getLast() {
        return last;
    }

    public void setLast(KolejkaElement last) {
        this.last = last;
    }

    public void add(KolejkaElement element) {
        if(this.licznik == 0) {
            first = element;
            last = element;
        } else {
            last.setPrevious(element);
            last = element;
        }
        this.licznik++;
    }

    public KolejkaElement pop() {
        KolejkaElement temp = null;
        if(this.licznik != 0) {
            temp = first;
            if(this.licznik == 1) {
                first = null;
                last = null;
            } else {
                first = first.getPrevious();
            }
            this.licznik--;
        }
        return temp;
    }

    public void wyswietl() {
        KolejkaElement temp = first;
        for(int i = 0; i < this.licznik; i++) {
            System.out.println(temp);
            temp = temp.getPrevious();
        }

        final KolejkaElement[] finalTemp = {first};
        IntStream.range(0, this.licznik).forEach(i -> {
            System.out.println(finalTemp[0]);
            finalTemp[0] = finalTemp[0].getPrevious();
        });
    }
}











