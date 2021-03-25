package ModelClass;

public class Manager extends Employee {

    private String Department;
    private String qualification;

    /**
     * this is manager class constractor this constractor is param constractor
     * 
     * @param name
     * @param age
     * @param gender
     * @param id
     * @param dressCode
     * @param phoneNumber
     * @param department
     * @param qualification
     */
    public Manager(String name, int age, String gender, int id, String dressCode, String phoneNumber, String department,
            String qualification) {
        super(name, age, gender, id, dressCode, phoneNumber);
        Department = department;
        this.qualification = qualification;
    }

    /**
     * this is getter metho of department veiable
     * 
     * @return
     */
    public String getDepartment() {
        return Department;
    }

    /**
     * this is setter method of derpartment veriable
     * 
     * @param department
     */
    public void setDepartment(String department) {
        Department = department;
    }

    /**
     * this is getter method of qualification veriable
     * 
     * @return
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * this is setter method of qualification veriable
     * 
     * @param qualification
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
