import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        if (sc.hasNextByte()) {
            byte age = sc.nextByte();
            if (age >= 18) {
                System.out.printf("Если возраст человека равен: %d, то он совершеннолетний!", age);
            } else {
                System.out.printf("Если возраст человека равен: %d, то он не достиг совершеннолетия, нужно не много подождать!", age);
            }
        } else {
            System.out.println("Вы ввели не допустимое значение!");
        }
        sc.close();
        System.out.println("\n");



        //Task 2
        System.out.println("Task 2");
        Random rd = new Random();
        int thermometer = rd.nextInt(-50, 50);
        if (thermometer < 5) {
            System.out.printf("На улице градусов %d. На улице холодно, нужно одеть шапку", thermometer);
        } else {
            System.out.printf("На улице градусов %d. Сегодня тепло можно идти без шапки!", thermometer);
        }
        System.out.println("\n");

        //Task 3
        System.out.println("Task 3");

        int spead = rd.nextInt(30, 100);
        if (spead > 60) {
            System.out.printf("Если скорость %d, то придется заплатить штраф!", spead);
        } else {
            System.out.printf("Если скорость %d, то можно ездить спокойно!", spead);
        }
        System.out.println("\n");

    }
}