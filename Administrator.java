import ModelClass.Manager;

/**
 * in this class i extend from Manager
 */
public class Administrator extends Manager {

    private double Salary;
    private String DayShift;
    private int WorkHour;

    /**
     * this is param constractor for ini value salary, day shift , workHour came
     * from this class and others came from super class
     * 
     * @param name
     * @param age
     * @param gender
     * @param id
     * @param dressCode
     * @param phoneNumber
     * @param department
     * @param qualification
     * @param salary
     * @param dayShift
     * @param workHour
     */
    public Administrator(String name, int age, String gender, int id, String dressCode, String phoneNumber,
            String department, String qualification, double salary, String dayShift, int workHour) {
        super(name, age, gender, id, dressCode, phoneNumber, department, qualification);
        Salary = salary;
        DayShift = dayShift;
        WorkHour = workHour;
    }

    /**
     * this is getter method by using this method we get salary
     * 
     * @return
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * this is setter method by using this method we can set salary and update
     * salary
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        Salary = salary;
    }

    /**
     * this is getter metho of day shift and we can gat day shift value by using
     * this method.
     * 
     * @return
     */
    public String getDayShift() {
        return DayShift;
    }

    /**
     * this is setter method of day Shift we can set/update our day shift member
     * value
     * 
     * @param dayShift
     */
    public void setDayShift(String dayShift) {
        DayShift = dayShift;
    }

    /**
     * this is getter method of workHour.
     * 
     * @return
     */
    public int getWorkHour() {
        return WorkHour;
    }

    /**
     * this is setter method of wokHour
     * 
     * @param workHour
     */
    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

    /**
     * by using this mwthod we can print Administrator details
     */
    public void displayAdministrator() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Id: " + getId());
        System.out.println("DressCode: " + getDressCode());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Department: " + getDepartment());
        System.out.println("Qualification: " + getQualification());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Day Shift: " + getDayShift());
        System.out.println("Work Hour: " + getWorkHour());
    }
}
