import java.util.Random;

public class ExceptionCostExperiment {
    private static final int NUM_ITERATIONS = 10000;
    private static final int ARRAY_SIZE = 1000;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws Exception {
        long startTime, endTime;
        int[] array = new int[ARRAY_SIZE];

        // Eksperyment dla obsługi wyjątku throws
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            int index = RANDOM.nextInt(ARRAY_SIZE + 1);
            readArrayElement(array, index);
        }
        endTime = System.nanoTime();
        long throwsCost = endTime - startTime;

        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwsCost + " nanosekund");
    }

    public static void readArrayElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        try {
            int element = array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw e;
            } catch (ArrayIndexOutOfBoundsException f) {
                f.printStackTrace();
            }
        }
    }
}
