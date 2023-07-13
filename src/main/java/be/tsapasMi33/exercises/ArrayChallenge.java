package be.tsapasMi33.exercises;

import java.util.Arrays;
import java.util.Random;

//Create an array of random ints
//Print the array
//Sort
//Print
//Sort descending
//Print
public class ArrayChallenge {
    public static void main(String[] args) {
        int[] arr = getRandomArray(10,100);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }

    private static int[] getRandomArray(int len, int limit) {
        Random random = new Random();
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++){
            newArr[i] = random.nextInt(limit);
        }
        return newArr;
    }
}
