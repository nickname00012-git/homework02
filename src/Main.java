public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var taskN = 1;


        // Task 1

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println("dog:    " + dog);
        System.out.println("cat:    " + cat);
        System.out.println("paper:  " + paper);
        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println("dog:    " + dog);
        System.out.println("cat:    " + cat);
        System.out.println("paper:  " + paper);
        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println("dog:    " + dog);
        System.out.println("cat:    " + cat);
        System.out.println("paper:  " + paper);
        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 4

        System.out.println("Task " + taskN + ".");
        System.out.println("=======");

        var friend = 19;
        System.out.println("friend:    " + friend);

        friend = friend + 2;
        System.out.println("friend:    " + friend);

        friend = friend / 7;
        System.out.println("friend:    " + friend);

        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 5
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");

        var frog = 3.5;
        System.out.println("frog:    " + frog);

        frog = frog * 10;
        System.out.println("frog:    " + frog);

        frog = frog / 3.5;
        System.out.println("frog:    " + frog);

        frog = frog + 4;
        System.out.println("frog:    " + frog);

        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 6
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");

        var sportsmanWeight1 = 78.2;
        var sportsmanWeight2 = 82.7;

        System.out.println("Общий вес:         " + (sportsmanWeight1 + sportsmanWeight2) + " кг");
        System.out.println("Разница в весе:    " + (sportsmanWeight2 - sportsmanWeight1) + " кг");

        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 7
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");

        System.out.println("Остаток от деления (веса спортсменов):    " + (sportsmanWeight2 % sportsmanWeight1) + " кг");

        System.out.println();
        System.out.println();
        taskN = taskN + 1;

        // Task 8
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");

        var fullWork = 640;
        var workPerMan = 8;
        var workerNumber = fullWork / workPerMan;

        System.out.println("Всего работников в компании — " + workerNumber + " человек.");
        workerNumber = workerNumber + 94;
        fullWork = workerNumber * workPerMan;
        System.out.println("Если в компании работает " + workerNumber + " человек(a), то всего " + fullWork + " часов работы может быть поделено между сотрудниками.");


    }
}