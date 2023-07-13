package be.tsapasMi33.exercises;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of side: ");
        int side = s.nextInt();

        int[][] table = new int[side][side];

        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.printf("Enter value %d,%d : ", i, j);
                table[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.printf("%3d", table[i][j]);
            }
            System.out.println();
        }

        boolean isMagic = true;

        int checker = 0;
        for (int j = 0; j < side; j++){
            checker += table[0][j];
        }


        for (int i = 0; i < side; i++){
            int lineSum = 0;
            for (int j = 0; j < side; j++){
                lineSum += table[i][j];
            }
            if (lineSum != checker) {
                isMagic = false;
            }
        }

        for (int i = 0; i < side; i++){
            int lineSum = 0;
            for (int j = 0; j < side; j++){
                lineSum += table[j][i];
            }
            if (lineSum != checker) {
                isMagic = false;
            }
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < side; i++) {
            diag1 += table[i][i];
            diag2 += table[side - i - 1][side - i - 1];
        }
        if (diag1 != checker || diag2 != checker) {
            isMagic = false;
        }

        if (isMagic){
            System.out.println("Magic!!");
        } else {
            System.out.println("Regular :(");
        }
    }
}
