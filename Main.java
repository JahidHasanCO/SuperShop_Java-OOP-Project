import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SuperShop raptor = new SuperShop("Raptor", "khagan, Ashulia, Savar", "01773393608");

        Worker w = new Worker("Jahid Hasan", 20, "Male", 201, "F", "010000000", 200.30, "day", 8);
        Worker w1 = new Worker("Hasib", 20, "Male", 201, "Fo", "0100000001", 200.30, "day", 8);
        Worker w2 = new Worker("nirob", 20, "Male", 201, "For", "0100000002", 200.30, "day", 8);
        Worker w3 = new Worker("payel", 20, "Female", 201, "Form", "0100000003", 200.30, "day", 8);
        Worker w4 = new Worker("likhn", 20, "Male", 201, "Forma", "0100000004", 200.30, "day", 8);
        Worker w5 = new Worker("badol", 20, "Male", 201, "Formal", "0100000005", 200.30, "day", 8);

        raptor.addWorkers(w);
        raptor.addWorkers(w1);
        raptor.addWorkers(w2);
        raptor.addWorkers(w3);
        raptor.addWorkers(w4);
        raptor.addWorkers(w5);

        try {
            for (int i = 0; i < raptor.getWorkers().size(); i++) {
                System.out.println(raptor.getWorkers().get(i).getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
