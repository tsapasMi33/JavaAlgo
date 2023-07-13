package be.tsapasMi33.exercises;

import java.util.Scanner;

public class ChessMove1D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] road = new char[7];

        for (int i = 0; i < road.length; i++) {
            road[i] = (char) 9633;
        }
        road[3] = (char) 9635;
        int pos = 3;

        String move = "a";
        System.out.println("a for left\nd for right\n q to quit");
        while (!move.equals("q")) {
            for (int i = 0; i < road.length; i++) {
                System.out.print(road[i]);
            }
            move = s.next();
            if(move.equals("a") && pos > 0) {
                road[pos] = (char) 9633;
                road[pos - 1] = (char) 9635;
                pos--;
            }
            if(move.equals("d") && pos < road.length - 1) {
                road[pos] = (char) 9633;
                road[pos + 1] = (char) 9635;
                pos++;
            }

        }
    }
}
