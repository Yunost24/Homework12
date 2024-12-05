import java.util.Scanner;
public class Task5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Дано натуральное число N. Вычислите сумму его цифр.");

            System.out.print("Введите число N: ");
            int N = scanner.nextInt();

            System.out.println(recursia3(N));
        }

        // Рекурсивный метод для вычисления суммы цифр
        private static int recursia3(int N) {
            if (N == 0) return 0;
            return N % 10 + recursia3(N / 10);
        }
    }

