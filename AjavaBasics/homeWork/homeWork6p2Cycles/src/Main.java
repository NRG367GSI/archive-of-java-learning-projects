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

        int friday = 3;
        for (int day = 1; day <= 31; day++) {
            if ((day - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }




    }
}

