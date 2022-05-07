package pl.sda.arp4.console;

import java.util.Scanner;

/**
 * Napisać program w którym użytkownik podaje na początku dwie liczby: początekZakresu oraz koniecZakresu.
 * Upewnij się że początekZakresu < koniecZakresu a następnie:
 * - pobierz od użytkownika kolejną liczbę - dzielnik.
 * Po pobraniu dzielnika wypisz wszystkie liczby od początekZakresu do koniecZakresu które są podzielne przez dzielnik.
 */
public class MainZadanie4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek zakresu:");
        int początekZakresu = scanner.nextInt();
        System.out.println("Podaj koniec zakresu:");
        int koniecZakresu = scanner.nextInt();

        // jeśli koniec zakresu jest mniejszy od początku, to wypiszmy komunikat
        // dla użytkownika żeby poinformować go o błędnych danych (że się pętla nie wykona)
        if(początekZakresu > koniecZakresu){
            System.out.println("Błędne dane, pętla się nie wykona");
        }

        System.out.println("Podaj dzielnik:");
        int dzielnik = scanner.nextInt();

        for (int i = początekZakresu; i < koniecZakresu + 1; i++) {
            if(i % dzielnik == 0){
                System.out.println(i);
            }
        }
    }
}
