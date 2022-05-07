package pl.sda.arp4.console;

import java.util.Scanner;

/**
 * Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby większe od 0.
 */
public class MainZadanie2DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // deklaracja przed pętlą
        int liczba;

        do {
            // przypisanie wartości
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextInt();

            // aby zapobiec ostatniemu wypisaniu
            if (liczba > 0) {
                System.out.println("Hello World!");
            }

//             alternatywnie, aby zapobiec ostatniemu wypisaniu
//            if (liczba <= 0){
//                break;
//            }
//            System.out.println("Hello World!");

        } while (liczba > 0);
    }
}
