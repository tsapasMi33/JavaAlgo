package be.tsapasMi33.demo;

public class DemoLoops {

    public static void main(String[] args) {
        int count =0;
        while (count < 10){
            System.out.println("Hi!" + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Hi!" + count);
            count++;
        } while (count <10 );

        for (int i = 0; i < 10; i++) {
            System.out.println("Hi!" + i);
        }
    }
}
