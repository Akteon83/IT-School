import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[] mass = new byte[n / 8 + Boolean.compare(n % 8 != 0, false)];
        for (int i = 0; i < n; ++i) {
            int bol = (in.nextBoolean() ? 1 : 0);
            byte rick = (byte) (bol << (i % 8));
            mass[i / 8] = (byte) (mass[i / 8] | rick);
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(((mass[i / 8] & (1 << (i % 8))) != 0) + " ");
        }
    }
}
