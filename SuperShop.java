import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ModelClass.Product;

public class SuperShop {

    private String shopName;
    private String shopPlace;
    private String contract;

    /**
     * create scanner object for user input
     */
    Scanner input = new Scanner(System.in);

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

            for (int i = 0; i < getAdministrators().size(); i++) {
                System.out.println("\n------------------------------------");
                System.out.println("            Administrators Details             ");
                System.out.println("--------------------------------------\n");

                getAdministrators().get(i).displayAdministrator();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search administrator and print
     * 
     * @param ID
     */
    public void searchAdmintrator(int ID) {
        try {

            for (int i = 0; i < getAdministrators().size(); i++) {
                if (getAdministrators().get(i).getId() == ID) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("        Find Admintrator Details         ");
                    System.out.println("-------------------------------------\n");

                    getAdministrators().get(i).displayAdministrator();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

    /**
     * this method will delete administrator
     * 
     * @param ID
     */
    public void deleteAdmintrator(int ID) {
        try {

            for (int i = 0; i < getAdministrators().size(); i++) {
                if (getAdministrators().get(i).getId() == ID) {

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

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

    /**
     * this method will print all worker list
     */
    public void printAllWorkers() {

        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Worker Details             ");
                System.out.println("-------------------------------------\n");

                getWorkers().get(i).displayWorkers();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search worker
     * 
     * @param ID
     */
    public void searchWorkers(int ID) {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                if (getWorkers().get(i).getId() == ID) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Workers Details            ");
                    System.out.println("-------------------------------------\n");

                    getWorkers().get(i).displayWorkers();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

    /**
     * this method will delete worker record
     * 
     * @param ID
     */
    public void deleteWorkers(int ID) {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                if (getWorkers().get(i).getId() == ID) {

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
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
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
        accountants.add(accountant);
    }

    /**
     * this method will print all accountant list
     */
    public void printAllAccountants() {
        try {

            for (int i = 0; i < getAccountants().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Accountants Details             ");
                System.out.println("-------------------------------------\n");

                getAccountants().get(i).displayAccountant();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will search and print accountant
     * 
     * @param ID
     */
    public void searchAccountant(int ID) {
        try {

            for (int i = 0; i < getAccountants().size(); i++) {
                if (getAccountants().get(i).getId() == ID) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Accountant Details            ");
                    System.out.println("-------------------------------------\n");

                    getAccountants().get(i).displayAccountant();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

    /**
     * this method will delete accountant
     * 
     * @param ID
     */
    public void deleteAccountant(int ID) {
        try {

            for (int i = 0; i < getAccountants().size(); i++) {
                if (getAccountants().get(i).getId() == ID) {

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
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
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
            for (int i = 0; i < getOwners().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Owners Details             ");
                System.out.println("-------------------------------------\n");

                getOwners().get(i).displayOwners();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method will be search owner records
     * 
     * @param Name
     */
    public void searchOwners(String Name) {
        try {

            for (int i = 0; i < getOwners().size(); i++) {
                if (getOwners().get(i).getName().toString().trim().equalsIgnoreCase(Name)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Find Owner Details            ");
                    System.out.println("-------------------------------------\n");

                    getOwners().get(i).displayOwners();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
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

            for (int i = 0; i < getProducts().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("          Product Details            ");
                System.out.println("-------------------------------------\n");

                getProducts().get(i).displayItem();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    }

    /**
     * this method will print products by category
     * 
     * @param Category
     */
    public void printProductsByCategory() {
        System.out.print("\nEnter Category: ");
        String Cate = input.nextLine(); // Store category
        try {

            for (int i = 0; i < getProducts().size(); i++) {

                if (getProducts().get(i).getCategory().toString().trim().equalsIgnoreCase(Cate)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("          Product Details            ");
                    System.out.println("-------------------------------------\n");

                    getProducts().get(i).displayItem();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
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

            for (int i = 0; i < getProducts().size(); i++) {

                if (getProducts().get(i).getName().toString().trim().equalsIgnoreCase(pName)) {

                    System.out.println("\n-------------------------------------");
                    System.out.println("         Search Product Details            ");
                    System.out.println("-------------------------------------\n");

                    getProducts().get(i).displayItem();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    }

    /**
     * this method will delete products
     * 
     * @param id
     */
    public void deleteProduct(int id) {
        try {

            for (int i = 0; i < getProducts().size(); i++) {

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

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
    }

    public void addProduct() {
        String pn, pc;
        int pi;
        double pp;
        System.out.print("Enter Product Name: ");
        pn = input.nextLine();
        System.out.print("Enter Product ID: ");
        pi = Integer.parseInt(input.nextLine());
        System.out.print("Enter Product Category: ");
        pc = input.nextLine();
        System.out.print("Enter Product Price: ");
        pp = Double.parseDouble(input.nextLine());
        System.out.print("\n\nDo you add product(y/n): ");
        String c5 = input.next();
        /**
         * if user enter y thats mean user want to add product then this condition will
         * be called
         */
        if (c5.equals("y")) {
            addProduct(new Product(pn, pi, pp, pc));
            System.out.println("\nSuccessfully Added Product\n");
        }
    }
}
