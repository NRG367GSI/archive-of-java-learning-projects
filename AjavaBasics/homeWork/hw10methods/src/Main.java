import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1\n");
        int year = 2021;
        leapYear(year);

        //Task 2
        System.out.println("\n\nTask 2\n");
        int currentYear = LocalDate.now().getYear();
        applicWerson(0, currentYear);

        //Task 3
        System.out.println("\n");
        System.out.println("Task 3");

        int deliveryDistance = 20;
        cardDelivery(deliveryDistance);


    }

    //Task 1
    public static void leapYear(int year) {
        int firstLeapYear = 1584;
        boolean isLpYear = false;

        if (year >= firstLeapYear) {
            boolean divisibleBy4 = (year % 4 == 0);
            boolean divisibleBy100 = (year % 100 == 0);
            boolean divisibleBy400 = (year % 400 == 0);

            isLpYear = (divisibleBy4 && !divisibleBy100) || divisibleBy400;
        }

        if (isLpYear) {
            System.out.printf("%d год - високосный год", year);
        } else {
            System.out.printf("%d год - не високосный год", year);
        }
    }

    //Task 2
    public static void applicWerson(int clientOS, int yare) {
        if (clientOS == 0 && yare < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yare < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //Task 3
    public static void cardDelivery(int distance) {
        int delivery = 1;
        if (distance >= 0 && distance <= 20) {
            System.out.println("Потребуется дней: " + delivery);
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + (delivery + 1));
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: " + (delivery + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}