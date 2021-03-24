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

}
