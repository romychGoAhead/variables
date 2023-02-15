public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8 + 4;
        System.out.println(dog);
        var cat = 3.6 + 4;
        System.out.println(cat);
        var paper = 763789 + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8 - 3.5;
        System.out.println(dog);
        var cat = 3.6 - 1.6;
        System.out.println(cat);
        var paper = 763789 - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightsecondBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightsecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeightBoxers + "кг.");
        var weightDifferenceBetweenBoxers = weightFirstBoxer - weightsecondBoxer;
        System.out.println("Разница между весами боксеров " + weightDifferenceBetweenBoxers + "кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightFirstBoxer = 78.2;
        var weightsecondBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightsecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeightBoxers + "кг.");
        var weightDifferenceBetweenBoxers = weightsecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весами боксеров " + weightDifferenceBetweenBoxers + "кг");
        var weightDifferenceBetweenBoxers2 = weightsecondBoxer % weightFirstBoxer;
        System.out.println("Разница между весами боксеров " + weightDifferenceBetweenBoxers2 + "кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalNumberHours = 640;
        var everyEmployeeWorks = 8;
        var totalEmployeesTheCompany = totalNumberHours / everyEmployeeWorks;
        System.out.println("Всего работников в компании " + totalEmployeesTheCompany + " человек.");
        totalEmployeesTheCompany = totalEmployeesTheCompany + 94;
        System.out.println("С учетом увеличения, количество работников составило " + totalEmployeesTheCompany + " человек.");
        var numberHoursPerEmployee = totalNumberHours / totalEmployeesTheCompany;
        System.out.println("Если в компании работает " + totalEmployeesTheCompany + " человека, то всего " + numberHoursPerEmployee + " часа работы может быть поделено между сотрудниками.");
    } // 1. Не совсем понятен последний вопрос? 2. Если я, правильно понял условие, то не понятно как с останком вывести число 3,67 ч.


}