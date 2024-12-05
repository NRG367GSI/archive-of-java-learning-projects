class Foo {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    static void updateObject(Foo foo) {
        foo.setValue(50);
        foo = new Foo(100);
    }

    public static void main(String[] args) {
        Foo foo = new Foo(30);
        updateObject(foo);
        System.out.println(foo.getValue());  // Выводит: 50
    }
}