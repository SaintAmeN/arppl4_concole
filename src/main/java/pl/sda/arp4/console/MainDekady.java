package pl.sda.arp4.console;

import java.util.Scanner;

public class MainDekady {
    public static void main(String[] args) {
        // wyjście programu
        System.out.println("Rozpoczynam działanie");

        // wejście programu
        Scanner scanner = new Scanner(System.in);

        // Pytamy o podanie swojego wieku
        System.out.println("Podaj swój wiek:");

        int zmiennaWiek = scanner.nextInt();
        int wiekDekady = zmiennaWiek/10;

        System.out.println("Żyjesz już " + wiekDekady + " dekad!");

    }
}
