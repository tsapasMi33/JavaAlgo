package be.tsapasMi33.exercises;

import java.util.Scanner;

public class NumberComparison2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1st number: ");
        int first = s.nextInt();
        System.out.print("Second number: ");
        int second = s.nextInt();
        if (first > second) {
            System.out.println(first+">"+second);
        } else if (first < second) {
            System.out.println(first+">"+second);
        } else {
            System.out.println(first+"="+second);
        }
    }
}
