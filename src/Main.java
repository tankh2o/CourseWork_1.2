import java.util.Arrays;

public class Main {
    public static Employee[] employee;

    public static void main(String[] args) {
        employee = new Employee[10];

        employee[0] = new Employee("Игнатьева Алёна Андреевна", 1, 44000);
        employee[1] = new Employee("Левченко Антон Павлович", 2, 38000);
        employee[2] = new Employee("Суркова Антонина Вячеславовна", 3, 32000);
        employee[3] = new Employee("Раков Дмитрий Маркович", 4, 28000);
        employee[4] = new Employee("Добрынин Елизар Сидорович", 5, 50000);
        employee[5] = new Employee("Ведешина Лаурита Стефановна", 1, 34000);
        employee[6] = new Employee("Попова Снежана Юрьевна", 2, 80000);
        employee[7] = new Employee("Ахметзянова Мария Юрьевна", 3, 58000);
        employee[8] = new Employee("Бронзова Ирина Владимировна", 4, 63000);
        employee[9] = new Employee("Ушкина Елена Викторовна", 5, 40000);

        /*for (int i = 0; i < employee.length; i++) {
            printEmployeeInfo(employee[i]);
        }*/
        // 2-ой способ вывести список сотрудников и информацию по ним в консоль
        System.out.println("\n" + "БАЗОВАЯ СЛОЖНОСТЬ");
        System.out.println(Arrays.toString(employee));
        printAllEmployees();
        System.out.println(" ");
        sumSalaryInMonth();
        findMaxSalaryAmongEmployee();
        findMinSalaryAmongEmployee();
        findAverageValueSalaries();
        System.out.println(" ");
        printFullNameAllEmployees();
        System.out.println("\n" + "ПОВЫШЕННАЯ СЛОЖНОСТЬ");
        //makeIndexSalary_NoSet();
        System.out.println("Индексация зарплаты сотрудников на 13%: ");
        makeIndexSalarySetter();
        for (Employee i : employee) {
            System.out.println(i);
        }
        //findMaxSalaryAmongEmployeeSetter();
        //findMinSalaryAmongEmployeeSetter();

    }

    public static void printAllEmployees() {
        for (int i = 0; i < Employee.counter; i++) {
            Employee employees = employee[i];
            printEmployeeInfo(employee[i]);
        }
    }

    public static void printEmployeeInfo(Employee employee) {
        System.out.println("ID: " + employee.getId()
                + ". Ф.И.О. работника: " + employee.getFullName()
                + ". Отдел: " + employee.getDepartment()
                + ". Зарплата: " + employee.getSalaryEmployee());
    }

    public static void sumSalaryInMonth() {
        int sumSalary = 0;
        for (Employee inMonth : employee) {
            sumSalary += inMonth.getSalaryEmployee();
        }
        System.out.println("Сумма затрат на выплату зарплаты сотрудникам в месяц: " + sumSalary);
    }

    public static void findMaxSalaryAmongEmployee() {
        double maxSalary = employee[0].getSalaryEmployee();
        for (Employee max : employee) {
            if (maxSalary < max.getSalaryEmployee()) {
                maxSalary = max.getSalaryEmployee();
            }
        }
        System.out.println("Максимальная зарплата среди сотрудников: " + maxSalary);
    }

    public static void findMinSalaryAmongEmployee() {
        double minSalary = employee[0].getSalaryEmployee();
        for (Employee min : employee) {
            if (minSalary > min.getSalaryEmployee()) {
                minSalary = min.getSalaryEmployee();
            }
        }
        System.out.println("Минимальная зарплата среди сотрудников: " + minSalary);
    }

    public static void findAverageValueSalaries() {
        int sumSalary = 0;
        for (Employee value : employee) {
            sumSalary += value.getSalaryEmployee();
        }
        sumSalary = sumSalary / employee.length;
        System.out.println("Среднее значение зарплат: " + sumSalary);
    }

    public static void printFullNameAllEmployees() {
        String fullName = new String();
        for (Employee employeeName : employee) {
            fullName += employeeName.getFullName();
        }
        System.out.println("Список сотрудников:");
        printFullName();
    }

    public static void printFullName() {
        int n = 1;
        while (n < employee.length) {
            for (int i = 0; i < employee.length; i++) {
                System.out.println(n + ". " + employee[i].getFullName());
                n++;
            }
        }
    }

    /*public static void makeIndexSalary_NoSetter() {
        double indexPercent = 0.13;
        double salary;
        for (Employee boost : employee) {
            salary = boost.getSalaryEmployee();
            System.out.println("Индексация зарплаты сотрудников на 13%: ");
            System.out.println(salary + (salary * indexPercent)); }
    }*/
    //а) без использования сеттера
    public static void makeIndexSalarySetter() {
        double indexPercent = 0.13;
        for (int i = 0; i < employee.length; i++) {
            employee[i].setSalaryEmployee((employee[i].getSalaryEmployee() * indexPercent) + employee[i].getSalaryEmployee());
        }
    }
    //б) использованы сеттеры
    /*public static Employee findMaxSalaryAmongEmployeeSetter() {
        Employee  = employee[0];
        for (Employee employee)

}*/
}