import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Генератор случайных чисел");
        System.out.println("=========================");

        Random random = new Random();

        // Генерация 5 случайных чисел от 1 до 100
        System.out.println("5 случайных чисел от 1 до 100:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Число " + (i + 1) + ": " + randomNumber);
        }
        // Сортировка чисел
        Arrays.sort(numbers);

        System.out.println("\nОтсортированные числа:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Число " + (i + 1) + ": " + numbers[i]);
        }
    }
}