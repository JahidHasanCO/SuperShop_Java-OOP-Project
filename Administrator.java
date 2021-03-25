import ModelClass.Manager;

public class Administrator extends Manager {

    private double Salary;
    private String DayShift;
    private int WorkHour;

    public Administrator(String name, int age, String gender, int id, String dressCode, String phoneNumber,
            String department, String qualification, double salary, String dayShift, int workHour) {
        super(name, age, gender, id, dressCode, phoneNumber, department, qualification);
        Salary = salary;
        DayShift = dayShift;
        WorkHour = workHour;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDayShift() {
        return DayShift;
    }

    public void setDayShift(String dayShift) {
        DayShift = dayShift;
    }

    public int getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

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
