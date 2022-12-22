import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Locale;

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

    public static void task1 () {
        System.out.println("Задача 1");

        byte a = 1;
        System.out.println(a);

        short b = 1;
        System.out.println(b);

        int c = 1;
        System.out.println(c);

        long d = 1;
        System.out.println(d);

        float f = 1;
        System.out.println(f);

        double g = 1;
        System.out.println(g);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        byte a = 67;
        System.out.println(a);

        short b = 569;
        System.out.println(b);

        short b1 = -159;
        System.out.println(b1);

        int c = 27897;
        System.out.println(c);

        long d = 987678965549L;
        System.out.println(d);


        float f = 2.786f;
        System.out.println(f);

        double g = 27.12;
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");

        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        short paperPurchase = 480;
        int allStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        System.out.println("На каждого ученика рассчитано " + paperPurchase/allStudents + " листов бумаги ");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte bottleProductionIn2Min = 16;
        byte timeProduction16Bottles = 2;
        int bottleProductionIn1Min = bottleProductionIn2Min / timeProduction16Bottles;

        byte operatingTimeMin = 20;
        byte operatingTimeDay = 1;
        byte operatingTimeDay3 = 3;
        byte operatingTimeMonth = 31;
        byte minPerHour = 60;
        byte hourPerday = 24;
        System.out.println("За " + operatingTimeMin + " мин машина произведет "
                + operatingTimeMin * bottleProductionIn1Min + " штук бутылок.");

        System.out.println("За " + operatingTimeDay + " сутки машина произведет "
                + operatingTimeDay * hourPerday * minPerHour * bottleProductionIn1Min + " штук бутылок");

        System.out.println("За " + operatingTimeDay3 + " суток машина произведет "
                + operatingTimeDay3 * hourPerday * minPerHour * bottleProductionIn1Min + " штук бутылок");

        System.out.println("За 1 месяц машина произведет "
                + operatingTimeMonth * hourPerday * minPerHour * bottleProductionIn1Min + " штук бутылок");


    }

    public static void task5 () {
        System.out.println("Задача 5");

        byte totalPaintCans = 120;
        byte whitePaintConsumption = 2;
        byte brownPaintConsumption = 4;
        int classSize = totalPaintCans / (whitePaintConsumption + brownPaintConsumption);
        System.out.println("В школе, где " + classSize + " классов, нужно " + whitePaintConsumption * classSize + " банок белой краски и " + brownPaintConsumption * classSize + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача 6");

        byte bananaCount = 5;
        byte bananaOneWeight = 80;
        int allBananaWeight = bananaCount * bananaOneWeight;

        short milkMilliliters = 2;
        byte milk100MillilitersWeight = 105;
        int allMilkWaight = milkMilliliters * milk100MillilitersWeight;

        byte iceCream = 2;
        byte oneIceCreamWeight = 100;
        int allIceCreamWeight = iceCream * oneIceCreamWeight;

        byte eggsRawCount = 4;
        byte oneEggsRawWeight = 70;
        int allEggsRawWeight = eggsRawCount * oneEggsRawWeight;

        int productsWeightGr = allBananaWeight + allMilkWaight + allIceCreamWeight + allEggsRawWeight;
        float productsWeightGr1 = allBananaWeight + allMilkWaight + allIceCreamWeight + allEggsRawWeight;
        float productsWeightKg = productsWeightGr1 / 1000;
        System.out.println("Общий вес продуктов при смешивании в блендере: " +productsWeightGr + " грамм," +
                " или " + productsWeightKg + " килограмм");
    }


    public static void task7 () {
        System.out.println("Задача 7");

        byte overWeightKg = 7;
        int in1KgGrams = 1000;
        int weightLossGr1 = 250;
        int weightLossGr2 = 500;
        int overWeightGr = overWeightKg * in1KgGrams;
        double minDays = (double) overWeightGr / weightLossGr1;
        double maxDays = (double) overWeightGr / weightLossGr2;
        double weightAverageDays = (double) (weightLossGr1 + weightLossGr2) / 2D;
        double averageDays = (double) overWeightGr / weightAverageDays;


        System.out.println(minDays + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(maxDays + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 500 грамм");
        System.out.printf(Locale.US,"В среднем на похудение уйдет кол-во дней %.2f%n",
                 averageDays);
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int kristinaSalary = 76230;
        int denisSalary = 83690;
        double index = 1.1;

        double mashaSalary10 = mashaSalary * index;
        double kristinaSalary10 = kristinaSalary * index;
        double denisSalary10 = denisSalary * index;

        double annualMashaSalary = 12 * mashaSalary;
        double annualkristinaSalary = 12 * kristinaSalary;
        double annualdenisSalary = 12 * denisSalary;
        double newMashaSalary = 12 * mashaSalary10;
        double newKristinaSalary = 12 * kristinaSalary10;
        double newDenisSalary = 12 * denisSalary10;

        System.out.printf(Locale.US,"Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", mashaSalary10,newMashaSalary - annualMashaSalary);
        System.out.printf(Locale.US,"Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", kristinaSalary10,newKristinaSalary - annualkristinaSalary);
        System.out.printf(Locale.US,"Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", denisSalary10,newDenisSalary - annualdenisSalary);

    }

}