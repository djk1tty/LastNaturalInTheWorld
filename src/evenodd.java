

public class Main5 {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 28, 3, 7, 29, 85, 90, 45, 12, 63, 24, 126};


    for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                System.out.print("Четные числа: ");
                System.out.println(numbers[i]);
            }
        }
        System.out.println(" ");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0){

                System.out.print("Нечетные числа: ");
                System.out.println(numbers[i]);
            }
        }
    }

}