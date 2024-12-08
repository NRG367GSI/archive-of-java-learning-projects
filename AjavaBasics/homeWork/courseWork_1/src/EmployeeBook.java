import java.util.Arrays;

public class EmployeeBook {
    private Employee[] book;
    private String outBook;

    public EmployeeBook() {
        this.book = new Employee[10];
        this.outBook = "";
    }

    /**
     * Возвращает сотрудника по индексу
     * @param index
     * @return Employee
     */
    public Employee getEmployee(int index) {
        if (index >= 0 && index <= book.length - 1) {
            return this.book[index];
        } else {
            return null;
        }
    }


    /**
     * список всех сотрудников со всеми имеющимися по ним данными
     * @return
     */
    public String outEmployee() {
        String out = "";
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null) {
                out = out.concat(this.book[i].toString() + "\n"); //out += this.book[i].toString() + "\n";
            }
        }
        this.outBook = out;
        return this.outBook;
    }

    public String toString() {
        return Arrays.toString(this.book);
    }

    /**
     * Добавление сотрудника
     * @param employ
     */
    public boolean addEmployee(Employee employ) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] == null) {
                this.book[i] = employ;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        if (id >= 1 && id <= this.book.length) {
            for (int i = 0; i < this.book.length; i++) {
                if (this.book[i].getId() == id) {
                    this.book[i] = null;
                    System.out.println("Удален сотрудник id:" + id);
                }
            }
        }
    }

    /**
     *
     * @return сумму затрат на ЗП в месяц Double
     */
    public Double getAmountExpensesMonth() {
        Double sum = 0d;
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null) {
                sum += this.book[i].getSalary();
            }
        }
        return sum;
    }

    /**
     * сотрудника с минимальной ЗП
     * EmployeeSalaryMin
     * @return тип Employee
     */
    public Employee getEmployeeSalaryMin() {
        Employee EmployeeSalaryMin = this.book[0];
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null && this.book[i].getSalary() != 0 && this.book[i].getSalary() < EmployeeSalaryMin.getSalary()) {
                EmployeeSalaryMin = this.book[i];
            }
        }
        return EmployeeSalaryMin;
    }

    /**
     * сотрудника с максимальной ЗП
     * @return EmployeeSalaryMax
     */
    public Employee getEmployeeSalaryMax() {
        Employee EmployeeSalaryMax = this.book[0];
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null && this.book[i].getSalary() != 0 && this.book[i].getSalary() > EmployeeSalaryMax.getSalary()) {
                EmployeeSalaryMax = this.book[i];
            }
        }
        return EmployeeSalaryMax;
    }

    /**
     * Возвращает количество сотрудников
     * @return int
     */
    public int countEmployee() {
        int count = 0;
        for (Employee employee : this.book) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * среднее значение зарплат
     * @return
     */
    public Double averageSalaryEmployees() {
        return getAmountExpensesMonth() / countEmployee();
    }

    /**
     *
     * @return Выводит имена всех сотрудников
     */
    public String outFulNameEmployee() {
        String out = "";
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null) {
                out = out.concat(this.book[i].getFullNameEmployee() + "\n");
            }
        }
        this.outBook = out;
        return this.outBook;
    }

    /**
     * Индексация зарплаты
     * @param percent 0 - 100
     */
    public void salaryIndexation(int percent) {
        Double percentageMultiplier = ((double) percent / 100);
        for (Employee people : this.book) {
            people.setSalary(percentageMultiplier * people.getSalary() + people.getSalary());
        }
    }

    /**
     * Вывод всех сотрудников с зп меньше числа
     * @param salary int
     */
    public void lowSalaryEmployees(int salary) {
        for (Employee people : this.book) {
            if (people.getSalary() < (double) salary) {
                System.out.printf("%d %s %,.2f\n", people.getId(), people.getFullNameEmployee(), people.getSalary());
            }
        }
    }

    /**
     * Вывод всех сотрудников с зп больше или равно числу
     * @param salary int
     */
    public void highSalaryEmployees(int salary) {
        for (Employee people : this.book) {
            if (people.getSalary() >= (double) salary) {
                System.out.printf("%d %s %,.2f\n", people.getId(), people.getFullNameEmployee(), people.getSalary());
            }
        }
    }




}

