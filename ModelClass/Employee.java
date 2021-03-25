package ModelClass;

public class Employee extends Person {

    private int id;
    private String dressCode;
    private String phoneNumber;

    /**
     * this is param constractor of Employee class
     * 
     * @param name
     * @param age
     * @param gender
     * @param id
     * @param dressCode
     * @param phoneNumber
     */
    public Employee(String name, int age, String gender, int id, String dressCode, String phoneNumber) {
        super(name, age, gender);
        this.id = id;
        this.dressCode = dressCode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * this is getter method of ID
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * this is setter method of id
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * this is gettermethod of Dresscode
     * 
     * @return
     */
    public String getDressCode() {
        return dressCode;
    }

    /**
     * this is setter method of DressCode
     * 
     * @param dressCode
     */
    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    /**
     * this is Getter method of Phone nUmber
     * 
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * this is Setter method of Phone Number
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
