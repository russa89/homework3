public class Main {
    public static void main(String[] args) {
        byte a = 100;
        short b = 1000;
        int c = 5000;
        long d = 10000L;
        float e = 3.5f;
        double f = 5.5;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        byte A = 67;
        short B = 569;
        int C = 27897;
        long D = 987678965549L;
        float E = 27.12f;
        double F = 2.786;

        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short paper = 480;
        int qttyForChild = paper / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + qttyForChild + " листов бумаги");

    byte bottles = 16;
    byte standartTime = 2;
    int producityPerMinute = bottles / standartTime;
    byte producity20 = 20;
    int producityFirst = producityPerMinute * producity20;
        System.out.println("За " + producity20 + " минут машина произвела " + producityFirst + " бутылок");
    int day = 60 * 24;
    int producityDay = producityPerMinute * day;
        System.out.println("За сутки машина произвела " + producityDay + " бутылок");
    int days3 = day * 3;
    int producityDays3 = producityPerMinute * days3;
        System.out.println("За 3 дня машина произвела " + producityDays3 + " бутылок");
    int month = day * 30;
    int producityMonth = producityPerMinute * month;
        System.out.println("За 1 месяц машина произвела " + producityMonth + " бутылок");

byte potsTotal = 120;
byte whitePaintPerClass = 2;
byte brownPaintPerClass = 4;
int classesQtty = potsTotal / (whitePaintPerClass + brownPaintPerClass);
int totalWhitePaint = whitePaintPerClass * classesQtty;
int totalBrownPaint = brownPaintPerClass * classesQtty;
        System.out.println("В школе, где " + classesQtty + " классов, нужно " + totalWhitePaint + " банок белой краски и " +
                totalBrownPaint + " банок коричневой краски");
byte bananas = 5;
byte milk = 2;
byte egg = 4;
byte iceCream = 2;
byte bananaWeight = 80;
byte eggWeight = 70;
byte milkWeight = 105;
byte iceCreamWeight = 100;
double breakfastWeight = (bananas * bananaWeight) + (milk * milkWeight) + (egg * eggWeight) +
        (iceCream * iceCreamWeight);
int oneKg = 1000;
double breakfastWeightKg = (breakfastWeight / oneKg);
        System.out.println("Вес такого спортзавтрака равен " + breakfastWeight +
                " гр. или " + breakfastWeightKg + " кг.");

byte result = 7;
int resultInGramms = result * oneKg;
short lossOption1 = 250;
short lossOption2 = 500;
int lossResultOption1 = resultInGramms / lossOption1;
int lossResultOption2 = resultInGramms / lossOption2;
        System.out.println(lossResultOption1 + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(lossResultOption2 + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 500 грамм");
int averageResult = (lossResultOption1 + lossResultOption2) / 2;
        System.out.println("При применении смешанной схемы у спортсмена на похудение уйдет " +
                averageResult + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte monthsPerYear = 12;


        int yearSalaryMasha = salaryMasha * monthsPerYear;
        int yearSalaryDenis = salaryDenis * monthsPerYear;
        int yearSalaryKristina = salaryKristina * monthsPerYear;

        int newSalaryMasha = salaryMasha + (salaryMasha * 10 / 100);
        int yearNewSalaryMasha = newSalaryMasha * monthsPerYear;
        int yearDifferenceSalaryMasha = yearNewSalaryMasha - yearSalaryMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос" +
                " на " + yearDifferenceSalaryMasha + " рублей.");

        int newSalaryDenis = salaryDenis + (salaryDenis * 10 / 100);
        int yearNewSalaryDenis = newSalaryDenis * monthsPerYear;
        int yearDifferenceSalaryDenis = yearNewSalaryDenis - yearSalaryDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос" +
                " на " + yearDifferenceSalaryDenis + " рублей.");

        int newSalaryKristina = salaryKristina + (salaryKristina * 10 / 100);
        int yearNewSalaryKristina = newSalaryKristina * monthsPerYear;
        int yearDifferenceSalaryKristina = yearNewSalaryKristina - yearSalaryKristina;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос" +
                " на " + yearDifferenceSalaryKristina + " рублей.");
         ;


    }
}