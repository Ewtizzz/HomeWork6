public class Main {
    public static void main(String[] args) {
        for (var i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным!");
        }
        for (var i = 1; i <= 14; i++){
            System.out.println(7 * i);
        }
        int tek = 1;
        System.out.println(tek);
        for (var i = 1; i <= 9; i++){
            tek *= 2;
            System.out.println(tek);
        }

        int salary = 29000;
        for(var i = 1; i <= 12;i++){
            System.out.println("Месяц " + i + ", сумма накоплений = " + salary * i);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        int newSalary = 29000;
        double sumWithPercent = 0;
        double percent = 0.12;
        for(var i = 1; i <= 12;i++){
            sumWithPercent = (sumWithPercent + salary) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений = " + sumWithPercent);
        }
    }
}