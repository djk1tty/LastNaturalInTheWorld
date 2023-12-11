import java.util.Arrays;
import java.util.Scanner;

public class taskB {
    public static void main(String[] args) {

    //Вводим число A
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите A: ");
        int A = sc.nextInt();
        sc.close();

    // Создаем массив
        int[] arr = {1, 2, 3, 4, 5};

    for(int i = 0;i < arr.length; i++){
        arr[i] -= A;
    }


    // Выводим результат
        System.out.println("Результат: " + Arrays.toString(arr));
    }
}