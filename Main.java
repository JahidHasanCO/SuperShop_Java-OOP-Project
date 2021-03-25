import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class Main {

    /**
     * I created those Constant.
     */
    private static final String COMMERCE = "commerce";
    private static final String FORMAL = "Formal";
    private static final String BSCCO = "BSc in finance and economic";

    public static void main(String[] args) {

        SuperShop raptor = new SuperShop("Raptor", "khagan, Ashulia, Savar", "01773393608");

        Owner o1 = new Owner("Rabbi Hasan", 40, "Male", 40.50);
        Owner o2 = new Owner("Pabel", 40, "Male", 29.9);
        Owner o3 = new Owner("Rubel", 41, "Male", 29.6);

        raptor.addOwner(o1);
        raptor.addOwner(o2);
        raptor.addOwner(o3);

        Worker w = new Worker("Jahid Hasan", 20, "Male", 201, FORMAL, "010000000", 200.30, "day", 8);
        Worker w1 = new Worker("Hasib", 20, "Male", 202, FORMAL, "0100000001", 200.30, "day", 8);
        Worker w2 = new Worker("nirob", 20, "Male", 203, FORMAL, "0100000002", 200.30, "day", 8);
        Worker w3 = new Worker("payel", 20, "Female", 204, FORMAL, "0100000003", 200.30, "day", 8);
        Worker w4 = new Worker("likhn", 20, "Male", 205, FORMAL, "0100000004", 200.30, "day", 8);
        Worker w5 = new Worker("badol", 20, "Male", 206, FORMAL, "0100000005", 200.30, "day", 8);

        raptor.addWorker(w);
        raptor.addWorker(w1);
        raptor.addWorker(w2);
        raptor.addWorker(w3);
        raptor.addWorker(w4);
        raptor.addWorker(w5);

        Accountant a = new Accountant("Sajib", 30, "Male", 301, FORMAL, "01349384038", COMMERCE, BSCCO, 400.20, "day",
                8);
        Accountant a2 = new Accountant("Halim", 30, "Male", 302, FORMAL, "0134938403", COMMERCE, BSCCO, 400.20, "day",
                8);
        Accountant a3 = new Accountant("rafa", 30, "Male", 303, FORMAL, "0134938408", COMMERCE, BSCCO, 400.20, "day",
                8);

        raptor.addAccountant(a);
        raptor.addAccountant(a2);
        raptor.addAccountant(a3);

        Administrator ad = new Administrator("Jahid Hasan", 35, "male", 101, FORMAL, "01644334343", "CSE", "MSc in CSE",
                460.3, "day", 12);
        Administrator ad2 = new Administrator("Jahid Hasan", 35, "male", 101, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "day", 12);
        Administrator ad3 = new Administrator("Jahid Hasan", 35, "male", 101, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "night", 12);
        Administrator ad4 = new Administrator("Jahid Hasan", 35, "male", 101, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "night", 12);

        raptor.addAdministrator(ad);
        raptor.addAdministrator(ad2);
        raptor.addAdministrator(ad3);
        raptor.addAdministrator(ad4);

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
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Print Owners");
                System.out.println("2. Print Accountants");
                System.out.println("3. Print Administrators");
                System.out.println("4. Print Workers");
                System.out.println("5. Modify");
                System.out.println("6 Product Management");
                System.out.println("7. back");
                System.out.print("\nEnter Option: ");
                int option2 = input.nextInt();
                if (option2 == 7) {

                    break;
                }
                switch (option2) {
                case 1:
                    raptor.printAllOwners();
                    break;
                case 2:
                    raptor.printAllAccountants();
                    break;
                case 3:
                    raptor.printAllAdministrators();

                    break;
                case 4:
                    raptor.printAllWorkers();
                    break;

                default:
                    break;
                }

                break;
            /**
             * Start Search Section in this section i write some search algo for search
             * people
             * 
             */
            case 3:
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Search Owners");
                System.out.println("2. Search Accountants");
                System.out.println("3. Search Administrators");
                System.out.println("4. Search Workers");
                System.out.println("6. back");
                System.out.print("\nEnter Option: ");
                int option3 = input.nextInt();
                if (option3 == 6) {

                    break;
                }
                switch (option3) {
                case 1:
                    System.out.print("Enter Name: ");
                    String oName = input.next();
                    raptor.searchOwners(oName);
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String aName = input.next();
                    raptor.searchAccountant(aName);
                    break;
                default:
                    break;
                }
                break;
            case 6:
                break;
            default:
                System.out.println("You need to choose Right option");
                break;
            }

        }

    }

}