import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int action = 0;
        int countRows = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите решаемую задачу 1,2: ");
        action = scanner.nextInt();

        switch (action) {
            case 1:

                for (int i = 1; i <= countRows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = countRows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
        }
    }
}
