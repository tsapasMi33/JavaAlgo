package be.tsapasMi33.exercises;

import java.util.Scanner;

public class SortDescending { public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of players: ");
    int players = s.nextInt();
    int[] scores = new int[players];
    for (int i = 0; i < scores.length; i++) {
        System.out.println("Enter score for player " + (i + 1));
        scores[i] = s.nextInt();
    }

    for (int i = 1; i < scores.length; i++){
        int j = i;
        while (j-1 >= 0 && !(scores[j] < scores[j-1])){
            int temp = scores[j];
            scores[j] = scores [j - 1];
            scores [j - 1] = temp;
            j--;
        }
    }

    System.out.println("Scores entered: ");
    for (int i = 0; i < scores.length; i++) {
        System.out.print("Place " + (i + 1) + ": ");
        System.out.println(scores[i]);
    }
}
}
