package PCT-Practice;


import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        double payment = input.nextDouble();
        input.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("en" , "in"));
        String india = nf1.format(payment);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf2.format(payment);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf3.format(payment);

        System.out.println("US: $" + us);
        System.out.println("India: Rs." + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
