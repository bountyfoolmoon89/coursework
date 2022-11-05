public class Main {
    public static void main(String[] args) {
        printSeparator();
        for (Employee allEmployees : EmployeesBook.employees) {
            System.out.println(allEmployees);
        }
        printSeparator();
        sumSalary();
        printSeparator();
        minSalary();
        printSeparator();
        maxSalary();
        printSeparator();
        midSalary();
        printSeparator();
        printFIO();
        printSeparator();
        indexingSalary();
        printSeparator();
        departmentMinSalary();
        printSeparator();
        departmentMaxSalary();
        printSeparator();
        departmentSumSalary();
        printSeparator();
        departmentMidSalary();
        printSeparator();
        departmentIndexingSalary();
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
    public static void minSalary() {
        float minSalary = 1_000_000_000;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            if (EmployeesBook.employees[i].getSalary() < minSalary) {
                minSalary = EmployeesBook.employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата " + minSalary + " рублей.");
    }
    public static void maxSalary() {
        float maxSalary = -1;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            if (EmployeesBook.employees[i].getSalary() > maxSalary) {
                maxSalary = EmployeesBook.employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary + " рублей.");
    }
    public static void printFIO(){
        for (int i = 0; i < EmployeesBook.employees.length; i++){
            System.out.println(EmployeesBook.employees[i].getFIO());
        }
    }
    public static void indexingSalary(){
        double indexedSalary;
        for (int i = 0; i < EmployeesBook.employees.length; i++){
            indexedSalary = EmployeesBook.employees[i].getSalary() * 1.2;
            System.out.println("Новая зарплата у "+ EmployeesBook.employees[i].getFIO() + ": " + indexedSalary);
        }
    }
    public static void departmentMinSalary() {
        float minSalary = 1_000_000_001;
        int department = 1;
        for (int i = 0; i < EmployeesBook.employees.length; i++){
            if (EmployeesBook.employees[i].getDepartment() == department){
                if (EmployeesBook.employees[i].getSalary() < minSalary) {
                minSalary = EmployeesBook.employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе " + department + " = " + minSalary);
    }
    public static void departmentMaxSalary(){
        float maxSalary = -1;
        int department = 2;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            if (EmployeesBook.employees[i].getDepartment() == department) {
                if (EmployeesBook.employees[i].getSalary() > maxSalary) {
                    maxSalary = EmployeesBook.employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе " + department + " = " + maxSalary);
    }
    public static void departmentSumSalary(){
        float sum = 0;
        int department = 3;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            if (EmployeesBook.employees[i].getDepartment() == department) {
                sum = sum + EmployeesBook.employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты отдела " + department + " в месяц: " + sum);
    }
    public static void departmentMidSalary(){
        float sum = 0;
        float mid = 0;
        int department = 3;
        for (int i = 0; i < EmployeesBook.employees.length; i++) {
            if (EmployeesBook.employees[i].getDepartment() == department) {
                sum = sum + EmployeesBook.employees[i].getSalary();
                mid = sum / Employee.filterByDepartment(department).length;
            }
        }
        System.out.println("Средняя зарплата в отделе " + department + " = " + mid);
    }
    public static void departmentIndexingSalary(){
        double indexedSalary;
        int department = 5;
        for (int i = 0; i < EmployeesBook.employees.length; i++){
            if (EmployeesBook.employees[i].getDepartment() == department) {
                indexedSalary = EmployeesBook.employees[i].getSalary() * 1.2;
                System.out.println("Новая зарплата у " + EmployeesBook.employees[i].getFIO() + ": " + indexedSalary);
            }
        }
    }

}