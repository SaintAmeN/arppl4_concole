package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaWhileDoQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inicjalna wartość, pierwsze wpisanie
        System.out.println("Wpisz tekst:");
        String tekst = scanner.next();

        // ! - negacja
        // warunek jest: tekst.equals("quit") - dopóki tekst jest równy quit
        // po negacji: NIE dopóki tekst jest równy quit
        while (!tekst.equals("quit")){
            System.out.println("Hello world!");

            // ponowne wczytanie tekstu:
            System.out.println("Wpisz tekst:");
            tekst = scanner.next();
        }
    }
}
