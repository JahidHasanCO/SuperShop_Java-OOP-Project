import java.util.ArrayList;
import java.util.List;

public class SuperShop {

    private String shopName;
    private String shopPlace;
    private String contract;

    private List<Administrator> administrators;
    private List<Worker> workers;

    public SuperShop(String shopName, String shopPlace, String contract) {
        this.shopName = shopName;
        this.shopPlace = shopPlace;
        this.contract = contract;
        this.administrators = new ArrayList<>();
        this.workers = new ArrayList<>();
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
                System.out.println("Salary: " + getWorkers().get(i).getSalary());
                System.out.println("Work Hour: " + getWorkers().get(i).getWorkHour());
                System.out.println("Shift: " + getWorkers().get(i).getDutyShift());
                System.out.println("DressCode: " + getWorkers().get(i).getDressCode());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
