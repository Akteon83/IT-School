import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        int b = 1;
        int c;
        if (N <= 2) {
            System.out.println(1);
        } else {
            for (int i = 0; i < N - 2; ++i) {
                c = b + a;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }
}
