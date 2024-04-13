public class Main {
    public static void main(String[] args) {

        System.out.println("test1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("test2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("test3");
        for (int i = 0 + 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("test4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("test5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("год является высокосным" + i);
        }
        System.out.println("test6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("test7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("test8");
        int wages = 29000;
        int totalSavings = 0;
        for (int m = 1; m <= 12; m++) {
            totalSavings += wages;
            System.out.println("месяц" + m + " сумма накоплений равна" + totalSavings + "рублей");
        }
        System.out.println("Задача 9");
        int salaryTwo = 29000;
        int totalTwo = 0;
        for (int i = 2; i <= 12; i++) {
            totalTwo = totalTwo + totalTwo/100;
            totalTwo = totalTwo + salaryTwo;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalTwo + " рублей");}

        System.out.println("test10");
        for ( int wTwo = 2; wTwo <= 10; wTwo ++) {
            System.out.println(" 2 * " + wTwo + " = " + 2 * wTwo );
        }

    }
}