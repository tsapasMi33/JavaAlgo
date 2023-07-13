package be.tsapasMi33.exercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial *= i;

        }
        System.out.println(factorial);

        // recursive version
        System.out.println(factoRecursive(6));
    }

    public static int factoRecursive(int num) {
        if (num == 0)
            return 1;
        return num * factoRecursive(num - 1);
    }
}
