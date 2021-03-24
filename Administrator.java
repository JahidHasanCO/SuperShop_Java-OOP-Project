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

}
