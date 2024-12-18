import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = readNumber(sc);
        if (result != Double.NaN) {
            System.out.println("Вы ввели число: " + result);
        }
        sc.close(); // Ensure the scanner is closed
    }

    static int outInt(int num) {
        return num;
    }

    public static double readNumber(Scanner sc) {
        System.out.println("Введите число");
        try {
            // Attempt to read an integer
            int numI = sc.nextInt();
            System.out.println("Вы ввели целое число: " + numI);
            //return numI; // Return the integer as a double
            outInt(numI);
        } catch (Exception e) {
            // If an exception occurs, handle it here
            System.out.println("Вы ввели не целое число, пробуем считать как дробное число.");
            sc.next(); // Clear the invalid input

            try {
                // Attempt to read a double
                double numD = sc.nextDouble();
                System.out.println("Вы ввели дробное число: " + numD);
                return numD; // Return the double
            } catch (Exception e2) {
                // Handle the case where the input is neither an int nor a double
                System.out.println("Вы ввели не число");
                return Double.NaN; // Return NaN to indicate failure
            }
        }
    }
}