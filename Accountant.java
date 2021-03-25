import ModelClass.Manager;

public class Accountant extends Manager {

    private double Salary;
    private String DayShift;
    private int WorkHour;

    /**
     * this is param constractor of Accountant class and this canstractor has those
     * parameter
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
    public Accountant(String name, int age, String gender, int id, String dressCode, String phoneNumber,
            String department, String qualification, double salary, String dayShift, int workHour) {
        super(name, age, gender, id, dressCode, phoneNumber, department, qualification);
        Salary = salary;
        DayShift = dayShift;
        WorkHour = workHour;
    }

    /**
     * this is getter method of salary
     * 
     * @return
     */
    public double getSalary() {
        return Salary;
    }

    /***
     * this is setter method of salary
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        Salary = salary;
    }

    /**
     * this is getter method of Day Shift
     * 
     * @return
     */
    public String getDayShift() {
        return DayShift;
    }

    /**
     * this is setter method of day shift
     * 
     * @param dayShift
     */
    public void setDayShift(String dayShift) {
        DayShift = dayShift;
    }

    /**
     * this is getter mathod of work hour
     * 
     * @return
     */
    public int getWorkHour() {
        return WorkHour;
    }

    /**
     * this is setter method of work hour
     * 
     * @param workHour
     */
    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

    /**
     * this is display method . this method print all details of Accountant
     */
    public void displayAccountant() {
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
