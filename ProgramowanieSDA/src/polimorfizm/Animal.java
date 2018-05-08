package polimorfizm;

/**
 * Created by wojciechpotocki on 26.04.2018.
 */
public interface Animal {
    void dajGlos();

    default void poruszajSie() {
        System.out.println("Biegnę");
    }
}
