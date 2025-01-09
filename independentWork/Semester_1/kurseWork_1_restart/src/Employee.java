public class Employee {
    private final int id;
    private final String fullName;

    private static int count = 1;


    public Employee(String fullName) {
        this.id = count();
        this.fullName = fullName;
    }

    public static int count() {
        return count++;
    }
}
