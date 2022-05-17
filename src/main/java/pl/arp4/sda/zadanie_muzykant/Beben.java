package pl.arp4.sda.zadanie_muzykant;

public class Beben extends Muzykant implements Instrument{


    public Beben(String imie) {
        super(imie);
    }

    @Override
    public void graj(String tekst) {

        System.out.println("buum, bumm ### " + tekst + " ### dum, dum");
    }
}
