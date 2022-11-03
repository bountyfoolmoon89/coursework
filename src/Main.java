public class Main {
    public static void main(String[] args) {
        printSeparator();
        for (Employee allEmployees : EmployeesBook.employees) {
            System.out.println(allEmployees);
        }
        printSeparator();
        sumSalary();
        printSeparator();
        midSalary();
        printSeparator();
        minMaxSalary();
        printSeparator();
        printFIO();
        printSeparator();
    }
    public static void printSeparator() {
        System.out.println("----------------------------------------------------------------------------");
    }
    public static void sumSalary(){
        float sum = 0;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            sum = sum + EmployeesBook.employees[i].getSalary();
        }
        System.out.println("Сумма затрат на все зарплаты в месяц: " + sum);
    }
    public static void midSalary(){
        float sum = 0;
        double mid = 0;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            sum = sum + EmployeesBook.employees[i].getSalary();
            mid = sum / EmployeesBook.employees.length;
        }
        System.out.println("Средняя зарплата: " + mid);
    }
    public static void minMaxSalary() {
        float maxSalary = -1;
        float minSalary = 1_000_000_000;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            if (EmployeesBook.employees[i].getSalary() > maxSalary) {
                maxSalary = EmployeesBook.employees[i].getSalary();
            }
            if (EmployeesBook.employees[i].getSalary() < minSalary) {
                minSalary = EmployeesBook.employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата " + minSalary + " рублей. Максимальная зарплата " + maxSalary + " рублей");
    }
    public static void printFIO(){
        for (int i = 0; i < EmployeesBook.employees.length; i++){
            System.out.println(EmployeesBook.employees[i].getFIO());
        }
    }
}