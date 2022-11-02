public class Main {
    public static void main(String[] args) {
        for (Employee allEmployees : EmployeesBook.employees) {
            System.out.println(allEmployees);
        }
        printSeparator();
        EmployeesBook.sumSalary();
        printSeparator();
        EmployeesBook.midSalary();
        printSeparator();
        EmployeesBook.minMaxSalary();
    }
    public static void printSeparator() {
        System.out.println("----------------------------------------------------------------------------");
    }
}