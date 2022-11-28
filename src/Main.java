public class Main {
    public static void main(String[] args) {
        task1to3();
        task4();
        task5();
        task6to7();
        task8();
    }
    public static void task1to3() {
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog + 4 = " + dog + " cat + 4 = " + cat + " paper + 4 = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog - 3.5 = " + dog + " cat - 1.6 = " + cat + " paper - 7639 = " + paper);
    }
    public static void task4() {
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend * 2;
        System.out.println("friend * 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);
    }
    public static void task5() {
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
    }
    public static void task6to7() {
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        System.out.println("вес первого боксера = " + firstFighter + " кг");
        System.out.println("вес первого боксера = " + secondFighter + " кг");
        var summa = firstFighter + secondFighter;
        System.out.println("общий вес двух спортсменов = " + summa + " кг");
        var difference = secondFighter - firstFighter;
        System.out.println("разница между весами спортсменов = " + difference + " кг");
        var difference2 = secondFighter % firstFighter;
        System.out.println("разница между весами спортсменов = " + difference2 + " кг");
    }
    public static void task8() {
        var allHour = 640;
        var workHour = 8;
        var worker = allHour / workHour;
        System.out.println("Всего работников в компании — " + worker + " человек");
        worker = worker + 94;
        var allHour2 = worker * workHour;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + allHour2 + " часов работы может быть поделено между сотрудниками");
    }

}