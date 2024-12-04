public class Employee {
    private String fullNameEmployee;
    private Department department;
    private Double salary;
    private final int id;

    private static int count = 1;
    private static int count() {
        return  count++;
    }

    public Employee(String fullNameEmployee, Department department, Double salary) {
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;
        this.id = count();
    }

    @Override
    public String toString() {
        return String.format("id: %d, %s, %s, %,.2f", id, fullNameEmployee, department.getDescription(), salary);
    }


}