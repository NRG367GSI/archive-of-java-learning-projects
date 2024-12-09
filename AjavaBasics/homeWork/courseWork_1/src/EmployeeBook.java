import java.util.Arrays;

public class EmployeeBook {
    private Employee[] book;

    public EmployeeBook() {
        this.book = new Employee[10];
    }

    /**
     * Возвращает сотрудника по индексу
     *
     * @param id
     * @return Employee
     */
    public Employee employeeBYid(int id) {
        for (Employee people : this.book) {
            if (people.getId() == id) {
                return people;
            }
        }
        return null;
    }


    /**
     * список всех сотрудников со всеми имеющимися по ним данными
     *
     * @return
     */
    public String outEmployee() {
        String out = "";
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null) {
                out = out.concat(this.book[i].toString() + "\n"); //out += this.book[i].toString() + "\n";
            }
        }
        return out;
    }

    public String toString() {
        return Arrays.toString(this.book);
    }

    /**
     * Добавление сотрудника
     *
     * @param employ
     */
    public boolean addEmployee(Employee employ) {
        for (Employee people : this.book) {
            if (people != null && people.equals(employ)) {
                return false;
            }
        }
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] == null) {
                this.book[i] = employ;
                return true;
            }
        }
        return false;
    }

    /**
     * Удаление сотрудника по id
     *
     * @param id
     */
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
     *
     * @return тип Employee
     */
    public Employee getEmployeeSalaryMin() {
        Employee employeeSalaryMin = null;
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null && this.book[i].getSalary() != 0 && this.book[i].getSalary() < minSalary) {
                employeeSalaryMin = this.book[i];
                minSalary = this.book[i].getSalary();
            }
        }
        return employeeSalaryMin;
    }

    /**
     * сотрудника с максимальной ЗП
     *
     * @return EmployeeSalaryMax
     */
    public Employee getEmployeeSalaryMax() {
        Employee employeeSalaryMax = null;
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null && this.book[i].getSalary() != 0 && this.book[i].getSalary() > maxSalary) {
                employeeSalaryMax = this.book[i];
                maxSalary = this.book[i].getSalary();
            }
        }
        return employeeSalaryMax;
    }

    /**
     * Возвращает количество сотрудников
     *
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
     *
     * @return
     */
    public Double averageSalaryEmployees() {
        return getAmountExpensesMonth() / countEmployee();
    }

    /**
     * @return Выводит имена всех сотрудников
     */
    public String outFulNameEmployee() {
        String out = "";
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] != null) {
                out = out.concat(this.book[i].getFullName() + "\n");
            }
        }
        return out;
    }

    /**
     * Индексация зарплаты
     *
     * @param percent 0 - 100
     */
    public void salaryIndexation(int percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Процент не может быть отрицательным");
        }

        final double indexationRate = percent / 100.0;

        if (indexationRate != 0) {
            for (Employee people : this.book) {
                if (people != null && people.getSalary() != null) {
                    people.setSalary(people.getSalary() * (1 + indexationRate));
                }
            }
        }
    }

    /**
     * Вывод всех сотрудников с зп меньше числа
     *
     * @param salary int
     */
    public void lowSalaryEmployees(int salary) {
        for (Employee people : this.book) {
            if (people != null && people.getSalary() != null && people.getSalary() < (double) salary) {
                System.out.printf("%d %s %,.2f\n", people.getId(), people.getFullName(), people.getSalary());
            }
        }
    }

    /**
     * Вывод всех сотрудников с зп больше или равно числу
     *
     * @param salary int
     */
    public void highSalaryEmployees(int salary) {
        for (Employee people : this.book) {
            if (people != null && people.getSalary() != null && people.getSalary() >= (double) salary) {
                System.out.printf("%d %s %,.2f\n", people.getId(), people.getFullName(), people.getSalary());
            }
        }
    }
}

