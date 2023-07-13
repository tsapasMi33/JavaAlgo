package be.tsapasMi33.exercises;

import java.util.Scanner;

public class SecondsConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter seconds");
        int sec = s.nextInt();
        int years = sec / 31536000;
        sec = sec % 31536000;
        int months = sec / 2628288;
        sec = sec % 2628288;
        int days = sec / 86400;
        sec = sec % 86400;
        int hours = sec / 3600;
        sec = sec % 3600;
        int mins = sec / 60;
        sec = sec %60;

        System.out.printf("Years: %d\nMonths: %d\nDays: %d\nHours: %d\nMinutes: %d\nSeconds: %d",years,months,days,hours,mins,sec);
    }
}
