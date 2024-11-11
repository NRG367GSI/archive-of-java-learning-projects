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
        System.out.print("\n\nTask 4\n");
        for (int l = -10; l < 11; l++){
            System.out.print(l + ", ");
        }

        // Task 5
        System.out.print("\n\nTask 5\n");

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

    }
}