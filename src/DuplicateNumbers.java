import java.lang.reflect.Array;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        deleteDuplicateNumbers(array);
    }

    private static void deleteDuplicateNumbers(int[] array) {
        int newSize = array.length;
        int temp = array[0];
        int[] array2;
        array2 = new int[newSize];


        for (int i = 1; i < array.length; i++) {
            if (array[i] == temp) {
                System.arraycopy();
            }
        }
    }
}
