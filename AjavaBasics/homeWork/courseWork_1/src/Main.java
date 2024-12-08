public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Иванов Иван Иванович", Department.CUSTOMER_SERVICE, 50_000.00);
        employees[1] = new Employee("Смирнова Галина Петровна", Department.FINANCE, 60_000.00);
        employees[2] = new Employee("Петров Петр Петрович", Department.IT, 70_000.00);
        employees[3] = new Employee("Сидорова Анна Сергеевна", Department.HR, 55_000.00);
        employees[4] = new Employee("Кузнецов Алексей Владимирович", Department.SALE, 65_000.00);
        employees[5] = new Employee("Васильева Ольга Николаевна", Department.MARKETING, 58_000.00);
        employees[6] = new Employee("Михайлов Михаил Михайлович", Department.CUSTOMER_SERVICE, 52_000.00);
        employees[7] = new Employee("Николаева Елена Ивановна", Department.FINANCE, 62_000.00);
        employees[8] = new Employee("Федоров Федор Федорович", Department.IT, 72_000.00);
        employees[9] = new Employee("Лебедева Мария Александровна", Department.HR, 57_000.00);

        //для эксперимента
//        employees[10] = new Employee("Соколов Андрей Викторович", Department.SALE, 67_000.00);
//        employees[11] = new Employee("Морозова Екатерина Владимировна", Department.MARKETING, 60_000.00);
//        employees[12] = new Employee("Новиков Дмитрий Сергеевич", Department.CUSTOMER_SERVICE, 53_000.00);
//        employees[13] = new Employee("Орлова Светлана Петровна", Department.FINANCE, 63_000.00);
//        employees[14] = new Employee("Павлов Павел Павлович", Department.IT, 73_000.00);
//        employees[15] = new Employee("Романова Анастасия Игоревна", Department.HR, 58_000.00);
//        employees[16] = new Employee("Семенов Семен Семенович", Department.SALE, 68_000.00);
//        employees[17] = new Employee("Тимофеева Оксана Александровна", Department.MARKETING, 61_000.00);
//        employees[18] = new Employee("Ушаков Игорь Владимирович", Department.CUSTOMER_SERVICE, 54_000.00);
//        employees[19] = new Employee("Фролова Елена Викторовна", Department.FINANCE, 64_000.00);


        int ordinal = Department.CUSTOMER_SERVICE.ordinal() + 1;
        System.out.println(ordinal);


        EmployeeBook eb = new EmployeeBook();
        for (Employee emp : employees) {
            eb.addEmployee(emp);
        }

        //список всех сотрудников со всеми имеющимися по ним данными
        System.out.println(eb.outEmployee());

        //Месячная сумма затрат
        System.out.printf("Месячная сумма затрат составляет: %,.2f", eb.getAmountExpensesMonth());
        System.out.println('\n');
        System.out.printf("Минимальная зарплата составляет: %s", eb.getEmployeeSalaryMin());
        System.out.println('\n');
        System.out.printf("Минимальная зарплата составляет: %s", eb.getEmployeeSalaryMax());
        System.out.println('\n');
        System.out.printf("Средняя зарплата составляет: %,.2f", eb.averageSalaryEmployees());
        System.out.println('\n');
        System.out.printf("Список всех сотрудников:\n%s", eb.outFulNameEmployee());

        //Индексация зарплаты
        System.out.println("\n");
        System.out.println("Индексация зарплаты");
        eb.salaryIndexation(20);
        System.out.println(eb.outEmployee());

        //Вывод всех сотрудников с зп меньше числа
        System.out.println("Вывод всех сотрудников с зп меньше числа");
        eb.lowSalaryEmployees(70_000);

        //Вывод всех сотрудников с зп больше или равное числу
        System.out.println("Вывод всех сотрудников с зп больше или равное числу");
        eb.highSalaryEmployees(70_000);
        System.out.println("\n");

        //Удаление сотрудника по id
        System.out.println("Удаление сотрудника по id");
        eb.removeEmployee(5);
        System.out.println(eb.outEmployee());
        //добавление сотрудника в пустую ячейку
        System.out.println("добавление сотрудника в пустую ячейку");
        Employee emp = new Employee("Фролова Елена Викторовна", Department.FINANCE, 64_000.00);
        eb.addEmployee(emp);
        System.out.println(eb.outEmployee());

        //метод для получения сотрудника по id
        System.out.println("метод для получения сотрудника по id");
        System.out.println(eb.employeeBYid(7));
    }
}