import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N <= 14 && N >= 11) {
            System.out.println(N + " TORTOV");
        } else {
            switch (N % 10) {
                case 1 -> System.out.println(N + " TORT");
                case 2, 3, 4 -> System.out.println(N + " TORTA");
                default -> System.out.println(N + " TORTOV");
            }
        }
    }
}
