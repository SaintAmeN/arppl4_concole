package pl.sda.arp4.console;

/**
 * Tworzymy klasę MainZadanie1Petle:
 * Napisz aplikację która wypisuje:
 * -- liczby z zakresu 1 - 100 w nowych liniach
 * -- liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
 * -- liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
 * -- liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
 * -- liczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach
 * - liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
 */
public class MainZadanie1Petle {
    public static void main(String[] args) {
        System.out.println("-- liczby z zakresu 1 - 100 w nowych liniach:");
        for (int i = 0; i < 100; i++) {
            System.out.print(i + 1);
        }

        System.out.println("-- liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją:");
        for (int i = 1000; i < 1021; i++) {
            System.out.print(i + " ");
        }

        System.out.println("-- liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach:");
        for (int i = -30; i < 1001; i++) {
            if (i % 5 == 0) { // podzielne przez 5 jeśli reszta z dzielenia równa jest 0
                System.out.println(i);
            }
        }

        System.out.println("-- liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach:");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) { // podzielne przez 3 jeśli reszta z dzielenia równa jest 0
                System.out.println(i);
            }
        }

        System.out.println("-- liczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach:");
        for (int i = 30; i < 301; i++) {
//            boolean podzielnePrzez3 = i % 3 == 0;
//            boolean podzielnePrzez5 = i % 5 == 0;
//            if (podzielnePrzez3 && podzielnePrzez5) {
//                System.out.println(i);
//            }

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }

        System.out.println("-- liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami");
        for (int i = -300; i < 301; i++) {
            if (i % 2 != 0) { // nieparzyste => podzielne przez 2 jeśli reszta z dzielenia równa jest 1
                System.out.print(i + ";");
            }
        }
    }
}
