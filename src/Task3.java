import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа выводит последовательность числел от A до B (используя рекурсию)" );

        System.out.print("Введите 1 число: ");
        int A = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        int B = scanner.nextInt();

        recursia1(A, B);
    }

    private static void recursia1(int A, int B) {
        System.out.print(A + " ");
        if (A == B) return;
        if (A < B) recursia1(A + 1, B);
        else recursia1(A - 1, B);
    }
}

