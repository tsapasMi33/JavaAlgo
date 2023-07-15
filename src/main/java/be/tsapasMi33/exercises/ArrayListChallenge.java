package be.tsapasMi33.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> myList= new ArrayList<>();

        boolean quit = false;
        while (!quit) {
            System.out.println("-".repeat(25));
            System.out.println(myList);
            System.out.println("-".repeat(25));
            System.out.print("Available actions:\n0 - shutdown\n1 - to add item(s) to list (comma delimited list)\n2 - to remove any items (comma delimited list)\nChoose an action: ");
            switch (Integer.parseInt(s.nextLine())){
                case 0 -> quit = true;
                case 1 -> {
                    String toAdd = s.nextLine();
                    List<String> list = List.of(toAdd.split(","));
                    for (String el : list) {
                        if (!myList.contains(el.trim())) {
                            myList.add(el.trim());
                        }
                    }
                    myList.sort(Comparator.naturalOrder());
                }
                case 2 -> {
                    String toRemove = s.nextLine();
                    List<String> list = List.of(toRemove.split(","));
                    myList.removeAll(list);
                }
                default -> System.out.println("Bad Input!");
            }
        }
    }
}
