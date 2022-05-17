package pl.arp4.sda.zadanie_muzykant;

public class Muzykant  {
    private String imie;
    private String tekst;
//    private InstrumentTypes instrument = null;
    private Instrument instrument = null;

    public Muzykant(String imie) {
        this.imie = imie;

    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getTekst() {
        return tekst;
    }

    public void zagraj (String tekst){
        if (instrument != null) {
            instrument.graj(tekst);
        }
    }


    }



