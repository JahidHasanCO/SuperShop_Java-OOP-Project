import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ModelClass.Product;

public class SuperShop {

    private String shopName;
    private String shopPlace;
    private String contract;

    Scanner input = new Scanner(System.in);

    private List<Owner> owners;
    private List<Administrator> administrators;
    private List<Accountant> accountants;
    private List<Worker> workers;

    private List<Product> products;

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

    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void addAdministrator(Administrator administrator) {
        administrators.add(administrator);
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

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

    public List<Accountant> getAccountants() {
        return accountants;
    }

    public void addAccountant(Accountant accountant) {
        accountants.add(accountant);
    }

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

    public List<Owner> getOwners() {
        return owners;
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

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

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

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

    public void printProductsByCategory(String Category) {
        try {

            for (int i = 0; i < getProducts().size(); i++) {

                if (getProducts().get(i).getCategory().toString().trim().equalsIgnoreCase(Category)) {

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

    public void searchProducts(String name) {
        try {

            for (int i = 0; i < getProducts().size(); i++) {

                if (getProducts().get(i).getName().toString().trim().equalsIgnoreCase(name)) {

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
}
