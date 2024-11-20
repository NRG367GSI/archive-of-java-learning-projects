import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] value = new int[5];
        value[0] = 1_000_000;
        value[1] = 1_000_000;
        value[2] = 1_000_000;
        value[3] = 1_000_000;
        value[4] = 1_000_000;
        int summ = 0;
        for (int i : value) summ += i;
        System.out.printf("Сумма трат за месяц составила %,d рублей", summ);

        //Task 2
        System.out.println("\n\nTask 2");
        int[] expensesWeek = new int[5];

        //Для автоматизации заполню массив при помощи генератора случайных чисел
        Random rd = new Random();
        for (int i = 0; i <= expensesWeek.length - 1; i++) {
            expensesWeek[i] = rd.nextInt(0, 10_000_000);
            System.out.printf("%d - %,d\n", i, expensesWeek[i]);
        }

        int min = expensesWeek[0];
        int max = expensesWeek[0];
        for (int i = 0; i < expensesWeek.length; i++) {
            if ( min > expensesWeek[i]) {
                min = expensesWeek[i];
            }
            if (max < expensesWeek[i]) {
                max = expensesWeek[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %,d рублей. Максимальная сумма трат за неделю составила %,d рублей", min, max);



    }
}