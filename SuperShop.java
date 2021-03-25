import java.util.ArrayList;
import java.util.List;

public class SuperShop {

    private String shopName;
    private String shopPlace;
    private String contract;

    private List<Owner> owners;
    private List<Administrator> administrators;
    private List<Accountant> accountants;
    private List<Worker> workers;

    public SuperShop(String shopName, String shopPlace, String contract) {
        this.shopName = shopName;
        this.shopPlace = shopPlace;
        this.contract = contract;
        administrators = new ArrayList<>();
        workers = new ArrayList<>();
        accountants = new ArrayList<>();
        owners = new ArrayList<>();
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

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n------------------------------------");
                System.out.println("            Administrators Details             ");
                System.out.println("--------------------------------------\n");

                getAdministrators().get(i).displayAdministrator();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public List<Accountant> getAccountants() {
        return accountants;
    }

    public void addAccountant(Accountant accountant) {
        accountants.add(accountant);
    }

    public void printAllAccountants() {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Accountants Details             ");
                System.out.println("-------------------------------------\n");

                getAccountants().get(i).displayAccountant();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            for (int i = 0; i < owners.size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Owners Details             ");
                System.out.println("-------------------------------------\n");

                getOwners().get(i).displayOwners();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
