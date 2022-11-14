public class Main {
    public static void main(String[] args) {

        printSeparator();
        printAllEmployees();
        printSeparator();
        sumMidSalary();
        printSeparator();
        minSalary();
        printSeparator();
        maxSalary();
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
        printDepartment();
        printSeparator();
        lessThanNumber();
        printSeparator();
        moreThanNumber();
        printSeparator();
    }
    public static void printSeparator() {
        System.out.println("----------------------------------------------------------------------------");
    }
    public static void printAllEmployees(){
        for (Employee allEmployees : employees) {
            System.out.println(allEmployees);
        }
    }
    public static float sumSalary(){
        float sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static void sumMidSalary(){
        double mid;
        mid = sumSalary() / employees.length;
        System.out.println("Сумма затрат на зарплаты:" + sumSalary());
        printSeparator();
        System.out.println("Средняя зарплата: " + mid);
    }
    public static void minSalary() {
        float minSalary = 1_000_000_000;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата " + minSalary + " рублей.");
    }
    public static void maxSalary() {
        float maxSalary = -1;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary + " рублей.");
    }
    public static void printFIO(){
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }
    public static void indexingSalary(){
        double indexedSalary;
        for (Employee employee : employees) {
            indexedSalary = employee.getSalary() * 1.2;
            System.out.println("Новая зарплата у " + employee.getFIO() + ": " + indexedSalary);
        }
    }
    public static void departmentMinSalary() {
        float minSalary = 1_000_000_001;
        int department = 1;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе " + department + " = " + minSalary);
    }
    public static void departmentMaxSalary(){
        float maxSalary = -1;
        int department = 2;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе " + department + " = " + maxSalary);
    }
    public static void departmentSumSalary(){
        float sum = 0;
        int department = 3;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты отдела " + department + " в месяц: " + sum);
    }
    public static void departmentMidSalary(){
        float sum = 0;
        float mid = 0;
        int department = 3;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
                mid = sum / Employee.filterByDepartment(department).length;
            }
        }
        System.out.println("Средняя зарплата в отделе " + department + " = " + mid);
    }
    public static void departmentIndexingSalary(){
        double indexedSalary;
        int department = 5;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                indexedSalary = employee.getSalary() * 1.2;
                System.out.println("Новая зарплата у " + employee.getFIO() + ": " + indexedSalary);
            }
        }
    }
    public static void printDepartment(){
        int department = 3;
        for (Employee depEmployees : Employee.filterByDepartment(department)) {
            System.out.println("ФИО: " + depEmployees.getFIO() + " Зарплата: " + depEmployees.getSalary());
        }
    }
    public static void lessThanNumber(){
        float number = 70_000;
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("ID " + employee.getId() + " ФИО: " + employee.getFIO() + " Зарплата: " + employee.getSalary());
            }
        }
    }
    public static void moreThanNumber(){
        float number = 70_000;
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println("ID " + employee.getId() + " ФИО: " + employee.getFIO() + " Зарплата: " + employee.getSalary());
            }
        }
    }
    public static Employee[] employees = employees();
    public static Employee[] employees(){
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Лужин Егор Романович", 1, 32323);
        employees[1] = new Employee("Семак Сергей Богданович", 5, 50000);
        employees[2] = new Employee("Романов Петр Алексеевич", 3, 23049);
        employees[3] = new Employee("Пушкин Александр Сергеевич", 2, 49088);
        employees[4] = new Employee("Мармеладова Софья Григорьевна", 4, 32900);
        employees[5] = new Employee("Толстой Лев Николаевич", 2, 74666);
        employees[6] = new Employee("Ульянов Владимир Ильич", 1, 19230);
        employees[7] = new Employee("Ремарк Эрих Петерович",3, 340548);
        employees[8] = new Employee("Ремарк Мария Джозефовна", 5, 32789);
        employees[9] = new Employee("Трамп Дональд Фредович", 4, 123547);
        return employees;
    }
}