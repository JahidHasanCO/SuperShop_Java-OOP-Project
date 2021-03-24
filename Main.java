import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class Main {

    private static final String FORMAL = "Formal";
    private static Void printAllWorkers;

    public static void main(String[] args) {

        SuperShop raptor = new SuperShop("Raptor", "khagan, Ashulia, Savar", "01773393608");

        Worker w = new Worker("Jahid Hasan", 20, "Male", 201, FORMAL, "010000000", 200.30, "day", 8);
        Worker w1 = new Worker("Hasib", 20, "Male", 201, FORMAL, "0100000001", 200.30, "day", 8);
        Worker w2 = new Worker("nirob", 20, "Male", 201, FORMAL, "0100000002", 200.30, "day", 8);
        Worker w3 = new Worker("payel", 20, "Female", 201, FORMAL, "0100000003", 200.30, "day", 8);
        Worker w4 = new Worker("likhn", 20, "Male", 201, FORMAL, "0100000004", 200.30, "day", 8);
        Worker w5 = new Worker("badol", 20, "Male", 201, FORMAL, "0100000005", 200.30, "day", 8);

        raptor.addWorkers(w);
        raptor.addWorkers(w1);
        raptor.addWorkers(w2);
        raptor.addWorkers(w3);
        raptor.addWorkers(w4);
        raptor.addWorkers(w5);

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\nSelect your Option: ");
            System.out.println("-----------------------");
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Modify");
            System.out.println("6. Exit");
            System.out.print("\nEnter Option: ");

            int option = input.nextInt();
            if (option == 6) {
                input.close();
                break;
            }

            switch (option) {
            case 2:
                raptor.printAllWorkers();
                break;

            default:
                System.out.println("You need to choose Right option");
                break;
            }

        }

    }

}