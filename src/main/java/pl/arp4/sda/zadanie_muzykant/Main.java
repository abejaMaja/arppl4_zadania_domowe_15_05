package pl.arp4.sda.zadanie_muzykant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć, jak masz na imię ? ");
        String imie = scanner.next();
        Muzykant muzykant = new Muzykant(imie);
        System.out.println("Czesc " + imie + ". Podaj refren piosenki ");
        scanner.nextLine();
        String tekst = scanner.nextLine();

        InstrumentTypes instrument = null;
        System.out.println("Tekst twojej piosenki to " + tekst);
        String komenda = " ";

        do {
            System.out.println("Co chcesz zrobić sing/instrument/koniec ");
            komenda = scanner.next();
            System.out.println("wybrałej że chcesz " + komenda);
            if (komenda.equals("sing")) {
                muzykant.zagraj(tekst);
            } else if (komenda.equals("koniec")) {
                break;
            } else {
                System.out.println("Podaj rodzaj instrumentu " + (Arrays.toString(InstrumentTypes.values())) + ":");
                String instrumentTypesString = scanner.next();
                try {

                    instrument = InstrumentTypes.valueOf(instrumentTypesString.toUpperCase());
                    switch (instrument) {
                        case GUITAR:
                            Gitara gitara = new Gitara();
                            muzykant.setInstrument(new Gitara());
                            break;
                        case DRUM:
                            Beben beben = new Beben(imie);
                            muzykant.setInstrument(beben);
                            break;
                        case PLATES:
                            Talerze talerze = new Talerze(imie);
                            muzykant.setInstrument(talerze);
                            break;
                        case VOICE:
                            muzykant.setInstrument(new Glos());
                            break;
                        case FLUTE:
                            Flet flet = new Flet(imie);
                            muzykant.setInstrument(flet);
                            break;
                    }
                } catch (IllegalArgumentException iae) {
                    System.out.println("Nie ma takiego instrumentu");
                }
            }
        } while (!komenda.equals("koniec"));
    }
}

