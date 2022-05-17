package pl.arp4.sda.zadanie_muzykant;

public class Glos extends Muzykant implements Instrument {


    public Glos(String imie) {
        super(imie);
    }

    @Override
    public void graj(String tekst) {

        System.out.println(tekst);
    }
}
