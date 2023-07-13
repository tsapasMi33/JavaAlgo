package be.tsapasMi33.exercises;

import java.util.Scanner;

public class RemoveFromArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter table size: ");
        int size = s.nextInt();
        int[] table = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter number #" + (i+1));
            table[i] = s.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int j = i;
            while (j > 0){
                if (table[j] < table[j-1]) {
                    int temp = table[j];
                    table[j] = table[j - 1];
                    table[j - 1] = temp;
                }
                j--;
            }
        }

        for(int i = 0; i < size; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();


        System.out.print("Enter index to delete: ");
        int index = s.nextInt();

        for (int i = index; i < size - 1; i++) {
            table[i] = table[i+1];
        }
        size--;

        for(int i = 0; i < size; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();

    }
}
