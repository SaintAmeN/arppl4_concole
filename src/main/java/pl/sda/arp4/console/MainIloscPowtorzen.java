package pl.sda.arp4.console;

import java.util.Scanner;

/**
 * Stwórz nowego maina (MainIloscPowtorzen)
 * - Zapytaj uzytkownika o ilosc powtorzen
 * - Wczytaj wartosć ze scannera
 * - Stworz petle i N (ilosc powtorzen) razy wypisz na ekran "Hello World"
 * - * Dopisz przed każdym hello world numer iteracji (ma zaczynać się od 1)
 * (Nie edytuj wartości inicjalnej pętli)
 */
public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        for (int i = 0; i < liczba; i++) {
//            System.out.println(i + " Hello World!"); // 0 Hello World!, 1....

            // bardzo czytelna ale dwie linie kodu
//            int numerIteracji = i + 1;
//            System.out.println(numerIteracji + " Hello World!");

            // super słabo czytelna
//            System.out.println(i + 1 + " Hello World!");

            // najbardziej naturalna, najczęściej stosowana
            System.out.println((i + 1) + " Hello World!");
        }
    }
}
