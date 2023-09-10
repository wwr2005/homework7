import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Задача №1");
        int amount = 2459000;
        int payment = 15000;
        double Total = 0;
        int month = 1;
        while (Total <= amount) {
            Total = Total + payment;
            System.out.println("Месяц " + month + " сумма накоплений равна " + numberFormat.format(Total));
            month++;
        }
        System.out.println();

        System.out.println("Задача №2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Задача №3");
        int population = 12000000;
        int BirthRate = 17;
        int mortality = 8;
        int years = 10;
        int currentYear = 2023;
        for (int year = currentYear; year < currentYear + years; year++) {
            population = population + population * (BirthRate - mortality) / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        System.out.println();

        System.out.println("Задача №4");
        Total = 15000;
        month = 1;
        amount = 12000000;
        double percent = 7D / 100;
        while (Total <= amount) {
            Total = Total * (1 + percent);
            System.out.println("Месяц " + month + " сумма накоплений равна " + Total + numberFormat.format(Total));
            month++;
        }

        System.out.println();

        System.out.println("Задача №5");
        Total = 15000;
        month = 1;
        while (Total <= amount) {
            Total = Total * (1 + percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + Total + numberFormat.format(Total));
            }
            month++;
        }

        System.out.println();

        System.out.println("Задача №6");
        Total = 15000;
        month = 1;
        int months = 9 * 12;
        while (month <= months) {
            Total = Total * (1 + percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + Total + numberFormat.format(Total));
            }
            month++;
        }

        System.out.println();

        System.out.println("Задача №7");
        int firstFriday = 1;
        for (int day = 0; day <= 31; day++){
            if (day % 7 == firstFriday){
                System.out.println("Сегодня пятница " + day + "-е число");
            }
        }

        System.out.println();

        System.out.println("Задача №8");
        int period = 79;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = 0; year <= endYear; year += period) {
            if (year >= startYear) {
                System.out.println(year);
            }
        }

    }
}