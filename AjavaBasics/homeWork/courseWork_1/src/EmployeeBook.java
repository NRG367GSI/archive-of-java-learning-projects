import java.util.Arrays;

public class EmployeeBook {
    Employee[] book;
    String outBook;

    public EmployeeBook() {
        this.book = new Employee[10];
        this.outBook = "";
    }

    public Employee getEmployee(int index) {
        if (index >= 0 && index <= book.length - 1) {
            return this.book[index];
        } else {
            return null;
        }
    }



    public String outEmployee() {
        String out = "";
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null) {
                out += this.book[i].toString() + "\n";
            }
        }
        this.outBook = out;
        return this.outBook;
    }

    public String toString() {
        return Arrays.toString(this.book);
    }

    public void addEmployee(Employee employ) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] == null) {
                this.book[i] = employ;
                return;
            }
        }
        System.out.println("Места для записи нет!");
    }
}
