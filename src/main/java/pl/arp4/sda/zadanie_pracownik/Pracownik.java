package pl.arp4.sda.zadanie_pracownik;

import java.time.LocalDate;

public class Pracownik{
    private int zarobki;
    private Stanowisko stanowisko;
    private String umowa;
    private LocalDate czasZatrudnienia;
    private Kwalifikacje [] kwalifikacje;


    public Pracownik(int zarobki, Stanowisko stanowisko, String umowa, LocalDate czasZatrudnienia, Kwalifikacje[] kwalifikacje) {
        this.zarobki = zarobki;
        this.stanowisko = stanowisko;
        this.umowa = umowa;
        this.czasZatrudnienia = czasZatrudnienia;
        this.kwalifikacje = kwalifikacje;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "zarobki=" + zarobki +
                ", stanowisko=" + stanowisko +
                ", umowa='" + umowa + '\'' +
                ", czasZatrudnienia=" + czasZatrudnienia +
                '}';
    }
}
