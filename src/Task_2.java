import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        int length = String.valueOf(Math.abs(a)).length();
        for (int i = 0; i < length; ++i) {
            b += a % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i) * Math.pow(10, length - i - 1);
        }
        System.out.println(b);
    }
}
