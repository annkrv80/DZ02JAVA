import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) throws Exception {

        Task arr = new Task();
        arr.printer();
        arr.Bubbles();
        arr.printer();
    }
}

class Task {
    int n;
    int[] array;

    Task() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        try {
            n = in.nextInt();
            array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 100));
            }
            in.close();
        } catch (Exception e) {
            System.out.print("Пользователь ввел не число!");
        }

    }

    public void printer() {

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("  ");
    }

    public void Bubbles() {
        int box = 0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    box = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = box;
                }

            }
        }
    }
}

