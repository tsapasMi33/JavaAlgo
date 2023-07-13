package be.tsapasMi33.exercises;

import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int answer;
        do {
            System.out.print("Please enter a number between 1 and  10: ");
            answer = s.nextInt();
        } while (!(answer>=1 && answer<=10));
        System.out.println("You entered " + answer);
    }
}
