package pl.sda.arp4.console;

import java.util.Scanner;

public class MainInstrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę pierwszą:");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj liczbę drugą:");
        int liczbaDruga = scanner.nextInt();

        /*
        if (liczbaPierwsza > liczbaDruga) {
            System.out.println("Liczba pierwsza jest większa od drugiej");
        }

        if (liczbaPierwsza < liczbaDruga) {
            System.out.println("Liczba druga jest większa od pierwszej");
        }

        if (liczbaPierwsza <= liczbaDruga) {
            System.out.println("Liczba druga jest większa lub równa liczbie pierwszej");
        }

        if (liczbaPierwsza == liczbaDruga) {
            System.out.println("Liczby są sobie równe");
        }
         */
        if (liczbaPierwsza > liczbaDruga) {
            System.out.println("Liczba pierwsza jest większa od drugiej");
        } else if (liczbaPierwsza < liczbaDruga) {
            System.out.println("Liczba druga jest większa od pierwszej");
        } else { // if (liczbaPierwsza == liczbaDruga)
            System.out.println("Liczby są sobie równe");
        }

    }
}
