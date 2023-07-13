package be.tsapasMi33.exercises;

import java.util.Scanner;

public class ChessMove2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[][] road = new char[10][10];

        for (int i = 0; i < road.length; i++){
            for (int j = 0; j< road[0].length; j++){
                road[i][j] =  (char) 9633;
            }
        }
        road[4][4] = (char) 9635;
        int x = 4, y =4;
        String move = "z";

        System.out.print("w = up | s = down | a = left | d = right | q = quit");
        while (!move.equals("q")){
            for (int i = 0; i < road.length; i++){
                for (int j = 0; j < road[0].length; j++){
                    System.out.printf("%3c",road[i][j]);
                }
                System.out.println();
            }
            move = s.next();
            if (move.equals("w") && x > 0) {
                road[x][y] = (char) 9633;
                road[x-1][y] = (char) 9635;
                x--;
            } else if (move.equals("s") && x < road.length - 1) {
                road[x][y] = (char) 9633;
                road[x+1][y] = (char) 9635;
                x++;
            } else if (move.equals("a") && y > 0) {
                road[x][y] = (char) 9633;
                road[x][y-1] = (char) 9635;
                y--;
            } else if (move.equals("d") && y < road[0].length - 1) {
                road[x][y] = (char) 9633;
                road[x][y+1] = (char) 9635;
                y++;
            }
        }
    }
}
