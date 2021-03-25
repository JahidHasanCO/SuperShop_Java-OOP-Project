package ModelClass;

public class Manager extends Employee {

    private String Department;
    private String qualification;

    public Manager(String name, int age, String gender, int id, String dressCode, String phoneNumber, String department,
            String qualification) {
        super(name, age, gender, id, dressCode, phoneNumber);
        Department = department;
        this.qualification = qualification;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
