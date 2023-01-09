public class Main {
    public static void main(String[] args){
        long throwCost, startTime,endTime;
        initial();
        new InBounds(100);
        new InBounds(1000);
        new InBounds(10000);
        new TryOutOfBounds(100);
        new TryOutOfBounds(1000);
        new TryOutOfBounds(10000);
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            try {
                new OutOfBoundsThrow();
            }catch (Exception ignored){}
        }
        endTime = System.nanoTime();
        throwCost = endTime - startTime;
        System.out.print("OutOfBoundsThrow:");
        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwCost + " nanosekund dla 100 iteracji");
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            try {
                new OutOfBoundsThrow();
            }catch (Exception ignored){}
        }
        endTime = System.nanoTime();
        throwCost = endTime - startTime;
        System.out.print("OutOfBoundsThrow:");
        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwCost + " nanosekund dla 1000 iteracji");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            try {
                new OutOfBoundsThrow();
            }catch (Exception ignored){}
        }
        endTime = System.nanoTime();
        throwCost = endTime - startTime;
        System.out.print("OutOfBoundsThrow:");
        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwCost + " nanosekund dla 10000 iteracji");
        new ArithmeticException(100);
        new ArithmeticException(1000);
        new ArithmeticException(10000);
        new TryArithmeticException(100);
        new TryArithmeticException(1000);
        new TryArithmeticException(10000);
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            try {
                new ArithmeticExceptionThrow();
            }catch (Exception e){e.printStackTrace();}
        }
        endTime = System.nanoTime();
        throwCost = endTime - startTime;
        System.out.print("ArithmeticExceptionThrow" + ":");
        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwCost + " nanosekund dla " + 100+ " iteracji");
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            try {
                new ArithmeticExceptionThrow();
            }catch (Exception e){e.printStackTrace();}
        }
        endTime = System.nanoTime();
        throwCost = endTime - startTime;
        System.out.print("ArithmeticExceptionThrow" + ":");
        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwCost + " nanosekund dla " + 1000+ " iteracji");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            try {
                new ArithmeticExceptionThrow();
            }catch (Exception ignored){}
        }
        endTime = System.nanoTime();
        throwCost = endTime - startTime;
        System.out.print("ArithmeticExceptionThrow" + ":");
        System.out.println("Czas wykonania metody z obsługą wyjątku throws: " + throwCost + " nanosekund dla 10000 iteracji");
    }
    public static void initial() {
        try {
            new ArithmeticExceptionThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            new OutOfBoundsThrow();
        } catch (IndexOutOfBoundsException ignored) {
        }
    }
}
