package pl.sda.arp4.console;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        // Opcja z liczbą
        System.out.println("Podaj swój stan cywilny: (0-wolny, 1-zajety)");
        int stanCywilny = scanner.nextInt();

        if (stanCywilny == 1) {
            StanCywilny zmiennaStanCywilny = StanCywilny.ZAJETY;
        }else {
            StanCywilny zmiennaStanCywilny = StanCywilny.WOLNY;
        }
         */

        // Opcja z liczbą
        System.out.println("Podaj swój stan cywilny: (wolny/zajety)");
        String stanCywilny = scanner.next();

        // Deklaracja przed if'em
        StanCywilny zmiennaStanCywilny;

        // Przypisujemy wartość na podstawie wpisanego tekstu
        if (stanCywilny.equalsIgnoreCase("ZAJETY")) {
            zmiennaStanCywilny = StanCywilny.ZAJETY;
        } else if (stanCywilny.equalsIgnoreCase("wolny")) {
            zmiennaStanCywilny = StanCywilny.WOLNY;
        } else {
            zmiennaStanCywilny = StanCywilny.NIEZNANY;
            System.out.println("Nie zostało wpisane nic co pasuje :( ");
        }
        //--------- przestajemy używać String

        // mogę skorzystać ze zmiennej którą zadeklarowałem przed if
        System.out.println(zmiennaStanCywilny);

        switch (zmiennaStanCywilny) {
            case WOLNY:     // if (zmiennaStanCywilny == WOLNY)
                System.out.println("To jest wolny ziomek");
                break;
            case ZAJETY:    // else if (zmiennaStanCywilny == ZAJETY)
                System.out.println("Ten typ jest zajety");
                break;
            default:        // else (NIEZNANY)
                System.out.println("Ani jest wolny, ani zajety, nie wiemy!");
        }
    }
}
