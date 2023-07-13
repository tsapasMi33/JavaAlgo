package be.tsapasMi33.demo;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter something here: ");
        String myString = s.nextLine();
        System.out.println("-----\n" + myString + "\n-----");
        System.out.println("That's what you said!");

        System.out.println("Day: ");
        int day = s.nextInt();
        System.out.println("Month: ");
        int month = s.nextInt();
        System.out.println("Year: ");
        int year = s.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        System.out.println(date);
    }
}
