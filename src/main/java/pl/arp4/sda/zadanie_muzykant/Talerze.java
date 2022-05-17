package pl.arp4.sda.zadanie_muzykant;

public class Talerze extends Muzykant implements Instrument {


    public Talerze(String imie) {
        super(imie);
    }

    @Override
    public void graj(String tekst) {

        System.out.println("tss, tss, tss ### " + tekst + " ###" );
    }
}
