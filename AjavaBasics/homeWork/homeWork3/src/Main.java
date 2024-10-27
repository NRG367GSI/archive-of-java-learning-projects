public class Main {
    public static void main(String[] args) {
        //Task 1
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2_147_483_647;
        long numLong = 9_223_372_036_854_775_807L;
        float numFloat = 3.4E+38f;
        double numDouble = 1.7E+308;

        System.out.println("Task 1");

        System.out.printf("byte numByte = %d%n", numByte);
        System.out.printf("short numShort = %d%n", numShort);
        System.out.printf("int numInt = %d%n", numInt);
        System.out.printf("long numLong = %d%n", numLong);
        System.out.printf("float numFloat = %.2f%n", numFloat);
        System.out.printf("double numDouble = %.2e%n", numDouble);

        //Task 2
        float floatNum = 27.12f; //Думаю чаще всего используют double для дробных значений, ну сэкономим память
        long longNum = 987_678_965_549L;
        double doubleNum = 2.786;





    }
}