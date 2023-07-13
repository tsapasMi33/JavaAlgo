package be.tsapasMi33.demo;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomSortCopyOf {
    public static void main(String[] args) {
        int[] first = getRandomArray(10,100);
        System.out.println(Arrays.toString(first));

        Arrays.sort(first);
        System.out.println(Arrays.toString(first));

        int[] second = new int[10];
        System.out.println(Arrays.toString(second));
        Arrays.fill(second,5);
        System.out.println(Arrays.toString(second));

        int[] third = getRandomArray(10,100);
        System.out.println(Arrays.toString(third));

        int[] fourth = Arrays.copyOf(third, third.length);
        Arrays.sort(fourth);
        System.out.println(Arrays.toString(fourth));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"Mark") >= 0) {
            System.out.println("Mark found");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays not equal");
        }
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
