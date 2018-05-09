package listaDwustronnaDwukierunkowa;

public class Wezel {
    private String napis;
    private Wezel nastepny;
    private Wezel poprzedni;

    public Wezel() {
        nastepny = null;
        poprzedni = null;
    }

    public Wezel(String napis, Wezel nastepny, Wezel poprzedni) {
        this.napis = napis;
        this.nastepny = nastepny;
        this.poprzedni = poprzedni;
    }

    public String pobierzNapis() {
        return napis;
    }

    public Wezel pobierzNastepny() {
        return nastepny;
    }

    public void ustawNastepny(Wezel nastepny) {
        this.nastepny = nastepny;
    }

    public Wezel pobierzPoprzedni() {
        return poprzedni;
    }

    public void ustawPoprzedni(Wezel poprzedni) {
        this.poprzedni = poprzedni;
    }
}
