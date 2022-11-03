public class EmployeesBook {
    public static Employee[] employees = employes();
    public static Employee[] employes(){
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
