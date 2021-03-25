package ModelClass;

public class Employee extends Person {

    private int id;
    private String dressCode;
    private String phoneNumber;

    public Employee(String name, int age, String gender, int id, String dressCode, String phoneNumber) {
        super(name, age, gender);
        this.id = id;
        this.dressCode = dressCode;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
