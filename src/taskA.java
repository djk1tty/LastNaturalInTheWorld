import java.util.Arrays;

public class taskA {
    public static void main(String[] args) {
    // Создаем массив
        int[] arr = {1, 2, 3, 4, 5};

    // Делим все элементы на 2 и обновляем массив
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] / 2;
        }

    // Выводим результат
        System.out.println("Результат: " + Arrays.toString(arr));
    }
}
