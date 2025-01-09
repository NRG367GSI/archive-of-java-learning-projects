import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //поля, потом конструктор и только потом методы, только в таком порядке

        //В классе Employee была создана поле с таким именем fullNameEmployee, слишком сложное имя лучше так fullName

        //Там где можно использовать примитивные типы данных не использовать классы обертки: Использовать int вместо Integer

        //Имена методов должны начинаться с маленькой буквы и быть глаголом т.н. не count(считать),
        // а incrementCount(увеличивает колличество). Вроде и то глагол ну так сказали.

        //ключивое слово this используют в:
        // - геттерах, сеттерах и конструкторах для разрешения конфликта имен
        // - Для явного указания объекта: System.out.println("Name: " + this.name); // this указывает на текущий объект
        // - Передача текущего объекта в метод EmailService.send(this); // Передача текущего объекта
        //this не используют
        // - если нет конфликта имен
        // - в статических методах в принципе нельзя использовать this
        // - в простых методах без конфликтов
        // - В лямбда-выражениях
        // - В лямбда-выражениях
        // - В методах, где нет необходимости указывать текущий объект

        //Было задание вывести список всех сотрудников, я для этого создал метод в классе public String outFulNameEmployee()
        // который выводит имена сотрудников но это не функция класса если и создовать метод то не в классе а может и вовсе нет смысла

        //Не создавать лишние поля в классе

        // Когда выводим массив объектов он может быть пустым т.е. иметь значение null,
        // что может привести к ошибке, нужно делать проверку на пустой массив. Для решения этой проблемы можно использовать
        //Проверку на ноль, флаги и Stream API


        Book book = new Book(10);
        People people1 = new People("Ivan", "Ivanovic");
        book.addPeople(7, people1);
        System.out.println(book.outBook());

        //Использование Stream API (Java 8+)
        book.printEmployees();
        //_________

        /**
         * public или private
         * Если конструктор Department(String description) объявлен как private, то объекты класса Department могут быть
         * созданы только внутри самого класса Department.
         *
         *  Это означает, что вы не сможете создать объект Department в других классах, что делает класс практически бесполезным.
         *
         *
         */


    }

}

class Book {
    People[] book;

    public Book(int size) {
        this.book = new People[size];
    }

    public void addPeople(int index, People people) {
        this.book[index] = people;
    }

    //Использование флага
    public boolean outBook() {
        boolean hasEmployees = false; // Флаг для проверки, есть ли хотя бы один сотрудник
        if (book == null || book.length == 0) {
            System.out.println("Массив пуст или не инициализирован.");
            return false;
        }

        for (People employee : this.book) {
            if (employee != null) {
                System.out.println(employee); // Вывод сотрудника
                hasEmployees = true; // Устанавливаем флаг, если найден сотрудник
            }
        }

        if (!hasEmployees) {
            System.out.println("Массив содержит только null элементы.");
            return hasEmployees;
        }
        return hasEmployees;
    }

    //использование Stream API (Java 8+):
    public void printEmployees() {
        if (book == null || book.length == 0) {
            System.out.println("Массив пуст или не инициализирован.");
            return;
        }

        //Создает поток из массива book
        long count = Arrays.stream(book)

                //при помощи лямбда вырожения фильтрует null элементы
                .filter(employee -> employee != null) // Фильтруем null элементы

                //
                .peek(element -> System.out.println(element)) // Выводим оставшиеся элементы
                .count(); // Считаем количество сотрудников

        if (count == 0) {
            System.out.println("Массив содержит только null элементы.");
        }
    }



}



class People {
    int id;
    String firstName;
    String secondName;

    public static int count = 1;

    public People(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = incrementCount();
    }

    public static int incrementCount() {
        return count++;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, firstName, secondName);
    }
}