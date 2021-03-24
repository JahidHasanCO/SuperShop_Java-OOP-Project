import java.util.ArrayList;
import java.util.List;

public class SuperShop {

    private String shopName;
    private String shopPlace;
    private String contract;

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
    }

    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void addAdministrators(Administrator administrator) {
        administrators.add(administrator);
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void addWorkers(Worker worker) {
        workers.add(worker);
    }

    public void printAllAdministrators() {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n------------------------------------");
                System.out.println("            Administrators Details             ");
                System.out.println("--------------------------------------\n");
                System.out.println("Name: " + getAdministrators().get(i).getName());
                System.out.println("ID: " + getAdministrators().get(i).getId());
                System.out.println("Age: " + getAdministrators().get(i).getAge());
                System.out.println("Gender: " + getAdministrators().get(i).getGender());
                System.out.println("Qualifications: " + getAdministrators().get(i).getQualification());
                System.out.println("Department: " + getAdministrators().get(i).getDepartment());
                System.out.println("Phone Number" + getAdministrators().get(i).getPhoneNumber());
                System.out.println("Salary: $" + getAdministrators().get(i).getSalary());
                System.out.println("Work Hour: " + getAdministrators().get(i).getWorkHour());

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
                System.out.println("Name: " + getWorkers().get(i).getName());
                System.out.println("ID: " + getWorkers().get(i).getId());
                System.out.println("Age: " + getWorkers().get(i).getAge());
                System.out.println("Gender: " + getWorkers().get(i).getGender());
                System.out.println("Phone Number" + getWorkers().get(i).getPhoneNumber());
                System.out.println("Salary: $" + getWorkers().get(i).getSalary());
                System.out.println("Work Hour: " + getWorkers().get(i).getWorkHour());
                System.out.println("Shift: " + getWorkers().get(i).getDutyShift());
                System.out.println("DressCode: " + getWorkers().get(i).getDressCode());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Accountant> getAccountants() {
        return accountants;
    }

    public void addAccountants(Accountant accountant) {
        accountants.add(accountant);
    }

    public void printAllAccountants() {
        try {

            for (int i = 0; i < getWorkers().size(); i++) {
                System.out.println("\n-------------------------------------");
                System.out.println("            Accountants Details             ");
                System.out.println("-------------------------------------\n");
                System.out.println("Name: " + getAccountants().get(i).getName());
                System.out.println("ID: " + getAccountants().get(i).getId());
                System.out.println("Age: " + getAccountants().get(i).getAge());
                System.out.println("Gender: " + getAccountants().get(i).getGender());
                System.out.println("Qualifications: " + getAccountants().get(i).getQualification());
                System.out.println("Department: " + getAccountants().get(i).getDepartment());
                System.out.println("Phone Number" + getAccountants().get(i).getPhoneNumber());
                System.out.println("Salary: $" + getAccountants().get(i).getSalary());
                System.out.println("Work Hour: " + getAccountants().get(i).getWorkHour());

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
