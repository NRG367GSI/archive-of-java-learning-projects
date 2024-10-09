public class Main {
    public static void main(String[] args) {
        //задача1:
        //переменной dog значение 8.0;
        //переменной cat значение 3.6;
        //переменной paper значение 763789.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("\n" + "Задача 1:");
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        //Задача 2
        //Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4. Для решения этой задачи используйте тип переменной var.
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("\n" + "Задача 2");
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        //Задача 3
        //Теперь нужно уменьшить значение каждой переменной:
        //
        // dog уменьшить на 3.5;
        // cat уменьшить на 1.6;
        // paper уменьшить на 7639.
        System.out.println("\n" + "Задача 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        //Задача 4
        //Инициализируйте (присвойте значение) переменную friend значением 19.
        //
        //Увеличьте значение переменной на 2, после чего поделите значение на 7.
        //
        //После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 3 значения одной переменной.
        //
        //Для решения этой задачи используйте тип переменной var.

        System.out.println("\n" + "Задача 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2 ;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        //Инициализируйте переменную frog значением 3.5.
        //
        //Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4.
        //
        //После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 4 значения одной переменной.
        //
        //Для решения этой задачи используйте тип переменной var.

        System.out.println("\n" + "Задача 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        //В боксе перед каждым боем спортсменов взвешивают. Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и бой будет честным.
        //
        //Масса одного боксера — 78.2 кг.
        //
        //Масса второго боксера — 82.7 кг.
        //
        //Подсчитайте и выведите в консоль общую массу двух бойцов.
        //
        //Подсчитайте и выведите в консоль разницу между массами бойцов. Для решения этой задачи используйте тип переменной var.

        var firstBoxserWeight = 78.2;
        var secondBoxserWeight = 82.7;
        System.out.println("\n" + "Задача 6:");
        System.out.println("Суммарна масса боксеров: " + firstBoxserWeight + secondBoxserWeight + "кг");
        System.out.println("Разница в весе двух боксеров составляет: " + (secondBoxserWeight - firstBoxserWeight)  + "кг");

        //Задача 7
        //Найдите остаток от деления между двумя весами. Для решения этой задачи используйте тип переменной var.
        System.out.println("\n" + "Задача 7:");
        var remainderMassDivision = secondBoxserWeight % firstBoxserWeight;
        System.out.println("Остаток от деления между двумя массами: " + remainderMassDivision  + "кг");

        //Задача 8
        //Решите задачу с помощью арифметических функций.
        /*
        640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов, то сколько всего
        работников в компании? Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».
        Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека
        больше. Выведите результат задачи в консоль в формате: «Если в компании работает … человек, то всего … часов
        работы может быть поделено между сотрудниками».
        Для решения этой задачи используйте тип переменной var.
         */

        var workingTimeFund = 640.0;
        var workingHours = 8.0;
        var requiredNumberEmployees = workingTimeFund / workingHours;
        System.out.println("\n" + "Задача 8:");
        System.out.println("Всего работников в компании — " + requiredNumberEmployees + " человек");

        var expectedNumberEmployees = requiredNumberEmployees + 94;
        workingHours = workingTimeFund / expectedNumberEmployees;
        System.out.println("Если в компании работает " + expectedNumberEmployees + " человек, то всего " + workingHours +
                " часов работы может быть поделено между сотрудниками");

    }
}