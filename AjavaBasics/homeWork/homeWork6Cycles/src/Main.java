public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        for (int i = 1; i < 11; i++){
            System.out.print(i + ", ");
        }

        // Task 2
        System.out.println("\n\nTask 2");
        for (int j = 10; j > 0; j--){
            System.out.print(j + ", ");
        }

        // Task 3
        System.out.println("\n\nTask 3");
        for (int k = 2; k < 18; k += 2){
            System.out.print(k + ", ");
        }

        // Task 4
        System.out.println("\n\nTask 4");
        for (int l = 10; l > -11; l--){
            System.out.print(l + ", ");
        }

        // Task 5
        System.out.println("\n\nTask 5");

        boolean isLeapYear = false;
        // for (int year = 1904;  year <= 2096; year += 4) в данном задании было бы достаточно
        for (int year = 1904;  year <= 2096; year++) {
            boolean divisibleBy4 = (year % 4 == 0);
            boolean divisibleBy100 = (year % 100 == 0); //это условие не нужно
            boolean divisibleBy400 = (year % 400 == 0); //это условие не нужно

            isLeapYear = (divisibleBy4 && !divisibleBy100) || divisibleBy400;

            if (isLeapYear) {
                System.out.printf("%d год является високосным\n", year);
            }
        }

        // Task 6
        System.out.println("\n\nTask 6");
        for (int sum7 = 7; sum7 < 100; sum7 += 7){
            System.out.print(sum7 + ", ");
        }

        // Task 7
        System.out.println("\n\nTask 7");

        for (int multiply2 = 2; multiply2 <= 512; multiply2 *=2){
            System.out.print(multiply2 + ", ");
        }

        // Task 8
        System.out.println("\n\nTask 8");

        double amountSavings = 0;
        for (int month = 1; month <= 12; month++) {
            amountSavings += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей\n", month, amountSavings);
        }

        // Task 9
        System.out.println("\n\nTask 9");

        double amountSavingsBank = 0;
        for (int month = 1; month <= 12; month++) {
            amountSavingsBank += amountSavingsBank / 100;
            amountSavingsBank += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей\n", month, amountSavingsBank);
        }

        // Task 10
        System.out.println("\n\nTask 10");
        int num = 2;
        for (int multiplier = 1; multiplier <= 10; multiplier++){
            int result = num * multiplier;
            System.out.printf("%dX%d=%d\n",num, multiplier, result);
        }

        // Cycles lesson 2
        //Task 1
        System.out.println("\n\nCycles lesson 2, Task 1");

        double accumulateFunds = 2_459_000;
        double postpoing = 15_000;
        double savings = 0;
        int months = 0;

        while (savings <= accumulateFunds) {
            months++;
            savings += postpoing;
        }
        System.out.printf("Месяцев %d, сумма накоплений равна %,.2f рублей\n", months, savings);

        //Task 2
        System.out.println("\n\nCycles lesson 2, Task 2");

        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }
        System.out.println();
        for (;count > 0; count--){
            System.out.print(count + " ");
        }

        //Task 3
        System.out.println("\n\nCycles lesson 2, Task 3");

        int populationCountryY = 12_000_000;
        int giveBirth = 17 * populationCountryY / 1000;
        int mortalityRate = 8 * populationCountryY / 1000;
        int years = 10;
        for (int time = 1; time < years + 1; time++) {
            populationCountryY += giveBirth;
            populationCountryY -= mortalityRate;
            System.out.printf("Год %d, численность населения составляет: %,d\n", time, populationCountryY);
        }

        //Task 4
        System.out.println("\n\nCycles lesson 2, Task 4");
        double contribution = 15_000;
        double interestRate = 7;
        double purposeAccumulation = 12_000_000;
        int month = 0;
        while (contribution <= purposeAccumulation) {
            contribution += interestRate * contribution / 100;
            month++;
            System.out.printf("Через %d месяцев, сумма накоплений составляет: %,.2f рублей\n", month, contribution);
        }

        //Task 5
        System.out.println("\n\nCycles lesson 2, Task 5");
        double contribut = 15_000;
        double interRate = 7;
        double purpAccum = 12_000_000;
        int mont = 0;
        while (contribut <= purpAccum) {
            contribut += interRate * contribut / 100;
            mont++;
            if (mont == 6 || mont == 12 || mont == 18 || mont == 24 || mont > 24) {
                System.out.printf("Через %d месяцев, сумма накоплений составляет: %,.2f рублей\n", mont, contribut);
            }

        }

        //Task 6
        System.out.println("\n\nCycles lesson 2, Task 6");
        double contribution9years = 15_000;
        double bankInterestMonth = 0.07;
        int depositPeriodMonth = 9 * 12;
        for (int i = 1; i < depositPeriodMonth + 1; i++) {
            contribution9years += bankInterestMonth * contribution9years;
            if (i % 6 == 0) {
                System.out.printf("Через %d месяцев, сумма накоплений составляет: %,.2f рублей\n", i, contribution9years);
            }
        }

        //Task 7
        System.out.println("\n\nCycles lesson 2, Task 7");




    }
}