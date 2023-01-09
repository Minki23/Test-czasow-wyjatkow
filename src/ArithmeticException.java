public class ArithmeticException {
    public ArithmeticException(int NUM_ITERATIONS) {
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
                int value = 1 / 1;
            }
        endTime = System.nanoTime();
        long tryCatchCost = endTime - startTime;
        System.out.print(getClass() + ":");
        System.out.println(" Czas wykonania metody " + tryCatchCost + " nanosekund dla " + NUM_ITERATIONS + " iteracji");
    }
}
