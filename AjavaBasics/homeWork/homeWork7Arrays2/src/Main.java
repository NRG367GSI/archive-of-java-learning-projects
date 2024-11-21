import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] expenses = {1_200_000, 1_500_000, 1_100_000, 1_300_000, 1_400_000};
        int summ = 0;
        for (int i : expenses) summ += i;
        System.out.printf("Сумма трат за месяц составила %,d рублей", summ);

        //Task 2
        System.out.println("\n\nTask 2");


        int min = expenses[0];
        int max = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (min > expenses[i]) {
                min = expenses[i];
            }
            if (max < expenses[i]) {
                max = expenses[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %,d рублей. Максимальная сумма трат за неделю составила %,d рублей", min, max);

        //Task 3
        System.out.println("\n\nTask 3");
        int totalExpenses = 0;
        for (int expense : expenses) {
            totalExpenses += expense;
        }
        int numberOfWeeks = expenses.length;
        double averageExpenses = (double) totalExpenses / numberOfWeeks;
        System.out.printf("Средняя сумма трат за месяц составила %,.2f рублей.%n", averageExpenses);

        //Task 4
        System.out.println("\n\nTask 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        String fullName = new String(reverseFullName);
        System.out.print(fullName);


    }
}