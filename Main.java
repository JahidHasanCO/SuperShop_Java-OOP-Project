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
        raptor.addOwner(new Owner("Pabel Kumar", 55, "Male", 29.9));
        raptor.addOwner(new Owner("Md Rubel Mia", 41, "Male", 29.6));

        /**
         * In this part i call add Worker Method from SuperShop class then i pass in
         * this method a Worker class object Thats mean I added worker in Workers Array
         * List
         */
        raptor.addWorker(new Worker("Jahid Hasan", 20, "Male", 201, FORMAL, "010000000", 200.30, "Day", 8));
        raptor.addWorker(new Worker("Hasibur Rahman", 20, "Male", 202, FORMAL, "0100000001", 200.30, "Night", 12));
        raptor.addWorker(new Worker("Asraful Nirob", 20, "Male", 203, FORMAL, "0100000002", 200.30, "Day", 8));
        raptor.addWorker(new Worker("Israt Jahan Payel", 20, "Female", 204, FORMAL, "0100000003", 200.30, "Day", 8));
        raptor.addWorker(new Worker("Nasim Mahmud Likhon", 20, "Male", 205, FORMAL, "0100000004", 200.30, "Night", 12));
        raptor.addWorker(new Worker("Md Badol Mia", 20, "Male", 206, FORMAL, "0100000005", 200.30, "Day", 8));

        raptor.addAccountant(new Accountant("Sajib Bin Mamun", 30, "Male", 301, FORMAL, "01349384038", COMMERCE, BSCCO,
                400.20, "day", 8));
        raptor.addAccountant(new Accountant("Halim Islam", 30, "Male", 302, FORMAL, "0134938403", COMMERCE, BSCCO,
                400.20, "day", 8));
        raptor.addAccountant(new Accountant("Arafat Islam", 30, "Male", 303, FORMAL, "0134938408", COMMERCE, BSCCO,
                400.20, "day", 8));

        raptor.addAdministrator(new Administrator("Jahid Hasan", 35, "male", 101, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "day", 12));
        raptor.addAdministrator(new Administrator("Sajedul Islam", 35, "male", 102, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "day", 12));
        raptor.addAdministrator(new Administrator("Pabel Islam", 35, "male", 103, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "night", 12));
        raptor.addAdministrator(new Administrator("Sovaj Rana", 35, "male", 104, FORMAL, "01644334343", "CSE",
                "MSc in CSE", 460.3, "night", 12));

        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Meat", 100001, 20.3, "Meat"));
        raptor.addProduct(new Product("fish", 100001, 20.3, "Fish"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100001, 20.3, "Oil"));
        raptor.addProduct(new Product("Oliv", 100002, 20.3, "Oil"));

        Scanner input = new Scanner(System.in);

        logo(); // calling logo method

        while (true) {

            System.out.println("\nSelect your Option: ");
            System.out.println("-----------------------");
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Product Management");
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
                case 1:
                    input.nextLine();
                    System.out.println("Add New Accountant");
                    System.out.println("-------------------");
                    System.out.print("\nEnter Accountant Name: ");
                    String aname = input.nextLine();
                    System.out.print("Enter Accountant Age: ");
                    int aage = Integer.parseInt(input.nextLine());
                    System.out.print("Enter Accountant Gender: ");
                    String agender = input.nextLine();
                    System.out.print("Enter Accountant ID: ");
                    int aid = Integer.parseInt(input.nextLine());
                    System.out.print("Enter Accountant DressCode: ");
                    String adressCode = input.nextLine();
                    System.out.print("Enter Accountant Phone Number: ");
                    String aphoneNumber = input.nextLine();
                    System.out.print("Enter Accountant Department: ");
                    String adepartment = input.nextLine();
                    System.out.print("Enter Accountant Qualification: ");
                    String aqualification = input.nextLine();
                    System.out.print("Enter Accountant Salary: ");
                    double asalary = Double.parseDouble(input.nextLine());
                    System.out.print("Enter Accountant Duty Shift: ");
                    String adayShift = input.nextLine();
                    System.out.print("Enter Accountant Work Hour: ");
                    int aworkHour = Integer.parseInt(input.nextLine());

                    System.out.print("\nDo you add this record(y/n): ");
                    String cin1 = input.next();
                    if (cin1.equals("y")) {
                        raptor.addAccountant(new Accountant(aname, aage, agender, aid, adressCode, aphoneNumber,
                                adepartment, aqualification, asalary, adayShift, aworkHour));
                        System.out.print("\nSuccessfully added records.");
                    }

                    break;
                case 2:
                    input.nextLine(); // i call input object for focus scanner cursor. bt this line didn't get any
                                      // input
                    System.out.println("Add New Administrator");
                    System.out.println("-------------------");
                    System.out.print("\nEnter Administrator Name: ");
                    String aaname = input.nextLine(); // this variable will store administrator name from user input
                    System.out.print("Enter Administrator Age: ");
                    int aaage = Integer.parseInt(input.nextLine()); // this variable will store administrator Age from
                                                                    // user input
                    System.out.print("Enter Administrator Gender: ");
                    String aagender = input.nextLine(); // this variable will store administrator Gender from user input
                    System.out.print("Enter Administrator ID: ");
                    int aaid = Integer.parseInt(input.nextLine()); // this variable will store administrator ID from
                                                                   // user input
                    System.out.print("Enter Administrator DressCode: ");
                    String aadressCode = input.nextLine(); // this variable will store administrator Dress Code from
                                                           // user
                                                           // input
                    System.out.print("Enter Administrator Phone Number: ");
                    String aaphoneNumber = input.nextLine(); // this variable will store administrator Phone Number from
                                                             // user
                                                             // input
                    System.out.print("Enter Administrator Department: ");
                    String aadepartment = input.nextLine(); // this variable will store administrator Department from
                                                            // user
                                                            // input
                    System.out.print("Enter Administrator Qualification: ");
                    String aaqualification = input.nextLine(); // this variable will store administrator Qualification
                                                               // from user input
                    System.out.print("Enter Administrator Salary: ");
                    double aasalary = Double.parseDouble(input.nextLine()); // this variable will store administrator
                                                                            // Salary from user input
                    System.out.print("Enter Administrator Duty Shift: ");
                    String aadayShift = input.nextLine(); // this variable will store administrator Duty Shift from user
                                                          // input
                    System.out.print("Enter Administrator Work Hour: ");
                    int aaworkHour = Integer.parseInt(input.nextLine()); // this variable will store administrator Work
                                                                         // Hour
                                                                         // from user input

                    System.out.print("\nDo you add this record(y/n): ");
                    String cin2 = input.nextLine();
                    if (cin2.equals("y")) { // if user input y thats means user want to add this record to administrator
                                            // array list
                        // I calling add administrator method and pass a administrator object
                        raptor.addAdministrator(new Administrator(aaname, aaage, aagender, aaid, aadressCode,
                                aaphoneNumber, aadepartment, aaqualification, aasalary, aadayShift, aaworkHour));

                        System.out.print("\nSuccessfully added records.");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Add New worker");
                    System.out.println("-------------------");
                    System.out.print("\nEnter worker Name: ");
                    String wname = input.nextLine();
                    System.out.print("Enter worker Age: ");
                    int wage = Integer.parseInt(input.nextLine());
                    System.out.print("Enter worker Gender: ");
                    String wgender = input.nextLine();
                    System.out.print("Enter worker ID: ");
                    int wid = Integer.parseInt(input.nextLine());
                    System.out.print("Enter worker DressCode: ");
                    String wdressCode = input.nextLine();
                    System.out.print("Enter worker Phone Number: ");
                    String wphoneNumber = input.nextLine();
                    System.out.print("Enter worker Salary: ");
                    double wsalary = Double.parseDouble(input.nextLine());
                    System.out.print("Enter worker Duty Shift: ");
                    String wdayShift = input.nextLine();
                    System.out.print("Enter worker Work Hour: ");
                    int wworkHour = Integer.parseInt(input.nextLine());
                    System.out.print("\nDo you add this record(y/n): ");
                    String cin3 = input.nextLine();
                    if (cin3.equals("y")) {
                        raptor.addWorker(new Worker(wname, wage, wgender, wid, wdressCode, wphoneNumber, wsalary,
                                wdayShift, wworkHour));
                        System.out.print("\nSuccessfully added records.");
                    }
                    break;
                default:
                    /**
                     * if user input not match on case then this message will be print
                     */
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
                    /**
                     * if user input not match on case then this message will be print
                     */
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
                    /**
                     * if user input not match on case then this message will be print
                     */
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
                    /**
                     * if user input not match on case then this message will be print
                     */
                    System.out.println("You need to choose Right option");
                    break;
                }
                break;
            /**
             * this section is product management section
             */
            case 5:
                System.out.println("\nSelect your Option: ");
                System.out.println("-----------------------");
                System.out.println("1. Add Product");
                System.out.println("2. Print All Products");
                System.out.println("3. Print Products by Category");
                System.out.println("4. Search Products");
                System.out.println("5. delete product");
                System.out.println("6. back");
                System.out.print("\nEnter Option: ");

                int option5 = input.nextInt();
                if (option5 == 6) {
                    break;
                }
                switch (option5) {
                case 1:
                    raptor.addProduct();
                    break;
                case 2:
                    raptor.printAllProducts(); // this method will be print all product list
                    break;
                case 3:

                    raptor.printProductsByCategory(); // calling this method for search product by category and // print
                                                      // them
                    break;
                case 4:

                    raptor.searchProducts(); // calling Search Product for search
                    break;
                case 5:

                    System.out.print("\nEnter Product ID: ");
                    int pIddel = input.nextInt(); // store Product id
                    raptor.deleteProduct(pIddel); // calling deleteProduct Method and pass product Id
                    break;
                default:
                    /**
                     * if user input not match on case then this message will be print
                     */
                    System.out.println("You need to choose Right option");
                    break;
                }
                break;
            default:
                /**
                 * if user input not match on case then this message will be print
                 */
                System.out.println("You need to choose Right option");
                break;
            }

        }

    }

    /**
     * In this method i Print just ascii symbol for print logo
     */
    private static void logo() {

        System.out.println("  _____                       _____ _                    ");
        System.out.println(" / ____|                     / ____| |                 ");
        System.out.println("| (___  _   _ _ __   ___ _ _| (___ | |__   ___  _ __   ");
        System.out.println(" \\___ \\| | | | '_ \\ / _ \\ '__\\___ \\| '_ \\ / _ \\| '_ \\");
        System.out.println(" ____) | |_| | |_) |  __/ |  ____) | | | | (_) | |_) | ");
        System.out.println("|_____/ \\__,_| .__/ \\___|_| |_____/|_| |_|\\___/| .__/  ");
        System.out.println("           | |                               | |       ");
        System.out.println("           |_|                               |_|       ");
        System.out.println("------------- SuperShop Management System -------------");
        System.out.println("-------------------- @JahidHasanCO --------------------");
        System.out.println("\n");

    }

}