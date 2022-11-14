import java.util.Arrays;

public class Employee {
    private final String FIO;
    private int department;
    private float salary;
    public static int id;
    public static int counter = 0;

    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static Employee[] filterByDepartment(int department){
        return Arrays.stream(Main.employees).filter(x -> (x != null) && (x.getDepartment() == department)).toArray(Employee[]::new);
    }
    public Employee(String fio, int department, float salary){
        this.FIO = fio;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        id++;
        return "ID: " + id + " ФИО: " + FIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
