import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = N % 10 + N % 100 / 10 + N / 100;
        int b = N + 2 - N % 2;
        System.out.println(a + " " + b);
    }
}