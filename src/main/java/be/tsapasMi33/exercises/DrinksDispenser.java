package be.tsapasMi33.exercises;

import java.util.Scanner;

public class DrinksDispenser {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p01 = 4, p02 = 2, p03 = 2, p04 = 1, p05 = 4;

        boolean isOver = false;
        System.out.println("Welcome to the drinks distributor!!");

        while (!isOver){
            System.out.println("____________________________________________________________________________");
            System.out.print("Choose drink\n1:Coca\n2:Fanta\n3:Sprite\n4:Red Bull\n5:Oasis\n-1 to exit\n");
            int choice = s.nextInt();
            System.out.println(switch (choice){
                case 1 -> {
                    if (p01 > 0){
                        p01--;
                        yield "Coca out";
                    }
                    yield "No more Coca";
                }
                case 2 -> {
                    if (p02 > 0){
                        p02--;
                        yield "Fanta out";
                    }
                    yield "No more Fanta";
                }
                case 3 -> {
                    if (p03 > 0){
                        p03--;
                        yield "Sprite out";
                    }
                    yield "No more Sprite";
                }
                case 4 -> {
                    if (p04 > 0){
                        p04--;
                        yield "Red Bull out";
                    }
                    yield "No more Red Bull";
                }
                case 5 -> {
                    if (p05 > 0){
                        p05--;
                        yield "Oasis out";
                    }
                    yield "No more Oasis";
                }
                case -1 -> {
                    isOver = true;
                    yield "Thank you!";
                }
                default -> "Bad Input!";
            });
        }
    }
}
