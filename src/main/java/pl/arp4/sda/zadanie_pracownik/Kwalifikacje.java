package pl.arp4.sda.zadanie_pracownik;

public class Kwalifikacje {
    private String nazwa;
    private String tytuł;

    public Kwalifikacje(String nazwa, String tytuł) {
        this.nazwa = nazwa;
        this.tytuł = tytuł;
    }

    @Override
    public String toString() {
        return "Kwalifikacje{" +
                "nazwa='" + nazwa + '\'' +
                ", tytuł='" + tytuł + '\'' +
                '}';
    }
}
