package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        // są dwie pętle while:
        //  - do while - coś musi się chociaż raz wykonać
        //  - while do

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        // Pętla dekrementująca (zmniejszająca wartość)
        // do (wykonuj)
        System.out.println("Dekrementacja: ");
        do{
            System.out.println((liczba) +" Hello World!");

            // dekrementacja
            liczba--; // (zmniejsz wartość o 1) => (liczba = liczba -1;)

            // while(dopóki)
        }while (liczba > 0);

        // Dla drugiej pętli ponownie wpisuje liczbe
        System.out.println("Podaj liczbę:");
        int liczba2 = scanner.nextInt();

        // Pętla inkrementująca (taka jak for)
        // do (wykonuj)
        int i =0;
        System.out.println("Inkrementacja: ");
        do{
            System.out.println((i) +" Hello World!");

            // inkrementacja
            i++;

            // while(dopóki)
        }while (i < liczba2);
    }
}
