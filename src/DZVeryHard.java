import java.util.Random;
import java.util.Arrays;

public class DZVeryHard {
    public static void main(String[] args) {

        int[] arr1 = new int[20];
        int[] arr2 = new int[20];

        Random r = new Random();

        for (int x = 0; x < arr1.length; x++) {
            arr1[x] = r.nextInt(10);
            arr2[x] = r.nextInt(10);
        }

        System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));

        int[] arr3 = new int[20];

        for (int x = 0; x < arr1.length; x++) {
            arr3[x] = (arr1[x] + arr2[x]);
        }

        System.out.println(Arrays.toString(arr3));
    }
}