package pl.sda.arp4.console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // wyjście programu
        System.out.println("Rozpoczynam działanie");

        // wejście programu
        Scanner scanner = new Scanner(System.in);

        // Pytamy o podanie swojego imienia
        System.out.println("Podaj swoje imie:");

        // wczytanie od użytkownika jego imienia (jakiegokolwiek tekstu - 1 słowo/token)
        String zmiennaImie = scanner.next();

        // wypisanie imienia użytkownika (konkatenacja z komunikatem)
        System.out.println("Witaj " + zmiennaImie + "!");
    }
}
