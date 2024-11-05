import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        Random rd = new Random();
        int age = rd.nextInt(0, 100);
        if (age >= 18) {
            System.out.printf("Если возраст человека равен: %d, то он совершеннолетний!", age);
        } else {
            System.out.printf("Если возраст человека равен: %d, то он не достиг совершеннолетия, нужно не много подождать!", age);
        }

        System.out.println("\n");



        //Task 2
        System.out.println("Task 2");

        int thermometer = rd.nextInt(-50, 50);
        if (thermometer < 5) {
            System.out.printf("На улице градусов %d. На улице холодно, нужно одеть шапку", thermometer);
        } else {
            System.out.printf("На улице градусов %d. Сегодня тепло можно идти без шапки!", thermometer);
        }
        System.out.println("\n");

        //Task 3
        System.out.println("Task 3");
        int spead = rd.nextInt(0, 200);
        if (spead > 60) {
            System.out.printf("Если скорость %d, придется заплатить штраф!", spead);

        } else {
            System.out.printf("Если скорость %d, можно ездить спокойно!", spead);
        }
        System.out.println("\n");

        //Task 4
        System.out.println("Task 4");
        int years = rd.nextInt(0, 30);
        if (years > 2 && years < 6) System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад!", years);
        if (years > 7 && years < 17) System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу!", years);
        if (years >= 18 && years <= 24) System.out.printf("Если возраст человека равен %d, то его место в университете!", years);
        if (years > 24 ) System.out.printf("Если возраст человека равен %d, то ему пора ходить на работу!", years);

        //Task 5
        System.out.println("Task 5");




    }
}
