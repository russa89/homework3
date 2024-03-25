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



    }
}