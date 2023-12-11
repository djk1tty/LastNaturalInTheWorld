import java.util.Random;
import java.util.Scanner;

public class carindex {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int maxindex = 0;

        int count = 40;

        int[] speed = new int[count];

        for (int i = 0; i < speed.length; i++) {

            speed[i] = random.nextInt(  300 - 190 + 1 ) + 190;
            System.out.print(String.format("Максимальная скорость %d автомобиля: ", i + 1));
            System.out.println(speed[i]);
        }

        for (int i = 0; i < speed.length; i++) {

            if (speed[i] > speed[maxindex]) {
                maxindex = i;
            }
        }
        maxindex++;
        System.out.println(" ");
        System.out.print(String.format("Максимальная скорость у автомобиля под номером: %d ", maxindex));
    }
}