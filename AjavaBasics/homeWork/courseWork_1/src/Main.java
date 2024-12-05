public class Main {
    public static void main(String[] args) {




        Employee em1 = new Employee("Иванов Иван Иванович", Department.CUSTOMER_SERVICE, 50_000.00);
        Employee em2 = new Employee("Смирнова Галина Петровна", Department.FINANCE, 1000000000.00);

        int ordinal = Department.CUSTOMER_SERVICE.ordinal() + 1;
        System.out.println(ordinal);

        //System.out.printf("%s\n%s\n", em1, em2);

        System.out.println(em1.getDepartment());

        EmployeeBook eb = new EmployeeBook();
        eb.addEmployee(em1);
        eb.addEmployee(em2);
        System.out.println(eb.outEmployee());


    }

    //остановился на понкте 5 базовой сложности :  Реализовать в классе Employee контракты equals и hashCode.


}