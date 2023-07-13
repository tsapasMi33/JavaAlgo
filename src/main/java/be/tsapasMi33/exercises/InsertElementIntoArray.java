package be.tsapasMi33.exercises;

import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] table = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Enter number #" + (i+1));
            table[i] = s.nextInt();
        }

        for (int i = 0; i < 5; i++) {
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

        for(int i = 0; i < 5; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();


        System.out.print("Enter value to insert: ");
        int value = s.nextInt();
        for (int i = 0; i < 5; i++) {
            if (value < table[i]){
                int temp = table[i];
                table[i] = value;
                value = temp;
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.print(table[i] + " ");
        }
    }
}
