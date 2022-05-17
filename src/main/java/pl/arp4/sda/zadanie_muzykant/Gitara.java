package pl.arp4.sda.zadanie_muzykant;

public class Gitara extends Muzykant implements Instrument {


    public Gitara(String imie) {
        super(imie);
    }

    @Override
    public void graj(String tekst) {

        System.out.println("tyryn, tyryn ###" + tekst + " ###");
    }
}
