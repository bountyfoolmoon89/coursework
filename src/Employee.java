import java.util.Arrays;

public class Employee {
    private final String FIO;
    private int department;
    private float salary;
    private static int id = 100000;

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
        return Arrays.stream(EmployeesBook.employees).filter(x -> (x != null) && (x.getDepartment() == department)).toArray(Employee[]::new);

    }

    public Employee(String fio, int department, float salary){
        this.FIO = fio;
        this.department = department;
        this.salary = salary;
    }
    public void idCounter(){
        synchronized (EmployeesBook.employees){
            id++;
        }
    }
    @Override
    public String toString() {
        idCounter();
        return "ID: " + id + " ФИО: " + FIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
