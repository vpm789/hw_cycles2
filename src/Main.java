public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
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

}