public class Employee {
    private final String FIO;
    private int department;
    private static float salary;
    private static int id = 100000;

    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return department;
    }

    public static float getSalary() {
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

    public Employee(String fio, int department, float salary){
        this.FIO = fio;
        this.department = department;
        Employee.salary = salary;
    }
    @Override
    public String toString() {
        id++;
        return "ID: " + id + " ФИО: " + FIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
