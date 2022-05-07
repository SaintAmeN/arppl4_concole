package pl.sda.arp4.console;

public class MainPetlaFor {
    public static void main(String[] args) {
        // pętla, iterator zmieni wartość 10 razy
        // int iterator = 0; - wykonuje się 1 raz, na początku
        // iterator < 10; - sprawdzenie warunku (przed rozpoczęciem obiegu)
        // iterator ++; - innymi słowy (iterator = iterator+1)
        for (int iterator = 0; iterator < 5; iterator++) {
            // 0, 1, 2, 3, 4
            System.out.println("Hello World!");
        }

        for (int iterator = 1; iterator <= 5; iterator++) {
            // 1, 2, 3, 4, 5
            System.out.println("Hello World!");
        }
    }
}
