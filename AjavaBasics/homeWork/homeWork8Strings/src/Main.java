import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\n\nTask 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника - %s", fullName);

        //Task 2
        System.out.println("\n\nTask 2");
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета - %s", fullName.toUpperCase());

        //Task 3
        System.out.println("\n\nTask 3");
        fullName = "Иванов Семён Семёнович";
        String text = "";
        for (String i : fullName.split("")) {
            if (i.equals("ё")) {
                i = "e";
            }
            text += i;
        }
        System.out.printf("Данные Ф. И. О. сотрудника - %s", text);
    }
}
