import java.util.Objects;

public class Employee {
    private final String fullName;
    private Department department;
    private double salary;
    private final int id;

    private static int count = 1;

    public Employee(String fullName, Department department, Double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = incrementCount();
    }

    private static int incrementCount() {
        return count++;
    }

    public String getFullName() {
        return this.fullName;
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

        Boolean isFullNameEmployee = Objects.equals(this.fullName, employee.fullName);
        Boolean isDepartment = Objects.equals(this.department, employee.department);
        Boolean isSalary = Objects.equals(this.salary, employee.salary);
        Boolean isID = Objects.equals(this.id, employee.id);

        return isFullNameEmployee && isDepartment && isSalary && isID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.fullName, this.department, this.salary);
    }

    @Override
    public String toString() {
        return String.format("id: %d, %s, %s, %,.2f", id, fullName, department, salary);
    }


}