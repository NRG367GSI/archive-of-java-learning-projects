public class Main {
    public static void main(String[] args) {

        Employee em1 = new Employee("Иванов Иван Иванович", Department.CUSTOMER_SERVICE, 1000000000.00);
        Employee em2 = new Employee("Смирнова Галина Петровна", Department.FINANCE, 1000000000.00);

        System.out.printf("%s\n%s", em1, em2);


    }


}