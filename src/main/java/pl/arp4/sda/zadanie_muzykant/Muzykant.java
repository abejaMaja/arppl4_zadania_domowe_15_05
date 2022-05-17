package pl.arp4.sda.zadanie_muzykant;

public class Muzykant  {
    private String imie;
    private String tekst;
    private InstrumentTypes instrument = null;

    public Muzykant(String imie) {
        this.imie = imie;

    }


    public void setInstrument(InstrumentTypes instrument) {
        this.instrument = instrument;
    }

    public InstrumentTypes getInstrument() {
        return instrument;
    }

    public String getTekst() {
        return tekst;
    }

    public void zagraj (String tekst){
        System.out.println("Śpiewam głośno twój tekst piosenki " + tekst);
    }


    }



