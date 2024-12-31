public class Main {
    public static void main(String[] args){
        Integer value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }

    public static void changeValue(Integer value){
        value = 22;
    }
}