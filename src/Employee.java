public class Employee {

    private  String fullName;
    // Объявили свойство ФИО
    private int department;
    // Объявили свойство отдел
    private double salaryEmployee;
    // Объявили свойство зарплата сотрудника
    private int id;
    // Объявили свойство ID

    public static Employee createEmployee(String fullName, int department, int salaryEmployee) {
        Employee employees = new Employee(fullName, department, salaryEmployee);
        employees.fullName = fullName;
        employees.department = department;
        employees.salaryEmployee = salaryEmployee;
        return employees;
    }

    public Employee (String fullName, int department, int salaryEmployee) {
        this.fullName = fullName;
        this.department = department;
        this.salaryEmployee = salaryEmployee;
        this.id = ++ counter;
    }

    public static int counter;

    public String getFullName() { return fullName; }

    public int getDepartment() { return department; }

    public double getSalaryEmployee() { return salaryEmployee; }

    public int getId() { return id; }

    public void setDepartment(int department) { this.department = department; }

    public void setSalaryEmployee(double salaryEmployee) { this.salaryEmployee = salaryEmployee; }

    public String toString() { return "ID: " + id
            + ". Ф.И.О. работника: " + this.fullName
            + ". Отдел: " + this.department
            + ". Зарплата: " + this.salaryEmployee; }
}