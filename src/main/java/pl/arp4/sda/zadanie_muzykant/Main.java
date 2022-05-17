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


            try {
                do {

                    System.out.println("Co chcesz zrobić sing/instrument ");
                    String wybor = scanner.next();
                    System.out.println("wybrałej że chcesz " + wybor);
                    if (wybor.equals("sing")) {
                        muzykant.zagraj(tekst);
                    } else {
                        System.out.println("Podaj rodzaj instrumentu " + (Arrays.toString(InstrumentTypes.values())) + ":");
                        String instrumentTypesString = scanner.next();
                        try {

                            instrument = InstrumentTypes.valueOf(instrumentTypesString.toUpperCase());
                        } catch (IllegalArgumentException iae) {
                            System.out.println("Nie ma takiego instrumentu");
                        }

                    }


                    String instrumentString = instrument.toString();

                    switch (instrumentString) {
                        case "GUITAR":
                            Gitara gitara = new Gitara(imie);
                            muzykant.setInstrument(instrument);
                            System.out.println("Przełączam na " + muzykant.getInstrument());
                            gitara.graj(tekst);
                            break;
                        case "DRUM":
                            Beben beben = new Beben(imie);
                            muzykant.setInstrument(instrument);
                            System.out.println("Przełączam na " + muzykant.getInstrument());
                            beben.graj(tekst);
                            break;
                        case "PLATES":
                            Talerze talerze = new Talerze(imie);
                            muzykant.setInstrument(instrument);
                            System.out.println("Przełączam na " + muzykant.getInstrument());
                            talerze.graj(tekst);
                            break;
                        case "VOICE":
                            Glos glos = new Glos(imie);
                            muzykant.setInstrument(instrument);
                            System.out.println("Przełączam na " + muzykant.getInstrument());
                            glos.graj(tekst);
                            break;
                        case "FLUTE":
                            Flet flet = new Flet(imie);
                            muzykant.setInstrument(instrument);
                            System.out.println("Przełączam na " + muzykant.getInstrument());
                            flet.graj(tekst);
                            break;

                    }


                    muzykant.setInstrument(instrument);
                    System.out.println("W tle słychać " + muzykant.getInstrument());


                } while (instrument == null);


            } catch (NullPointerException enp) {
                continue;
            }

            System.out.println("Kończymy?, dla potwierdzanie wpisz <koniec>");
            komenda = scanner.next();


        } while (!komenda.equals("koniec"));


    }


}

