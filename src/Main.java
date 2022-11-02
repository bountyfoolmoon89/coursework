public class Main {
    public static void main(String[] args) {
        for (Employee allEmployees : ArrEmployees.employees) {
            System.out.println(allEmployees);
        }
        printSeparator();
        ArrEmployees.sumSalary();
    }
    public static void printSeparator() {
        System.out.println("----------------------------------------------------------------------------");
    }
}