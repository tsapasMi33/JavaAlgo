package be.tsapasMi33.exercises;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = s.nextInt();
        int current = 1, minusO = 1, minusT = 0;
        if (length >= 1)
            System.out.println(minusT);
        if (length >= 2)
            System.out.println(minusO);
        for (int i= 2; i < length; i++){
            System.out.println(current);
            minusT = minusO;
            minusO = current;
            current = minusO + minusT;
        }
    }
}
