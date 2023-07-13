package be.tsapasMi33.exercises;

import java.util.Scanner;

public class NumberComparison3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1st number: ");
        int first = s.nextInt();
        System.out.print("Second number: ");
        int second = s.nextInt();
        System.out.print("Third number: ");
        int third = s.nextInt();
        int fo,so,to;
        if (first <= second && second <= third) {
            fo = first;
            so = second;
            to = third;
        } else if (first <= second && third <= second) {
            fo = first;
            so = third;
            to = second;
        } else if (third <= first && first <= second) {
            fo = third;
            so = first;
            to = second;
        } else if (third <= second && second <= first) {
            fo = third;
            so = second;
            to = first;
        } else if (second <= first && first <= third) {
            fo = second;
            so = first;
            to = third;
        } else {
            fo = second;
            so = third;
            to = first;
        }
        System.out.println(fo + (fo == so ? "=" : "<") + so + (so == to ? "=" : "<") + to);

        String out = "";
        if (first <= second && first <= third) {
            out += first;
            if (second <= third){
                out += first == second ? "=" : "<";
                out += second;
                out += second == third ? "=" : "<";
                out += third;
            } else {
                out += first == third ? "=" : "<";
                out += third;
                out += third == second ? "=" : "<";
                out += second;
            }
        } else if (second <= first && second <= third) {
            out += second;
            if (first <= third) {
                out += second == first ? "=" : "<";
                out += first;
                out += first == third ? "=" : "<";
                out += third;
            } else {
                out += second == third ? "=" : "<";
                out += third;
                out += third == first ? "=" : "<";
                out += first;
            }
        } else {
            out += third;
            if (first <= second) {
                out += third == first ? "=" : "<";
                out += first;
                out += first == second ? "=" : "<";
                out += second;
            } else {
                out += third == second ? "=" : "<";
                out += second;
                out += second == first ? "=" : "<";
                out += first;
            }
        }
        System.out.println(out);

    }
}
