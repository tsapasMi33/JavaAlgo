package be.tsapasMi33.exercises;

import java.util.Scanner;

public class ArrayFusion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter table 1 size: ");
        int size1 = s.nextInt();
        int[] table1 = new int[size1];

        for(int i = 0; i < size1; i++){
            System.out.println("Enter number #" + (i+1));
            table1[i] = s.nextInt();
        }

        for (int i = 0; i < size1; i++) {
            int j = i;
            while (j > 0){
                if (table1[j] < table1[j-1]) {
                    int temp = table1[j];
                    table1[j] = table1[j - 1];
                    table1[j - 1] = temp;
                }
                j--;
            }
        }

        System.out.println("Enter table 2 size: ");
        int size2 = s.nextInt();
        int[] table2 = new int[size2];

        for(int i = 0; i < size2; i++){
            System.out.println("Enter number #" + (i+1));
            table2[i] = s.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            int j = i;
            while (j > 0){
                if (table2[j] < table2[j-1]) {
                    int temp = table2[j];
                    table2[j] = table2[j - 1];
                    table2[j - 1] = temp;
                }
                j--;
            }
        }

        System.out.println("Table 1: ");
        for(int i = 0; i < size1; i++){
            System.out.print(table1[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < size2; i++){
            System.out.print(table2[i] + " ");
        }
        System.out.println();

        int sizeFusion = size1 + size2;
        int[] tableFusion = new int[sizeFusion];

        int i=0,j =0, k = 0;
        while (i < sizeFusion) {
            try {
                if (table1[j] <= table2[k]){
                    tableFusion[i] = table1[j];
                    j++;
                    i++;
                }
                if (table2[k] <= table1[j]) {
                    tableFusion[i] = table2[k];
                    k++;
                    i++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (j < size1){
                    tableFusion[i] = table1[j];
                    k++;
                    i++;
                } else if (k < size2){
                    tableFusion[i] = table2[k];
                    k++;
                    i++;
                }
            }
        }


       /* int k = 0;
        for (int i = 0; i <size1; i++){
            tableFusion[k] = table1[i];
            k++;
        }
        for (int i = 0; i < size2; i++){
            tableFusion[k] = table2[i];
            k++;
        }

        for (int i = 0; i < sizeFusion; i++) {
            int j = i;
            while (j > 0){
                if (tableFusion[j] < tableFusion[j-1]) {
                    int temp = tableFusion[j];
                    tableFusion[j] = tableFusion[j - 1];
                    tableFusion[j - 1] = temp;
                }
                j--;
            }
        }*/

        for(int ii = 0; ii < sizeFusion; ii++){
            System.out.print(tableFusion[ii] + " ");
        }
        System.out.println();
    }
}
