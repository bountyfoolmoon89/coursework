public class Employee {
    private String FIO;
    private int department;
    private float salary;
    private static int id = 100000;
    public int countEmployers = 0;

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

    public int getCountEmployers() {
        return countEmployers;
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
        this.salary = salary;

    }
    @Override
    public String toString() {
        id++;
        countEmployers++;
        return "ID: " + id + " ФИО: " + FIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
