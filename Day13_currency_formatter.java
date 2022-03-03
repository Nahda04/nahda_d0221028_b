import java.util.*;

import java.text.*;

public class Solution {

    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        scanner.close();

        

        // Write your code here.

        NumberFormat fUS = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat findia = NumberFormat.getCurrencyInstance(new Locale("en","in"));

        NumberFormat fchina = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat ffrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        

        String us = fUS.format(payment);

        String india = findia.format(payment);

        String china = fchina.format(payment);

        String france = ffrance.format(payment);

         

        

        System.out.println("US: " + us);

        System.out.println("India: " + india);

        System.out.println("China: " + china);

        System.out.println("France: " + france);

    }

}

