package be.tsapasMi33.demo;

public class ExecutionTimer {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            // Do something
        }
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
