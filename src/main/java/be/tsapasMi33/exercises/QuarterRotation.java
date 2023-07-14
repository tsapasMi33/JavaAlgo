package be.tsapasMi33.exercises;

import java.util.Scanner;

public class QuarterRotation {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of side: ");
        int side = s.nextInt();

        int[][] table = new int[side][side];

        int count=0;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                table[i][j] = count++;
            }
        }

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.printf("%3d", table[i][j]);
            }
            System.out.println();
        }

        int[][] tempTable = new int[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                tempTable[j][side - 1 - i] = table[i][j];
            }
        }
        table = tempTable;

        System.out.println("---------------------");
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.printf("%3d", table[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------------------");
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}
