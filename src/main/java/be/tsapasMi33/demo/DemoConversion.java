package be.tsapasMi33.demo;

public class DemoConversion {
    public static void main(String[] args) {
        int nb = 42;
        String myString = String.valueOf(nb);
        int myInt = Integer.parseInt(myString);
        float myFloat = (float) myInt;

        Integer nb2 = 42;
        myString = nb2.toString();
        nb = nb2;
        nb2 = nb;
    }
}
