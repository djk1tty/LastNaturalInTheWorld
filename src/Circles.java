import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Circles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int circles = 0;
        int count = 0;

        Random random = new Random();
        System.out.println("Введите колличество чисел: ");

        count = scanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9 - 0 + 1) + 0;
        }
        System.out.print(Arrays.toString(arr));

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 6) {
                circles += 1;
            }
            if (arr[x] == 8) {
                circles += 2;
            }
            if (arr[x] == 9) {
                circles += 1;
            }
            if (arr[x] == 0) {
                circles += 1;
            }
        }
        System.out.println(" ");
        System.out.print(circles);
    }
}
