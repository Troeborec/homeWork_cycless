public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача №1");
        for (int i = 1; i<=10; i = i + 1){
            System.out.println(i);
        }
        //task 2
        System.out.println("Задача №2");
        for (int i = 10; i >= 1 ; i = i-1) {
            System.out.println(i);
        }
        //task 3
        System.out.println("Задача №3");
        for (int i = 0; i <= 17 ; i = i + 2) {
            System.out.println(i);
        }
        //task 4
        System.out.println("Задача №4");
        for (int i = 10; i >= -10 ; i = i - 1) {
            System.out.println(i);
        }
        //task 5
        System.out.println("Задача №5");
        for (int year = 1904; year <= 2096 ; year = year + 4) {
            if (year %4 == 0 && year % 100 !=0 || year % 400 == 0){
                System.out.println(year + " год является високосным");
            }
        }
        //task 6
        System.out.println("Задача №6");
        for (int i = 7; i <=98 ; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task 7
        System.out.println("Задача №7");
        int balance = 1;
        System.out.print(balance + " ");
        for (int i = 0; i < 9; i++) {
            balance = balance *2;
            System.out.print(balance + " ");
        }
        System.out.println();
        //task 8
        System.out.println("Задача №8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <=12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //task 9
        System.out.println("Задача №9");
        int salary_2 = 29_000;
        double totalWithPerсent = 0;
        double persent = 0.01;
        for (int i = 1; i < 12; i++) {
            totalWithPerсent = (totalWithPerсent + salary_2) * (1 + persent) ;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalWithPerсent + " рублей ");
        }
        //task 10
        System.out.println("Задача №10");
        int number = 2;
        int numberOne = 1;
        for (int i = 1; i <= 10 ; i++) {
            numberOne = number * i;
            System.out.println(number + "*" + i + "=" + numberOne);
        }
        }
    }

