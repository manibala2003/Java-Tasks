package day;

import java.text.NumberFormat;
import java.util.*;

public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
String US = us.format(amount);
String CH = ch.format(amount);
String FR = fr.format(amount);
String IN = in.format(amount);
System.out.println("us: "+US);
System.out.println("IN: "+CH);
System.out.println("chi: "+FR);
System.out.println("Fra: "+IN);

        

        sc.close();
    }
}
