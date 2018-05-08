package polimorfizm;

/**
 * Created by wojciechpotocki on 26.04.2018.
 */
public class Cat implements Animal {
    @Override
    public void dajGlos() {
        System.out.println("Miau miau!");
    }

    @Override
    public void poruszajSie() {
        System.out.println("Biegnie kotek!");
    }
}
