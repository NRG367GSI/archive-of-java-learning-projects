public class Main {
    public static void main(String[] args) {
        //Task 1
        byte numByte = 127;
        short numShort = 32767;
        int numInt = Integer.MAX_VALUE;
        long numLong = Long.MAX_VALUE;
        float numFloat = 3.4E38F;
        double numDouble = 1.7E308;
        System.out.println("Task 1");
        System.out.printf("byte numByte = %d%n", numByte);
        System.out.printf("short numShort = %d%n", numShort);
        System.out.printf("int numInt = %d%n", numInt);
        System.out.printf("long numLong = %d%n", numLong);
        System.out.printf("float numFloat = %.2f%n", numFloat);
        System.out.printf("double numDouble = %.2e%n", numDouble);

        //Task 2
        float floatNum = 27.12f; //Можно использовать double но так меньше памяти требуется
        long longNum = 987_678_965_549L;
        double doubleNum = 2.786; //Можно использовать и float но для разнообразия и чаще используется
        short shortNum = 569; // в byte не поместится, но можно использовать int, long
        int intNum = -159; //можно использовать short, но еще не было int
        short shortNum2 = 27897;
        byte byteNum = 67; //зачем использовать больше памяти, когда можно меньше

        System.out.println("\n\nTask 2");
        System.out.println("floatNum: " + floatNum);
        System.out.println("longNum: " + longNum);
        System.out.println("doubleNum: " + doubleNum);
        System.out.println("shortNum: " + shortNum);
        System.out.println("intNum: " + intNum);
        System.out.println("shortNum2: " + shortNum2);
        System.out.println("byteNum: " + byteNum);

        //Task 3
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int totalPaper = 480;
        float sheetsPerStudent = totalPaper / (float) (studentsLP + studentsAS + studentsEA);
        System.out.println("\n" + "Task 3");
        System.out.printf("На каждого ученика рассчитано %.1f листов бумаги", sheetsPerStudent);

        //Task 4

        System.out.println("\n\nTask 4");

        int bottlesPerTwoMinutes = 16;
        int machinePerformance = bottlesPerTwoMinutes / 2;

        // За 20 минут
        int bottlesIn20Minutes = machinePerformance * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");

        // В сутки
        int bottlesInADay = machinePerformance * 24 * 60;
        System.out.println("За сутки машина произвела " + bottlesInADay + " штук бутылок.");

        // За 3 дня
        int bottlesInThreeDays = 3 * bottlesInADay;
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " штук бутылок.");

        // За 1 месяц (30 дней)
        int bottlesInOneMonth = 30 * bottlesInADay;
        System.out.println("За 1 месяц машина произвела " + bottlesInOneMonth + " штук бутылок.");


        //Task 5
        System.out.println("\n\nTask 5");

        int totalPaints = 120; // Общее количество банок краски
        int whitePaint = 2; // Банки белой краски на класс
        int brownPaint = 4; // Банки коричневой краски на класс

        int totalPaintsPerClass = whitePaint + brownPaint;
        int totalClasses = totalPaints / totalPaintsPerClass;
        int totalWhitePaint = whitePaint * totalClasses;
        int totalBrownPaint = brownPaint * totalClasses;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");



        //Task 6
        System.out.println("\n\nTask 6");

        // Объявление переменных для ингредиентов
        int bananasCount = 5; // Количество бананов
        int bananaWeight = 80; // Вес одного банана в граммах

        int milkVolume = 200; // Объем молока в мл
        double milkWeightPer100ml = 105; // Вес 100 мл молока в граммах

        int iceCreamCount = 2; // Количество брикетов мороженого
        int iceCreamWeight = 100; // Вес одного брикета мороженого в граммах

        int eggsCount = 4; // Количество яиц
        int eggWeight = 70; // Вес одного яйца в граммах

        // Расчет веса каждого ингредиента
        int totalBananaWeight = bananasCount * bananaWeight;
        double totalMilkWeight = (milkVolume / 100.0) * milkWeightPer100ml;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggsWeight = eggsCount * eggWeight;

        // Общий вес спортзавтрака в граммах
        double totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;

        // Перевод веса в килограммы
        double totalWeightKilograms = totalWeightGrams / 1000.0;

        // Вывод результатов в консоль
        System.out.printf("Общий вес спортзавтрака: %.2f граммов\n", totalWeightGrams);
        System.out.printf("Общий вес спортзавтрака: %.2f килограммов\n", totalWeightKilograms);

        //Task 7
        System.out.println("\n\nTask 7");

        //Нужно потерять 7 килограмм, в 1 килограмме 1000 грамм
        short needSpend = 7 * 1000;
        short firstPowerMode = 250;
        short secondPowerMode = 500;

        int firstCaseMode = needSpend / firstPowerMode;
        int secondCaseMode = needSpend / secondPowerMode;
        int onAverageDays = (firstCaseMode + secondCaseMode) / 2;

        System.out.printf("Если спортсмен будет терять каждый день по 250 грамм, уйдет %d дней \n", firstCaseMode);
        System.out.printf("Если спортсмен будет терять каждый день по 500 грамм, уйдет %d дней \n", secondCaseMode);
        System.out.printf("В среднем потребуется %d дней \n", onAverageDays);

        //Task 8
        System.out.println("\n\nTask 7");







    }
}
