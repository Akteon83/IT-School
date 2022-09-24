import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n / 3600;
        int b = n % 3600 / 60;
        int c = n % 60;
        System.out.print(a + ":");
        if (b < 10) {
            System.out.print("0");
        }
        System.out.print(b + ":");
        if (c < 10) {
            System.out.print("0");
        }
        System.out.println(c);
    }
}
