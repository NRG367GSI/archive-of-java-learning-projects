public class Main {
    public static void main(String[] args) {
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
    }
}
