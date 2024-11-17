import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        int[] arr3 = new int[12];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }

        //Task 2
        System.out.println("Task 2");
        //arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
        }

        //arr2
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
        }


        //arr3
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1) {
                System.out.print(", ");
            }
        }

        //Task 3
        System.out.println("\n");
        System.out.println("Task 3");

        //arr1
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //arr2
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //arr3
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //Task 4
        System.out.println("\n");
        System.out.println("Task 4");

        int[] seq = arr1;
        for (int i = 0; i < seq.length; i++){
            if (seq[i] % 2 != 0) {
                seq[i] += 1;
            }
            System.out.print(seq[i]);
            if (i < seq.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(seq));







    }
}
