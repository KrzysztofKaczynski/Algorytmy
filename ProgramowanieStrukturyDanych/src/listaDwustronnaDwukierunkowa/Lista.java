package listaDwustronnaDwukierunkowa;

public class Lista {
    public static void main(String[] args) {

        ListaDM lista = new ListaDM();
        lista.wstaw("Speak & Spell (1981)");
        lista.wstaw("A Broken Frame (1982)");
        lista.wstaw("Construction Time Again (1983)");
        lista.wstaw("Some Great Reward (1984)");
        lista.wstaw("Black Celebration (1986)");
        lista.wstaw("Music for the Masses (1987)");
        lista.wstaw("Violator (1990)");
        lista.wstaw("Songs of Faith and Devotion (1993)");
        lista.wstaw("Ultra (1997)");
        lista.wstaw("Exciter (2001)");
        lista.wstaw("Playing the Angel (2005)");
        lista.wstaw("Sounds of the Universe (2009)");
        lista.wstaw("Delta Machine (2013)");
        lista.wstaw("Spirit (2017)");
        lista.rozmiar();
        lista.wyswietlOdPoczatku();
        lista.usun("Speak & Spell (1981)");
        lista.wyswietlOdKonca();


    }
}
