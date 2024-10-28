public class Main {
    public static void main(String[] args) {
        //Task 1
        byte numByte = 127;
        short numShort = 32767;
        int numInt = Integer.MAX_VALUE;
        long numLong = Long.MAX_VALUE;
        float numFloat = 3.4E38F;
        double numDouble = 1.7E308;
        System.out.println("Task 1");
        System.out.printf("byte numByte = %d%n", numByte);
        System.out.printf("short numShort = %d%n", numShort);
        System.out.printf("int numInt = %d%n", numInt);
        System.out.printf("long numLong = %d%n", numLong);
        System.out.printf("float numFloat = %.2f%n", numFloat);
        System.out.printf("double numDouble = %.2e%n", numDouble);

        //Task 2
        float floatNum = 27.12f; //Можно использовать double но так меньше памяти требуется
        long longNum = 987_678_965_549L;
        double doubleNum = 2.786; //Можно использовать и float но для разнообразия и чаще используется
        short shortNum = 569; // в byte не поместится, но можно использовать int, long
        int intNum = -159; //можно было сделать как и в предидущем примере но int чаще используют для цело численных значений
        short shortNum2 = 27897;
        byte byteNum = 67; //зачем использовать больше памяти, когда можно меньше

        //Task 3
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int totalPaper = 480;
        float sheetsPerStudent = totalPaper / (float) (studentsLP + studentsAS + studentsEA);
        System.out.println("\n" + "Task 3");
        System.out.printf("На каждого ученика рассчитано %.1f листов бумаги", sheetsPerStudent);

        //Task 4


    }
}
