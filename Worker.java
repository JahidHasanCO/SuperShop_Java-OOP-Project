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

}
