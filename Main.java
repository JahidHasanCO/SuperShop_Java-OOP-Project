import java.util.Scanner;

import ModelClass.Product;

public class Main {

    /**
     * I created those Constant.
     */
    private static final String COMMERCE = "commerce";
    private static final String FORMAL = "Formal";
    private static final String BSCCO = "BSc in finance and economic";

    public static void main(String[] args) {

        /**
         * I created a object of super shop called raptor
         */
        SuperShop raptor = new SuperShop("Raptor", "khagan, Ashulia, Savar", "01773393608");

        /**
         * I Created three owner of shop
         */

        raptor.addOwner(new Owner("Rabbi Hasan", 40, "Male", 40.50));
        raptor.addOwner(new Owner("Pabel", 40, "Male", 29.9));
        raptor.addOwner(new Owner("Rubel", 41, "Male", 29.6));

        raptor.addWorker(new Worker("Jahid Hasan", 20, "Male", 201, FORMAL, "010000000", 200.30, "day", 8));
        raptor.addWorker(new Worker("Hasib", 20, "Male", 202, FORMAL, "0100000001", 200.30, "day", 8));
        raptor.addWorker(new Worker("nirob", 20, "Male", 203, FORMAL, "0100000002", 200.30, "day", 8));
        raptor.addWorker(new Worker("payel", 20, "Female", 204, FORMAL, "0100000003", 200.30, "day", 8));
        raptor.addWorker(new Worker("likhn", 20, "Male", 205, FORMAL, "0100000004", 200.30, "day", 8));
        raptor.addWorker(new Worker("badol", 20, "Male", 206, FORMAL, "0100000005", 200.30, "day", 8));

        raptor.addAccountant(
                new Accountant("Sajib", 30, "Male", 301, FORMAL, "01349384038", COMMERCE, BSCCO, 400.20, "day", 8));
        raptor.addAccountant(
                new Accountant("Halim", 30, "Male", 302, FORMAL, "0134938403", COMMERCE, BSCCO, 400.20, "day", 8));
        raptor.addAccountant(
                new Accountant("rafa", 30, "Male", 303, FORMAL, "0134938408", COMMERCE, BSCCO, 400.20, "day", 8));

        raptor.addAdministrator(new Administrator("Jahid Hasan", 35, "male", 101, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "day", 12));
        raptor.addAdministrator(new Administrator("Jahid Hasan", 35, "male", 102, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "day", 12));
        raptor.addAdministrator(new Administrator("Jahid Hasan", 35, "male", 103, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "night", 12));
        raptor.addAdministrator(new Administrator("Jahid Hasan", 35, "male", 104, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "night", 12));

        Product p = new Product("Oliv", 100001, 20.3, "Oil");

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\nSelect your Option: ");
            System.out.println("-----------------------");
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("6. Exit");
            System.out.print("\nEnter Option: ");

            int option = input.nextInt();
            if (option == 6) {
                input.close();
                raptor.input.close();
                break;
            }

            switch (option) {
            /**
             * this is add section
             */
            case 1:
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Add Accountants");
                System.out.println("2. Add Administrators");
                System.out.println("3. Add Workers");
                System.out.println("4. back");
                System.out.print("\nEnter Option: ");
                int option1 = input.nextInt();
                if (option1 == 4) {

                    break;
                }
                switch (option1) {

                /**
                 * (String name, int age, String gender, int id, String dressCode, String
                 * phoneNumber, String department, String qualification, double salary, String
                 * dayShift, int workHour)
                 */
                case 2:
                    System.out.println("Add New Accountant");
                    System.out.println("-------------------");

                    String aNameIN = input.next();
                    break;

                default:
                    System.out.println("You need to choose Right option");
                    break;
                }

                break;
            /**
             * this is print section
             * 
             */
            case 2:
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Print Owners");
                System.out.println("2. Print Accountants");
                System.out.println("3. Print Administrators");
                System.out.println("4. Print Workers");
                System.out.println("5. back");
                System.out.print("\nEnter Option: ");
                int option2 = input.nextInt();
                if (option2 == 5) {

                    break;
                }
                switch (option2) {
                /**
                 * this case print all owner list
                 */
                case 1:
                    raptor.printAllOwners();
                    break;
                /**
                 * this case print all accountants list
                 */
                case 2:
                    raptor.printAllAccountants();
                    break;
                /**
                 * this case print all Administraor list
                 */
                case 3:
                    raptor.printAllAdministrators();

                    break;
                /**
                 * this case print all worker list
                 */
                case 4:
                    raptor.printAllWorkers();
                    break;

                /**
                 * if user enter value which is not avilable in option then this method will be
                 * called
                 */
                default:
                    System.out.println("You need to choose Right option");
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
                System.out.println("1. Search Owner");
                System.out.println("2. Search Accountant");
                System.out.println("3. Search Administrator");
                System.out.println("4. Search Worker");
                System.out.println("5. back");
                System.out.print("\nEnter Option: ");
                int option3 = input.nextInt();
                if (option3 == 5) {

                    break;
                }
                switch (option3) {
                /**
                 * this case find owner details
                 */
                case 1:
                    System.out.print("Enter Owner Name: ");
                    String oName = input.next();
                    raptor.searchOwners(oName);
                    break;
                /**
                 * this case find Accountant details
                 */
                case 2:
                    System.out.print("Enter Accountant ID: ");
                    int aID = input.nextInt();
                    raptor.searchAccountant(aID);
                    break;
                /**
                 * this case find administrator details
                 */
                case 3:
                    System.out.print("Enter Administarator ID: ");
                    int adID = input.nextInt();
                    raptor.searchAdmintrator(adID);
                    break;
                /**
                 * this case find worker details
                 */
                case 4:
                    System.out.print("Enter Worker ID: ");
                    int wID = input.nextInt();
                    raptor.searchWorkers(wID);
                    break;
                default:
                    System.out.println("You need to choose Right option");
                    break;
                }
                break;

            /**
             * this is delete section
             */
            case 4:
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Delete Accountant");
                System.out.println("2. Delete Administrator");
                System.out.println("3. Delete Worker");
                System.out.println("4. back");
                System.out.print("\nEnter Option: ");
                int option4 = input.nextInt();
                if (option4 == 4) {

                    break;
                }
                switch (option4) {
                case 1:
                    System.out.print("Enter Accountant ID: ");
                    int aIDdel = input.nextInt();
                    raptor.deleteAccountant(aIDdel);
                    break;
                case 2:
                    System.out.print("Enter Administarator ID: ");
                    int adIDdel = input.nextInt();
                    raptor.deleteAdmintrator(adIDdel);
                    break;
                case 3:
                    System.out.print("Enter Worker ID: ");
                    int wIDdel = input.nextInt();
                    raptor.deleteWorkers(wIDdel);
                    break;
                default:
                    System.out.println("You need to choose Right option");
                    break;
                }
                break;
            /**
             * this section is product management section
             */
            case 6:
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Print All Products");
                System.out.println("2. Print Products by Category");
                System.out.println("3. Print Administrators");
                System.out.println("4. Print Workers");
                System.out.println("5. back");
                System.out.print("\nEnter Option: ");
                break;
            default:
                System.out.println("You need to choose Right option");
                break;
            }

        }

    }

}