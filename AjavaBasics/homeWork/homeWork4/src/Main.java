import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        Random rd = new Random();
        int numberPeople = rd.nextInt(0, 100);
        if (numberPeople >= 18) {
            System.out.printf("Если возраст человека равен: %d, то он совершеннолетний!", numberPeople);
        } else {
            System.out.printf("Если возраст человека равен: %d, то он не достиг совершеннолетия, нужно не много подождать!", numberPeople);
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
        if (years > 2 && years < 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад!\n", years);
        } else if (years >= 6 && years < 17) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу!\n", years);
        } else if (years >= 18 && years <= 24) {
            System.out.printf("Если возраст человека равен %d, то его место в университете!\n", years);
        } else if (years > 24) {
            System.out.printf("Если возраст человека равен %d, то ему пора ходить на работу!\n", years);
        }
        System.out.println();

        //Task 5
        System.out.println("Task 5");
        int yearsChild = rd.nextInt(0, 15);
        if (yearsChild < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе!\n", yearsChild);
        } else if (yearsChild >= 5 && yearsChild < 14) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя!\n", yearsChild);
        } else {
            System.out.printf("Если возраст ребенка равен %d, то он может кататься без сопровождения взрослого!\n", yearsChild);
        }
        System.out.println();

        //Task 6
        System.out.println("\n");
        System.out.println("Task 6");

        int numberOfPeople = rd.nextInt(0, 103);
        if (numberOfPeople < 60 && numberOfPeople > 0) {
            System.out.printf("В вагоне человек: %d, есть сидячие места!", numberOfPeople);
        } else if ( numberOfPeople > 60 && numberOfPeople < 102){
            System.out.printf("В вагоне человек: %d, нет сидячие мест!", numberOfPeople);
        } else {
            System.out.printf("В вагоне человек: %d, в вагоне нет мест!", numberOfPeople);
        }

        //Task 7
        System.out.println("\n");
        System.out.println("Task 7");
        int one = rd.nextInt(-100, 101);
        int two = rd.nextInt(-100, 101);
        int three = rd.nextInt(-10, 101);
        if (one >= two) {
            if (three >= one) {
                System.out.println("Сгенерированные числа: " + one + ", " + two + ", " + three);
                System.out.printf("из трех чисел бо́льшее three = %d", three);
            } else {
                System.out.println("Сгенерированные числа: " + one + ", " + two + ", " + three);
                System.out.printf("из трех чисел бо́льшее one = %d", one);
            }
        } else {
            if (two >= three) {
                System.out.println("Сгенерированные числа: " + one + ", " + two + ", " + three);
                System.out.printf("из трех чисел бо́льшее two = %d", two);
            }else {
                System.out.println("Сгенерированные числа: " + one + ", " + two + ", " + three);
                System.out.printf("из трех чисел бо́льшее three = %d", three);
            }
        }








    }
}
