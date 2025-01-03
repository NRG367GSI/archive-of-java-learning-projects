public class Main {
    public static void main(String[] args) {
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

        int population = 12_000_000; // Initial population
        int years = 10; // Number of years to simulate
        double birthRate = 0.017; // Birth rate (17 per 1000)
        double deathRate = 0.008; // Death rate (8 per 1000)
        for (int year = 1; year <= years; year++) {
            int births = (int) (birthRate * population);
            int deaths = (int) (deathRate * population);
            population += births - deaths;
            System.out.printf("Год %d, численность населения составляет: %,d\n", year, population);
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
        double interRate = 0.07;
        double purpAccum = 12_000_000;
        int mont = 0;
        while (contribut <= purpAccum) {
            contribut += interRate * contribut;
            mont++;
            if (mont == 6 || mont == 12 || mont == 18 || mont == 24 || mont > 24) {
                System.out.printf("Через %d месяцев, сумма накоплений составляет: %,.2f рублей\n", mont, contribut);
            }

        }

        //Task 6
        System.out.println("\n\nCycles lesson 2, Task 6");
        double contribution9years = 15_000;
        double bankInterestMonth = 0.07;
        int reportPeriod = 6;
        int beginningDepositMonth = 1;
        int depositPeriodMonth = 9 * 12;
        for (int i = beginningDepositMonth; i <= depositPeriodMonth; i++) {
            contribution9years += bankInterestMonth * contribution9years;
            if (i % reportPeriod == 0) {
                System.out.printf("Через %d месяцев, сумма накоплений составляет: %,.2f рублей\n", i, contribution9years);
            }
        }

        //Task 7
        System.out.println("\n\nCycles lesson 2, Task 7");

        int friday = 3;
        int beginningMonth = 1;
        int endMonth = 31;
        int daysWeak = 7;
        for (int day = beginningMonth; day <= endMonth; day++) {
            if ((day - friday) % daysWeak == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

        //Task 8
        System.out.println("\n\nCycles lesson 2, Task 8");
        //Что б избежать "магических чисел" можно ввести переменные
        int cometPeriod = 79;
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int yare = 0; yare < endYear; yare += cometPeriod) {
            if (yare >= startYear && yare <= endYear) { //yare <= endYear эта часть условия здесь не нужна так как цыкал закончится
                System.out.println(yare);
            }
        }
    }
}