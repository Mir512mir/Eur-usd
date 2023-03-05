package convert;

public class Convert1 {
    public static void convertEurToUsdVoid(double eur) {
        double result = eur * 1.06;
        System.out.println(eur + " Euro is " + result + " in USD");
    }

    public static double convertEurToUsd(double eur) {
        return eur * 1.06;
    }
}
