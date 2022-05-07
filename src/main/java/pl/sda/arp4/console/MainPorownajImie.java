package pl.sda.arp4.console;

import java.util.Scanner;

/**
 * Zadanie PorownajImie:
 * - Poproś użytkownika o podanie imienia
 * - Jeśli użytkownik wpisał "Marian" to wypisz komunikat: "Siema kolego! Dawno się nie widzieliśmy!"
 * - Jeśli użytkownik wpisał dowolne inne imie, wypisz komunikat "Witaj IMIE!"
 */
public class MainPorownajImie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie:");
        String imie = scanner.next();

        // Jeśli chcemy porównać treść tekstu
        if (imie.equals("Marian")) {
            System.out.println("Siema kolego! Dawno się nie widzieliśmy!");
        } else {
            System.out.println("Witaj " + imie + "!");
        }
    }
}
