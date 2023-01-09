public class InBounds {
        private static final int ARRAY_SIZE = 100;
        public InBounds(int NUM_ITERATIONS) {
            long startTime, endTime;
            int[] array = new int[ARRAY_SIZE];
            startTime = System.nanoTime();
            for (int i = 0; i < NUM_ITERATIONS; i++) {
                    int value = array[array.length-1];
                }
            endTime = System.nanoTime();
            long tryCatchCost = endTime - startTime;
            System.out.print(getClass()+":");
            System.out.println("Czas wykonania metody " + tryCatchCost + " nanosekund dla "+NUM_ITERATIONS+" iteracji");
        }
    }
