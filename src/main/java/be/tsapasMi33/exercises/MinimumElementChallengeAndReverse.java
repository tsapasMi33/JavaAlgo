package be.tsapasMi33.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallengeAndReverse {
    public static void main(String[] args) {

        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        System.out.println("Min value = " + findMin(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        String arg = new String();

        System.out.println("Enter a list of integers separated by commas: ");
        arg = s.nextLine();

        String[] splits = arg.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
