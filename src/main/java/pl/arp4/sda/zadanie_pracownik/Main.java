package pl.arp4.sda.zadanie_pracownik;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate czasZatrudnienia = addDate();



        System.out.println("Podaj rodzaj zatrudnienia: ");
        String umowa = scanner.nextLine();


        System.out.println("Podaj swoje zarobki do pełnej wartości: ");
        int zarobki = scanner.nextInt();


        Stanowisko stanowisko = null;

        while (stanowisko == null) {
            System.out.println("Podaj swoje stanowisko");
            for (Stanowisko stanowiskoRodzaj : Stanowisko.values()) {
                System.out.printf(" *%s* \n", stanowiskoRodzaj );
            }
            String wybraneStanowisko = scanner.next();

            try {
                stanowisko = Stanowisko.valueOf(wybraneStanowisko.toUpperCase());


            } catch (IllegalArgumentException iae) {
                System.out.println("Nie ma takiego stanowiska");
            }

        }

        System.out.println("Ile posiadasz kwalifikacji? ");
        int n = scanner.nextInt();

        Kwalifikacje [] kwalifikacjeTablica = new Kwalifikacje[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Kwalifikacje, podaj nazwę kwalifikacji: ");
            String nazwa = scanner.next();
            System.out.println("Podaj tytuł kwalifikacji: ");
            String tytul = scanner.next();

            Kwalifikacje kwalifikacje = new Kwalifikacje(nazwa, tytul);
            kwalifikacjeTablica[i] = kwalifikacje;

        }


        Pracownik pracownik = new Pracownik( zarobki, stanowisko, umowa, czasZatrudnienia, kwalifikacjeTablica);
        System.out.println(pracownik + Arrays.toString(kwalifikacjeTablica));


       // String stanowiskoString = stanowisko.toString();





    }

    public static LocalDate addDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę zatrudnienia [d/M/yyyy]: ");
        String str = scanner.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        return LocalDate.parse(str, dtf);
    }
}
