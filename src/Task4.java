import java.util.Scanner;
public class Task4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d");
            System.out.print("Введите k число: ");
            int k = scanner.nextInt();
            System.out.print("Введите d число: ");
            int d = scanner.nextInt();

            System.out.println(recursia2(k, d, true));
        }


        private static int recursia2(int k, int d, boolean isFirstDigit) {
            if (k == 0) return d == 0 ? 1 : 0;
            int count = 0;

            int start = isFirstDigit ? 1 : 0;

            for (int digit = start; digit <= 9; digit++) {
                if (d - digit >= 0) {
                    count += recursia2(k - 1, d - digit, false);
                }
            }
            return count;
        }
    }

