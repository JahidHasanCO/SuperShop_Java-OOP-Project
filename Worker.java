import ModelClass.Employee;

public class Worker extends Employee {

    private double Salary;
    private String DutyShift;
    private int WorkHour;

    public Worker(String name, int age, String gender, int id, String dressCode, String phoneNumber, double salary,
            String dutyShift, int workHour) {
        super(name, age, gender, id, dressCode, phoneNumber);
        Salary = salary;
        DutyShift = dutyShift;
        WorkHour = workHour;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDutyShift() {
        return DutyShift;
    }

    public void setDutyShift(String dutyShift) {
        DutyShift = dutyShift;
    }

    public int getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

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
