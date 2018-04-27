package Polimorfizm;

public class Dog implements Animal {

    @Override
    public void dajGlos() {
        System.out.println("Hau Hau!!");
    }

    @Override
    public void poruszSie() {
        System.out.println("Biegnę");

    }
}
