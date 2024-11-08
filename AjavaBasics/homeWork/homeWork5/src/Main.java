public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\n");
        System.out.println("Task 1");

        char clientOS = '0';
        switch (clientOS) {
            case '0':
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case '1':
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        //Task 2
        System.out.println("\n");
        System.out.println("Task 2");

        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case '0':
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case '1':
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case '0':
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case '1':
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }

        //Task 3
        System.out.println("\n");
        System.out.println("Task 3");

        int year = 2021;
        int firstLeapYear = 1584;
        boolean isLeapYear = false;

        if (year >= firstLeapYear) {
            boolean divisibleBy4 = (year % 4 == 0);
            boolean divisibleBy100 = (year % 100 == 0);
            boolean divisibleBy400 = (year % 400 == 0);

            isLeapYear = (divisibleBy4 && !divisibleBy100) || divisibleBy400;
        }

        if (isLeapYear) {
            System.out.printf("%d год является високосным%n", year);
        } else {
            System.out.printf("%d год не является високосным%n", year);
        }

        //Task 4
        System.out.println("\n");
        System.out.println("Task 4");

        int deliveryDistance = 95;
        int delivery = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + delivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (delivery + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (delivery + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Task 5
        System.out.println("\n");
        System.out.println("Task 5");

        for (int monthNumber = 0; monthNumber < 20; monthNumber++) {
            //int monthNumber = 1; // Номер месяца
            String season = ""; // Переменная для хранения сезона
            String getMonthName = ""; // Переменная для хранения названия месяца

            // Проверка на допустимость номера месяца
            if (monthNumber > 1 || monthNumber < 12) {
                switch (monthNumber) {
                    case 1:
                        getMonthName = "Январь";
                        season = "зима";
                        break;
                    case 2:
                        getMonthName = "Февраль";
                        season = "зима";
                        break;
                    case 3:
                        getMonthName = "Март";
                        season = "весна";
                        break;
                    case 4:
                        getMonthName = "Апрель";
                        season = "весна";
                        break;
                    case 5:
                        getMonthName = "Май";
                        season = "весна";
                        break;
                    case 6:
                        getMonthName = "Июнь";
                        season = "лето";
                        break;
                    case 7:
                        getMonthName = "Июль";
                        season = "лето";
                        break;
                    case 8:
                        getMonthName = "Август";
                        season = "лето";
                        break;
                    case 9:
                        getMonthName = "Сентябрь";
                        season = "осень";
                        break;
                    case 10:
                        getMonthName = "Октябрь";
                        season = "осень";
                        break;
                    case 11:
                        getMonthName = "Ноябрь";
                        season = "осень";
                        break;
                    case 12:
                        getMonthName = "Декабрь";
                        season = "зима";
                        break;
                    default:
                        season = "неизвестный сезон";
                        // Этот блок не должен сработать, так как мы проверили номер месяца выше
                        break;
                }
                System.out.println(monthNumber + "-й месяц (он же " + getMonthName + ") принадлежит к сезону " + season + ".");
            }
        }
    }
}