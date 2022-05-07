package pl.sda.arp4.console;

import java.util.Scanner;

// Napisz program, który wczytuje tekst od użytkownika i wypisuje go z powrotem do konsoli wielkimi literami (metoda toUpperCase()).
// Jeśli użytkownik wpisze `quit` to program ma się zakończyć
public class MainZadanie3DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tekst;
        do {
            System.out.println("Podaj tekst:");
            tekst = scanner.next();

            if(!tekst.equals("quit")){
                System.out.println(tekst.toUpperCase());
            }
        }while (!tekst.equals("quit"));
    }
}
