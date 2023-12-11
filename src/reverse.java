import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 2, 9};

        for(int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - i - 1];

            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Реверс-массив: " + Arrays.toString(arr));
    }
}