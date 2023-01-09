public class TryArithmeticException {
    public TryArithmeticException(int NUM_ITERATIONS) {
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            try {
                double value = 1.0 / 0.0;
            } catch (Exception ignored) {
            }
        }
        endTime = System.nanoTime();
        long tryCatchCost = endTime - startTime;
        System.out.print(getClass() + ":");
        System.out.println("Czas wykonania metody z obsługą wyjątku try-catch: " + tryCatchCost + " nanosekund dla " + NUM_ITERATIONS + " iteracji");
    }
}
