package be.tsapasMi33.exercises;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter table size: ");
        int size = s.nextInt();
        int[] table = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter number #" + (i+1));
            table[i] = s.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();

        int max = Integer.MIN_VALUE;
        int pmax = -1;

        for (int i = 0; i < size; i++) {
            if (table[i] > max) {
                max = table[i];
                pmax = i;
            }
        }

        System.out.println("Max = " + max + "\nIndex = " + pmax);
    }
}
