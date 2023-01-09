import java.util.Random;

public class OutOfBoundsThrow {
    private static final int ARRAY_SIZE = 100;
    public OutOfBoundsThrow() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[ARRAY_SIZE];
        int element = array[array.length];
    }
}