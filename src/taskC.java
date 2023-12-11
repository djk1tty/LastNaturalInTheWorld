import java.util.Arrays;

public class taskC {
    public static void main(String[] args) {
        // Создаем массив
        int[] arr = {2, 3, 4, 5, 6};
        int a = arr[0];


        // Делим все элементы на первый элемент и обновляем массив
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] / a;
        }

        // Выводим результат
        System.out.println("Результат: " + Arrays.toString(arr));
    }
}