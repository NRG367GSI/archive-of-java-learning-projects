import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
        //a = 5; b = 7 -> max = 7 a = 2 b = 10 -> max = 10 a = -9 b = -3 -> max = -3

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        try {
            // Attempt to read an integer
            int numI = sc.nextInt();
            System.out.println("Вы ввели целое число: " + numI);
        } catch (Exception e) {
            // If an exception occurs, handle it here
            System.out.println("Вы ввели не целое число, пробуем считать как дробное число.");
            sc.next(); // Clear the invalid input

            try {
                // Attempt to read a double
                double numD = sc.nextDouble();
                System.out.println("Вы ввели дробное число: " + numD);
            } catch (Exception e2) {
                // Handle the case where the input is neither an int nor a double
                System.out.println("Вы ввели не число");
            }
        } finally {
            sc.close(); // Ensure the scanner is closed
        }
    }
}


