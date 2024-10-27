import java.util.Scanner;

public class outNum {
    int numI;
    double numD;


    public void numIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        try {
            // Attempt to read an integer
            this.numI = sc.nextInt();
            System.out.println("Вы ввели целое число: " + numI);
        } catch (Exception e) {
            // If an exception occurs, handle it here
            System.out.println("Вы ввели не целое число, пробуем считать как дробное число.");
            sc.next(); // Clear the invalid input

            try {
                // Attempt to read a double
                this.numD = sc.nextDouble();
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
