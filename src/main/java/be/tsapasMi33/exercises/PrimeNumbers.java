package be.tsapasMi33.exercises;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = s.nextInt();
        int found = 0;
        int toTest = 2;
        while (found < length){
            boolean isPrime = true;
            for (int i = 3; i <= Math.sqrt(toTest) && isPrime; i++){ //In case of using the square root of the number as a
                if (toTest % i == 0) {                               // stop condition obliged to test smaller or equal
                    isPrime = false;                                 // otherwise we receive only sqrts;
                }
            }
            if (isPrime){
                System.out.println(toTest);
                found++;
            }
            toTest+=2;
        }
    }
}
