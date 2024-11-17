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
        System.out.println("\n");

        //arr2
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j]);
            if (j < arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        //arr3
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k]);
            if (k < arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        //Task 3
        System.out.println("Task 3");
        for (int i1 = arr1.length - 1; i1 >= 0; i1--) {
            System.out.print(arr1[i1]);
            if (i1 > 0) {
                System.out.print(", ");
            }

        }
    }
}
