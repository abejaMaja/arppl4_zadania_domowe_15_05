package pl.arp4.sda.zadanie_muzykant;

public class Gitara  implements Instrument {


    public Gitara() {
    }

    @Override
    public void graj(String tekst) {

        System.out.println("tyryn, tyryn ###" + tekst + " ###");
    }
}
