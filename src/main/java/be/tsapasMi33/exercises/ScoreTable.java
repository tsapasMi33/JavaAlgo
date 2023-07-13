package be.tsapasMi33.exercises;

import java.util.Scanner;

public class ScoreTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = s.nextInt();
        int[] scores = new int[players];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter score for player " + (i + 1));
            scores[i] = s.nextInt();
        }

        System.out.println("Scores entered: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            System.out.println(scores[i]);
        }

    }
}
