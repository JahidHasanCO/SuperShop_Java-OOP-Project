import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ModelClass.Product;

public class SuperShop {

    private String shopName; // this variable will be store shop name
    private String shopPlace; // this variable will be store shop address
    private String contract; // this variable will be store shop contract number

    /**
     * create scanner object for user input
     */
    Scanner input = new Scanner(System.in); // I created this scanner object for getting value from user

    /**
     * create array list of Owner, Adminisrator, Accountant, Worker and product
     */
    private List<Owner> owners;
    private List<Administrator> administrators;
    private List<Accountant> accountants;
    private List<Worker> workers;

    private List<Product> products;

    /**
     * Create param constractor
     * 
     * @param shopName
     * @param shopPlace
     * @param contract
     */
    public SuperShop(String shopName, String shopPlace, String contract) {
        this.shopName = shopName;
        this.shopPlace = shopPlace;
        this.contract = contract;
        /**
         * now i initilize all the array list and allocate with memory
         */
        administrators = new ArrayList<>();
        workers = new ArrayList<>();
        accountants = new ArrayList<>();
        owners = new ArrayList<>();
        products = new ArrayList<>();
    }

    /**
     * this is getter method of Administrator
     * 
     * @return
     */
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    /**
     * this is add administrator method
     */
    public void addAdministrator(Administrator administrator) {
        administrators.add(administrator);
    }

    /**
     * this is getter method of worker
     */
    public List<Worker> getWorkers() {
        return workers;
    }

    /**
     * this is add method of worker
     * 
     * @param worker
     */
    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    /**
     * this method will print all administrator list
     */
    public void printAllAdministrators() {
        try {

            for (int i = 0; i < getAdministrators().size(); i++) { // this loop will be traverse all index of arraylist
                                                                   // from 0 to arraylist size.
                System.out.println("\n------------------------------------");
                System.out.println("            Administrators Details             ");
                System.out.println("--------------------------------------\n");

                getAdministrators().get(i).displayAdministrator(); // i call getter method of administrator and pass
                                                                   // index in get method and calling
                                                                   // displayAdministrator method by every index
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search administrator and print
     * 
     * @param id
     */
    public void searchAdmintrator(int id) {
        try {

            for (int i = 0; i < getAdministrators().size(); i++) { // this loop will be traverse all index of arraylist
                                                                   // from 0 to arraylist size.
                if (getAdministrators().get(i).getId() == id) { // this condition will be check addminisrator id and
                                                                // user input of id match or not... and this condition
                                                                // will be repeatly calling with loop

                    System.out.println("\n-------------------------------------");
                    System.out.println("        Find Admintrator Details         ");
                    System.out.println("-------------------------------------\n");

                    getAdministrators().get(i).displayAdministrator();
                }
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this method will delete administrator
     * 
     * @param id
     */
    public void deleteAdmintrator(int id) {
        try {

            for (int i = 0; i < getAdministrators().size(); i++) { // this loop will be traverse all index of arraylist
                                                                   // from 0 to arraylist size.
                if (getAdministrators().get(i).getId() == id) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("        Delete Admintrator            ");
                    System.out.println("-------------------------------------\n");
                    getAdministrators().get(i).displayAdministrator();

                    System.out.println("Do you delete this records(y/n)?");
                    String c = input.next();
                    if (c.equals("y")) {
                        getAdministrators().remove(i);
                        break;
                    }

                }
            }

        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this method will print all worker list
     */
    public void printAllWorkers() {

        try {

            for (int i = 0; i < getWorkers().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                            // to arraylist size.
                System.out.println("\n-------------------------------------");
                System.out.println("            Worker Details             ");
                System.out.println("-------------------------------------\n");

                getWorkers().get(i).displayWorkers();
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search worker
     * 
     * @param id
     */
    public void searchWorkers(int id) {
        try {

            for (int i = 0; i < getWorkers().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                            // to arraylist size.
                if (getWorkers().get(i).getId() == id) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Workers Details            ");
                    System.out.println("-------------------------------------\n");

                    getWorkers().get(i).displayWorkers();
                }
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this method will delete worker record
     * 
     * @param id
     */
    public void deleteWorkers(int id) {
        try {

            for (int i = 0; i < getWorkers().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                            // to arraylist size.
                if (getWorkers().get(i).getId() == id) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Delete Workers           ");
                    System.out.println("-------------------------------------\n");

                    getWorkers().get(i).displayWorkers();

                    System.out.println("Do you delete this records(y/n)?");
                    String c = input.next();
                    if (c.equals("y")) {
                        getWorkers().remove(i);
                        break;
                    }
                }
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this is getter method of accountant
     * 
     * @return
     */
    public List<Accountant> getAccountants() {
        return accountants;
    }

    /**
     * this is add accountant method
     * 
     * @param accountant
     */
    public void addAccountant(Accountant accountant) {
        accountants.add(accountant); // user pass a accountant object when calling this method and we pass this
                                     // accountant object to our array list by calling add Accountant method
    }

    /**
     * this method will print all accountant list
     */
    public void printAllAccountants() {
        try {

            for (int i = 0; i < getAccountants().size(); i++) { // this loop will be traverse all index of arraylist
                                                                // from 0 to arraylist size.
                System.out.println("\n-------------------------------------");
                System.out.println("            Accountants Details             ");
                System.out.println("-------------------------------------\n");

                getAccountants().get(i).displayAccountant();
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search and print accountant
     * 
     * @param id
     */
    public void searchAccountant(int id) {
        try {

            for (int i = 0; i < getAccountants().size(); i++) { // this loop will be traverse all index of arraylist
                                                                // from 0 to arraylist size.
                if (getAccountants().get(i).getId() == id) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Accountant Details            ");
                    System.out.println("-------------------------------------\n");

                    getAccountants().get(i).displayAccountant();
                }
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this method will delete accountant
     * 
     * @param id
     */
    public void deleteAccountant(int id) {
        try {

            for (int i = 0; i < getAccountants().size(); i++) { // this loop will be traverse all index of arraylist
                                                                // from 0 to arraylist size.
                if (getAccountants().get(i).getId() == id) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          delete Accountant            ");
                    System.out.println("-------------------------------------\n");

                    getAccountants().get(i).displayAccountant();

                    System.out.println("Do you delete this records(y/n)?");
                    String c = input.next();
                    if (c.equals("y")) {
                        getAccountants().remove(i);
                        break;
                    }
                }
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this is getter method of owner
     * 
     * @return
     */
    public List<Owner> getOwners() {
        return owners;
    }

    /**
     * this method will be add owner
     * 
     * @param owner
     */
    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    /**
     * this method will print all owner list
     */
    public void printAllOwners() {
        try {
            for (int i = 0; i < getOwners().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                           // to arraylist size.
                System.out.println("\n-------------------------------------");
                System.out.println("            Owners Details             ");
                System.out.println("-------------------------------------\n");

                getOwners().get(i).displayOwners();
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will be search owner records
     * 
     * @param Name
     */
    public void searchOwners(String name) {
        try {

            for (int i = 0; i < getOwners().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                           // to arraylist size.
                if (getOwners().get(i).getName().trim().equalsIgnoreCase(name)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Owner Details            ");
                    System.out.println("-------------------------------------\n");

                    getOwners().get(i).displayOwners();
                }
            }
        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }

    }

    /**
     * this is getter method of product
     * 
     * @return
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * this method will add product
     * 
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * this method will print all products
     */
    public void printAllProducts() {
        try {

            for (int i = 0; i < getProducts().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                             // to arraylist size.
                System.out.println("\n-------------------------------------");
                System.out.println("          Product Details            ");
                System.out.println("-------------------------------------\n");

                getProducts().get(i).displayItem();
            }

        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will print products by category
     * 
     * @param Category
     */
    public void printProductsByCategory() {
        System.out.print("\nEnter Category: ");
        String category = input.nextLine(); // Store category
        try {

            for (int i = 0; i < getProducts().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                             // to arraylist size.

                if (getProducts().get(i).getCategory().trim().equalsIgnoreCase(category)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Product Details            ");
                    System.out.println("-------------------------------------\n");

                    getProducts().get(i).displayItem();
                }
            }

        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search products
     * 
     * @param name
     */
    public void searchProducts() {
        System.out.print("\nEnter Product name: ");
        String pName = input.nextLine();
        try {

            for (int i = 0; i < getProducts().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                             // to arraylist size.

                if (getProducts().get(i).getName().trim().equalsIgnoreCase(pName)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("         Search Product Details            ");
                    System.out.println("-------------------------------------\n");

                    getProducts().get(i).displayItem();
                }
            }

        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will delete products
     * 
     * @param id
     */
    public void deleteProduct(int id) {
        try {

            for (int i = 0; i < getProducts().size(); i++) { // this loop will be traverse all index of arraylist from 0
                                                             // to arraylist size.

                if (getProducts().get(i).getProductId() == id) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("            Delete Product          ");
                    System.out.println("-------------------------------------\n");

                    getProducts().get(i).displayItem();
                    System.out.println("Do you delete this Product(y/n)?");
                    String c = input.next();
                    if (c.equals("y")) {
                        getProducts().remove(i);
                        break;
                    }
                }
            }

        } catch (Exception e) { // if program failure to get data from arraylist then this section will be
                                // exicutive
            System.out.println(e.getMessage());
        }
    }

    public void addProduct() {
        /**
         * i created some variables for store product information
         */
        String pn;
        String pc;
        int pi;
        double pp;

        System.out.print("Enter Product Name: ");
        pn = input.nextLine(); // getting product name from user input and store in pn
        System.out.print("Enter Product ID: ");
        pi = Integer.parseInt(input.nextLine()); // getting product ID from user input and store in pi
        System.out.print("Enter Product Category: ");
        pc = input.nextLine(); // getting product Category from user input and store in pc
        System.out.print("Enter Product Price: ");
        pp = Double.parseDouble(input.nextLine()); // getting product price from user input and store in pp
        System.out.print("\n\nDo you add product(y/n): ");
        String c5 = input.next(); // i create this variable and this will be get user decision . if user cannot to
                                  // add product then he/she can cancel this operation by using this input
        /**
         * if user enter y thats mean user want to add product then this condition will
         * be called
         */
        if (c5.equals("y")) { // if user press y thats means user want to add product then this condition will
                              // be true
            addProduct(new Product(pn, pi, pp, pc)); // calling addProduct method and pass a product object
            System.out.println("\nSuccessfully Added Product\n");
        }
    }

    /**
     * this method will print details of shop
     * 
     */
    public void displayShop() {
        /**
         * print all member variable of shop
         */
        System.out.println("\nShop Name: " + shopName + "\nShop Place: " + shopPlace + "\nContract: " + contract);
    }
}
