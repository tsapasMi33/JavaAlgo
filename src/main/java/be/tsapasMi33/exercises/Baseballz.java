package be.tsapasMi33.exercises;

import java.util.Scanner;

public class Baseballz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalBalls = 5;
        boolean play = true;
        while (play) {
            boolean isReady;
            do {
                System.out.println("Press y if ready or anything else if not");
                isReady = s.next().equalsIgnoreCase("y");
                if (isReady) {
                    System.out.println("Throwing Ball");
                    totalBalls--;
                    System.out.println("Balls left: " + totalBalls);
                }
            } while (totalBalls > 0);
            System.out.print("No more Balls!\n-----------------------\nEnter number of balls to refill or 0 to stop");
            totalBalls = s.nextInt();
            if (totalBalls == 0) {
                play = false;
            }
        }
    }
}

