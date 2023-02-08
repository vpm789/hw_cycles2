import java.time.LocalDate;
import java.util.Random;

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
        System.out.println("Задача №1");
        int total = 0;
        int deposit = 15000;
        int month = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + deposit;
            month = month + 1;
            if (month % 12 == 0 || total >= 2459000) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }

    }

    public static void task2() {
        System.out.println("");
        System.out.println("Задача №2");
        int i = 0;
        while (i <= 9) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int i = 0;
        do {
            population = population + birthRate * population / 1000 - deathRate * population / 1000;
            i = i + 1;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        while (i < 10);
    }

    public static void task4() {
        System.out.println("");
        System.out.println("Задача №4");
        int deposit = 15000;
        int percent = 7;
        int total = 0;
        int month = 0;
        while (total <= 12000000) {
            total = (int) (total + (total * 0.07));
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("");
        System.out.println("Задача №5");
        int deposit = 15000;
        int percent = 7;
        int total = 0;
        int month = 0;
        while (total <= 12000000) {
            total = (int) (total + (total * 0.07));
            total = total + deposit;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
        int deposit = 15000;
        int percent = 7;
        int total = 0;
        int month = 0;
        while (month <= 12 * 9) {
            total = (int) (total + (total * 0.07));
            total = total + deposit;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }

    }

    public static void task7() {
        System.out.println("");
        System.out.println("Задача №7");
        int[] PossibleDayFirstFriday = {1, 2, 3, 4, 5, 6, 7};
        int dayOfFirstFriday = new Random().nextInt(PossibleDayFirstFriday.length + 1);
        int daysInMonth = 31;
        do {
            System.out.println("Сегодня пятница, " + dayOfFirstFriday + "-е число. Необходимо подготовить отчет");
            dayOfFirstFriday = dayOfFirstFriday + 7;
        }
        while (dayOfFirstFriday < daysInMonth);
    }

    public static void task8() {
        System.out.println("");
        System.out.println("Задача №8");
        int cometYear = 0;
        int cometPeriod = 79;
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int lowYear = currentYear - 200;
        int highYear = currentYear + 100;
        while (cometYear <= highYear) {
            cometYear = cometYear + cometPeriod;
            if (cometYear > lowYear && cometYear < highYear) {
                System.out.println(cometYear);
            }
        }

    }
}