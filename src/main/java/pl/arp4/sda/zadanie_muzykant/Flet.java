package pl.arp4.sda.zadanie_muzykant;

public class Flet extends Muzykant implements Instrument{


    public Flet(String imie) {
        super(imie);
    }

    @Override
    public void graj(String tekst) {

        System.out.println("iuu, fiuuu ### " + tekst + " ### fiuuu(t)");
    }
}
