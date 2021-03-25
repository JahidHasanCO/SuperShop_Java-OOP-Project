import ModelClass.Employee;

public class Worker extends Employee {

    private double Salary;
    private String DutyShift;
    private int WorkHour;

    /**
     * this is param constractor of Worker Class
     * 
     * @param name
     * @param age
     * @param gender
     * @param id
     * @param dressCode
     * @param phoneNumber
     * @param salary
     * @param dutyShift
     * @param workHour
     */
    public Worker(String name, int age, String gender, int id, String dressCode, String phoneNumber, double salary,
            String dutyShift, int workHour) {
        super(name, age, gender, id, dressCode, phoneNumber);
        Salary = salary;
        DutyShift = dutyShift;
        WorkHour = workHour;
    }

    /**
     * this is getter mathod of salary
     * 
     * @return
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * this is setter method of salary
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        Salary = salary;
    }

    /**
     * this is getter method of duty Shift
     * 
     * @return
     */
    public String getDutyShift() {
        return DutyShift;
    }

    /**
     * this is setter method of duty shift
     * 
     * @param dutyShift
     */
    public void setDutyShift(String dutyShift) {
        DutyShift = dutyShift;
    }

    /**
     * this is getter method of work hour
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
     * this method will print all details of worker
     */
    public void displayWorkers() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Id: " + getId());
        System.out.println("DressCode: " + getDressCode());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Day Shift: " + getDutyShift());
        System.out.println("Work Hour: " + getWorkHour());
    }
}
