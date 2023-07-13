package be.tsapasMi33.demo;

public class DemoOperators {
    public static void main(String[] args) {
        int nb1 = 5, nb2 = 3, result;
        result = nb1 + nb2;
        System.out.println(nb1 + " + " + nb2 + " = " + result);

        result = nb1 - nb2;
        System.out.println(nb1 + " - " + nb2 + " = " + result);

        result = nb1 * nb2;
        System.out.println(nb1 + " * " + nb2 + " = " + result);

        result = nb1 / nb2;
        System.out.println(nb1 + " / " + nb2 + " = " + result);

        result = nb1 % nb2;
        System.out.println(nb1 + " % " + nb2 + " = " + result);

        double res = (double) nb1 / nb2;
        System.out.println(nb1 + " / " + nb2 + " = " + res);
    }
}
