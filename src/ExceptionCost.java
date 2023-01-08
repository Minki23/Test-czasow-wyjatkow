import java.util.Random;

class ExceptionCostExperimentTryCatch {
    private static final int NUM_ITERATIONS = 10000;
    private static final int ARRAY_SIZE = 1000;
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {

        long startTime, endTime;
        int[] array = new int[ARRAY_SIZE];

        // Eksperyment dla obsługi wyjątku try-catch
        startTime = System.nanoTime();
        for (
                int i = 0;
                i < NUM_ITERATIONS; i++) {
            try {
                int index = RANDOM.nextInt(ARRAY_SIZE + 1);
                int value = array[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        endTime = System.nanoTime();
        long tryCatchCost = endTime - startTime;
        System.out.println(" Czas wykonania metody z obsługą wyjątku try-catch: " + tryCatchCost + " nanosekund");
    }
}