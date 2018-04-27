package Polimorfizm;

public class Cat implements Animal {

    @Override
    public void dajGlos() {
        System.out.println("Miau Miau!");
    }

    @Override
    public void poruszSie() {
        System.out.println("Biegne!");
    }
}
