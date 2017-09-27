import java.util.Random;

public class ClassTest {
    public static void main(String[] args) {
        //Random random = new Random();
        int[][] array = new int[11][11];
        for (int i = 0; i < array.length ; i++) {
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
                array[array.length - 1 - i][j] = 1;
            }
        }
        for (int[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + " ");
            }
            System.out.println();
        }
    }
}
