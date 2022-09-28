import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Задание - 1.
        System.out.println("Задание - 1.");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

//        Задание - 2.
        System.out.println("Задание - 2.");
        int min = 200_000;
        int max = 100_000;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

//        Задание - 3.
        System.out.println("Задание - 3.");
        var average = 1.0 * sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

//        Задание - 4.
        System.out.println("Задание - 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char x = reverseFullName[i];                                  //для краткости и удобства
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = x;
        }
        System.out.println(reverseFullName);

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}