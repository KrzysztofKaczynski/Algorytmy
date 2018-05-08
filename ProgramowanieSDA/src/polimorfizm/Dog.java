package polimorfizm;

/**
 * Created by wojciechpotocki on 26.04.2018.
 */
public class Dog implements  Animal{
    @Override
    public void dajGlos() {
        System.out.println("Hau Hau!");
    }

    public void zjedzCoZnajdziesz() {
        System.out.println("zjadam");
    }
}
