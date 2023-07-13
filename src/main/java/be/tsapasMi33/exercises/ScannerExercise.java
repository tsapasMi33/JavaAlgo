package be.tsapasMi33.exercises;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = s.nextLine();
        System.out.println("Hello " + name + ". Welcome!");
        String dayString = capitalize(String.valueOf(LocalDate.now().getDayOfWeek()));
        String dayNum = String.valueOf(LocalDate.now().getDayOfMonth());
        dayNum = switch (dayNum) {
            case "1" -> "1st";
            case "2" -> "2nd";
            case "3" -> "3rd";
            default -> dayNum + "th";
        };
        String month = capitalize(String.valueOf(LocalDate.now().getMonth()));
        String year = String.valueOf(LocalDate.now().getYear());
        System.out.println("Today is " + dayString + ", the " + dayNum + " " + month + " " + year);
        System.out.println("""
                                                  .-.
                     (___________________________()6 `-,
                     (   ______________________   /''"`
                     //\\\\                      //\\\\
                     "" ""                     "" ""
                """);
    }

    public static String capitalize(String in){
        return in.substring(0,1).toUpperCase() + in.substring(1).toLowerCase();
    }
}
