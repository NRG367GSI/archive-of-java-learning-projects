public class EmployeeBook {
    Employee[] book;

    public EmployeeBook() {
        book = new Employee[10];
    }

    public Employee getEmployee(int index) {
        if (index >= 0 && index <= book.length - 1) {
            return this.book[index];
        } else {
            return null;
        }
    }

    public outEmployee() {
        for (Employee employee : book) {
            System.out.println(employee);
        }
    }

    public void addEmployee(Employee employ) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] == null) {
                this.book[i] = employ;
                break;
            }
        }
    }
}
