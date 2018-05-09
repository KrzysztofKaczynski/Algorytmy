package listaDwustronnaDwukierunkowa;

public class ListaDM {

    private Wezel poczatek;
    private Wezel koniec;

    public ListaDM() {
        poczatek = null;
        koniec = null;
    }

    public void wstaw(String napis) {
        Wezel wezel = new Wezel(napis, null, null);
        if (czyPusta()) {
            poczatek = wezel;
            koniec = wezel;
        } else {
            Wezel pomoc = poczatek;
            while (pomoc != null) {
                if ((pomoc.pobierzNapis()).compareToIgnoreCase(napis) < 0) {
                    pomoc = pomoc.pobierzNastepny();
                } else {
                    if (pomoc == poczatek) {
                        wezel.ustawNastepny(pomoc);
                        pomoc.ustawPoprzedni(wezel);
                        poczatek = wezel;
                        break;
                    } else {
                        wezel.ustawNastepny(pomoc);
                        wezel.ustawPoprzedni(pomoc.pobierzPoprzedni());
                        (pomoc.pobierzPoprzedni()).ustawNastepny(wezel);
                        pomoc.ustawPoprzedni(wezel);
                        break;
                    }
                }
            }

            if (pomoc == null) {
                koniec.ustawNastepny(wezel);
                wezel.ustawPoprzedni(koniec);
                koniec = wezel;
            }
        }
    }

    public void usun(String napis) {
        Wezel pomoc = poczatek;
        while (pomoc != null) {
            if (pomoc.pobierzNapis() == napis) {
                if (pomoc == poczatek) {
                    poczatek = (pomoc.pobierzNastepny());
                    break;
                } else if (pomoc == koniec) {
                    koniec = (pomoc.pobierzPoprzedni());
                    break;
                } else {
                    (pomoc.pobierzPoprzedni()).ustawNastepny(pomoc.pobierzNastepny());
                    (pomoc.pobierzNastepny()).ustawPoprzedni(pomoc.pobierzPoprzedni());
                    break;
                }
            }
            pomoc = pomoc.pobierzNastepny();
        }
        if (pomoc == null) {
            System.out.println();
            System.out.println("Wyraz " + napis + " nie znajduje sie na liście");
        }
    }

    public boolean czyPusta() {
        return (poczatek == null);
    }

    public void wyswietlOdPoczatku() {
        Wezel pomoc = poczatek;
        System.out.println("Lista ułożona alafabetycznie od początku");
        while (pomoc != null) {
            System.out.println(pomoc.pobierzNapis() + "   ");
            pomoc = pomoc.pobierzNastepny();
        }
    }

    public void wyswietlOdKonca() {
        Wezel pomoc = koniec;
        System.out.println("Lista ułożona alafabetycznie od końca");
        while (pomoc != null) {
            System.out.println(pomoc.pobierzNapis() + "   ");
            pomoc = pomoc.pobierzPoprzedni();
        }
    }

    public void rozmiar() {
        Wezel pomoc = poczatek;
        int i = 0;
        while (pomoc != null) {
            i++;
            pomoc = pomoc.pobierzNastepny();
        }
        System.out.println("Rozmiar listy: " + i);
    }
}
