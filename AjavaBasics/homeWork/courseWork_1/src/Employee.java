import java.util.Objects;

public class Employee {
    private final String fullNameEmployee;
    private Department department;
    private Double salary;
    private final int id;

    private static int count = 1;

    public Employee(String fullNameEmployee, Department department, Double salary) {
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;
        this.id = count();
    }

    private static int count() {
        return count++;
    }

    public String getFullNameEmployee() {
        return this.fullNameEmployee;
    }

    public Department getDepartment() {
        return this.department;
    }

    public Double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object O) {
        if (this == O) {
            return true;
        }
        if (O == null || getClass() != O.getClass()) {
            return false;
        }
        Employee employee = (Employee) O;

        Boolean isFullNameEmployee = Objects.equals(this.fullNameEmployee, employee.fullNameEmployee);
        Boolean isDepartment = Objects.equals(this.department, employee.department);
        Boolean isSalary = Objects.equals(this.salary, employee.salary);
        Boolean isID = Objects.equals(this.id, employee.id);

        return isFullNameEmployee && isDepartment && isSalary && isID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.fullNameEmployee, this.department, this.salary);
    }

    @Override
    public String toString() {
        return String.format("id: %d, %s, %s, %,.2f", id, fullNameEmployee, department, salary);
    }


}